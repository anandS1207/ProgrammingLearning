package interview.gs.problems;

import java.util.ArrayList;
import java.util.stream.Stream;

public class TA {
	public static void main(String args[]) {
		ArrayList<Integer> abc = new ArrayList<>();
		abc.add(23);
		abc.add(21);
		abc.add(22);
		abc.add(24);
		abc.add(25);
		abc.add(3);
		Stream<Integer> myStream = abc.stream();
		Stream<Integer> myVals = abc.stream().sorted().filter((n) -> (n % 2) == 1);
		myVals = abc.stream().filter((n) -> (n % 2) == 1).filter((n) -> n > 5);
		myVals.forEach((n) -> System.out.println(n));
	}
}
