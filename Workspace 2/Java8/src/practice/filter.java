package practice;
import java.util.*;
import java.util.stream.Collectors;
public class filter {
public static void main(String args[])
{
	//String str="HEEEEE";
List<String> str1=Arrays.asList("asd","","aqweq","qwasd","","sdvasd");
List<String> str2=str1.stream().filter(x->!x.equals("")).collect(Collectors.toList());
//filter(string -> !string.isEmpty())
//	List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
//	List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
	str2.forEach(System.out::println);
}
}
