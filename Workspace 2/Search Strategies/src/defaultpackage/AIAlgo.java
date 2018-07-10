package defaultpackage;

import java.util.*;
import java.io.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

class AIAlgo extends JFrame implements ActionListener {

	public static JDesktopPane desktopPane = new JDesktopPane();
	
	public static JTextArea txtAnswer;

	protected static int noNodes;
	protected static String iState;
	protected static HashMap<String, List<Node>> graph = new HashMap<String, List<Node>>();
	public static int opt;
	protected static String oPath;
	public static double Val;
	public static int limit;
	public static long start = System.currentTimeMillis();

	public AIAlgo() {
		setTitle("Anytime A Star");
		setSize(300,500);

		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();

	
		txtAnswer = new JTextArea("Solution");
		txtAnswer.setBounds(10, 40, 200, 400);
		Border border = BorderFactory.createLineBorder(Color.BLACK);	
		txtAnswer.setBorder(BorderFactory.createCompoundBorder(border, 
				BorderFactory.createEmptyBorder(10, 10, 10, 10)));

		add(txtAnswer);
	
		getContentPane().add(desktopPane, BorderLayout.CENTER);
		setMaximizedBounds(getMaximizedBounds());
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		AIAlgo aialgo = new AIAlgo();
		txtAnswer.setText(" ");
		AIAlgo.iState = "a";	
		///Users/Arpit/Desktop/CIS561/Project2
		String name = "C:\\input.txt";

		Parser p = new Parser();
		if(!(p.parseFile(name))){
			return;
		}
		AIAlgo.Val =  2;
		AandStarAlgos A = new AandStarAlgos();
		A.search();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}

class AandStarAlgos extends AIAlgo {

