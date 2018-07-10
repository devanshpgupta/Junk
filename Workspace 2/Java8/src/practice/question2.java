package practice;
import practice.Book;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class question2 {
public static void main(String args[])
{
	List<Book> list1=new ArrayList<Book>();
	List<Book> list2=new ArrayList<Book>();
	list1.add(new Book("v",1));
	list1.add(new Book("w",2));
	list1.add(new Book("x",3));
	list1.add(new Book("y",4));
	list1.add(new Book("z",5));
	list2.add(new Book("v",1));
	list2.add(new Book("b",2));
	list2.add(new Book("x",3));
	list2.add(new Book("d",4));
	list2.add(new Book("z",5));
	List<Book> l=Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
	l.forEach(e->System.out.println(e.getName()+" "+e.getPrice()));
	  System.out.println("--Remove duplicates using distinct()--");
      l = Stream.concat(list1.stream(), list2.stream()).distinct().collect(Collectors.toList());
      l.forEach(b->System.out.println(b.getName()+", "+ b.getPrice()));     
}


}
