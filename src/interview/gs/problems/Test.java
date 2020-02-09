package interview.gs.problems;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {

	public static void main(String args[]) {
		Set<Integer> set = new HashSet<>();
		Iterator<Integer> iterator = set.iterator();
		while (iterator.hasNext()) {
			Integer element = iterator.next();
			if (element % 2 == 0) {
				iterator.remove();
			}

		}
	}

}