	protected static void output(NodeInfo tourcomplete) {

		try {
			for (String s : tourcomplete.path) {
				txtAnswer.setText(txtAnswer.getText() + "\n" + " " + s);
			}

			
			if(AIAlgo.Val != Double.NaN){
				System.out.println("Val:" + (AIAlgo.Val) + "\n");
			}
			long stop = System.currentTimeMillis();
			double eTime = (stop - AIAlgo.start);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	int cnt = 0;


	PriorityQueue<NodeInfo> FIFO = new PriorityQueue<NodeInfo>(1,new Compare() {
		@Override
		public int compare(NodeInfo o1, NodeInfo o2) {
			return Double.valueOf(o1.f).compareTo(o2.f);
		}
	});

	Node child;
	List<Node> childList;
	NodeInfo childNote, end;
	NodeInfo node;
	double costG, costH;
	List<String> explored = new ArrayList<String>();
	List<String> current = new ArrayList<String>();


	private double mheuristicCost(NodeInfo child) {
		double h = 0.0;
		explored.clear();
		current.clear();
		List<Node> pNodes;
		double min = 0.0;
		String minNode = null;

		for(String s: child.path){
			if(!s.equals(AIAlgo.iState)){
				explored.add(s);
			}
		}

		current.add(child.nodeName);
		explored.add(child.nodeName);


		while(explored.size() <= (AIAlgo.noNodes - 1)){

			min = 9.9;
			for(String s:current){
				pNodes = AIAlgo.graph.get(s);
				for(Node p: pNodes){
					if(!explored.contains(p.name)){
						if(p.sld < min){
							min = p.sld;
							minNode = p.name;
						}
					}

				}

			}

			explored.add(minNode);
			current.add(minNode);
			h += min;
		}

		return h;
	}

	private void addChildren(List<Node> children, boolean last) {
		int i = 0;
		if (last == false) {
			while (i < children.size()) {

				child = children.get(i);


				if (!(node.path.contains(child.name))) {


					costG = child.sld + node.g;
					costH = 0.0;

					childNote = new NodeInfo(child.name, node.path, costG,costH);
					childNote.path.add(node.nodeName);

					costH = mheuristicCost(childNote);
					childNote.h = costH;
					childNote.f = (((1-AIAlgo.Val)*costG) + (AIAlgo.Val*costH));
					FIFO.add(childNote);
				}
				i++;
			}
		} else {

			int j = 0;
			while (j < children.size()) {
				double costG = 0.0;
				child = children.get(j);
				if (child.name.equals(AIAlgo.iState)) {
					costG = child.sld + node.g;
					end = new NodeInfo(child.name, node.path, costG);
					end.path.add(node.nodeName);
					end.path.add(child.name);
					end.f = end.g + end.h;
					break;
				}
				j++;
			}
		}
	}

	public void search() {
		node = new NodeInfo(AIAlgo.iState); 

		FIFO.add(node);
		node.h = mheuristicCost(node);
		node.f = (((1-AIAlgo.Val)*node.g) + (AIAlgo.Val*node.h));


		while (true) {


			if (FIFO.peek() == null) {
				return;
			}
			node = FIFO.remove();

			if (node.path.size() == (AIAlgo.noNodes - 1)) {


				childList = AIAlgo.graph.get(node.nodeName);
				addChildren(childList, true);

				output(end);
				return;
			} else {


			}

			childList = AIAlgo.graph.get(node.nodeName);
			addChildren(childList, false);

		}

	}
}

class Parser{

	private String FilePath;

	List<Node> value =null;
	List<Point> points = new ArrayList<Point>();

	public boolean parseFile(String path){

		String[] str = null;
		FilePath = path;

		try{

			FileReader file = new FileReader(FilePath);
			Scanner scanner = new Scanner(file);														

			while(scanner.hasNextLine()){

				String line = scanner.nextLine();
				str = line.split(",");


				Point p = new Point(str[0],Double.parseDouble(str[1]),Double.parseDouble(str[2]));

				points.add(p);
			}

			AIAlgo.noNodes = points.size();
			scanner.close();
			createMap(points);
		}catch(IOException e){

			return false;

		}
		return true;
	}

	public void createMap(List<Point> list){

		double sdistance = 0;

		for(Point p:list){

			for(Point q:list){

				if(!p.name.equals(q.name)){

					sdistance = Math.sqrt(Math.pow(p.x - q.x, 2.0) + Math.pow(p.y - q.y, 2.0));


					Node n = new Node(q.name,sdistance);

					value = AIAlgo.graph.get(p.name);

					if (value == null){
						value = new ArrayList<Node>();
						value.add(n);
						AIAlgo.graph.put(p.name,value);
					}else{
						value.add(n);
					}
				}
			}
		}
	}
}

class Point {
	protected final String name;
	protected  double x;
	protected  double y;

	public Point(String name ,double x, double y){
		this.name = name;
		this.x = x;
		this.y = y;
	}
}

class Compare implements Comparator<NodeInfo>{
	@Override
	public int compare(NodeInfo n1, NodeInfo n2){
		return 0;
	}

}

class Node{

	protected String name;
	protected double sld = 0;

	public Node(String name,double sld){
		this.name = name;
		this.sld = sld;
	}
}

class NodeInfo {
	String nodeName;
	ArrayList<String> path = new ArrayList<String>();

	double g;

	double h;

	double f;

	String parentName;
	public NodeInfo(String nodeName, ArrayList<String>path,double g){
		this.nodeName = nodeName;
		this.g = g;
		for(String s:path){
			this.path.add(s);
		}
		this.h = 0.0;
	}

	public NodeInfo(String nodeName, ArrayList<String>path,double g,double h){

		this.nodeName = nodeName;
		this.g = g;
		for(String s:path){
			this.path.add(s);
		}
		this.h = h;
	}
	public NodeInfo(String nodeName){
		this.nodeName = nodeName;
		this.g = 0.0;
		this.h = 0.0;
	}

	public NodeInfo(String nodeName,double g){
		this.nodeName = nodeName;
		this.g = g;
		this.h = 0.0;
		this.f= 0.0;

	}

	public NodeInfo(List<Node> child, Object node, Object gcost, Object hcost) {
	}

}
/*REFERENCES*/
//https://code.google.com/p/a-star-algorithm-implementation/
//http://www.findbestopensource.com/product/a-star-algorithm-implementation
//https://github.com/tuxmonteiro/AlgoSmartJForex/blob/master/examples/SMACrossover.java

