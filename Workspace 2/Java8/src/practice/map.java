package practice;
import java.util.*;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;
public class map {

	public static void main(String args[])
	{
	List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
	//get list of unique squares
	List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
	squaresList.forEach(System.out::println);
	}

}
