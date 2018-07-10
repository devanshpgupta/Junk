//Concat Streams
package practice;
import java.util.*;
import java.util.stream.Stream;
public class question1 {
public static void main(String args[])
{
	Stream<String> str1=Stream.of("D","e","v");
	Stream<String> str2=Stream.of("a","n","s","h");
Stream<String> concat=Stream.concat(str1,str2);
concat.forEach(System.out::print);
}
}
