package class1;
		
public class ObserverPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject s=new Subject();
		new BinaryObserver(s);
		System.out.println("Setting Number as 15");
		s.setState(15);
	}

}
