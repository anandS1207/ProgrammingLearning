package gs.coding.problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FormMinimumNumberOfSequence {
	public static void main(String args[]) {
		List<String> results = getResult("DIDDI");
		for (String str : results)
			System.out.println(str);
	}

	public static List<String> getResult(String arr) {
		Set<Integer> checkingUnique;
		List<String> possibleResults = new ArrayList<String>();
		for (int i = 1; i <= 9; i++) {
			checkingUnique = new HashSet<Integer>();
			String str = "";
			int start = i;
			str = str + start;
			checkingUnique.add(start);
			for (int j = 0; j < arr.length(); j++) {
				if (arr.charAt(j) == 'D') {
					while (checkingUnique.contains(start)) {
						start -= 1;
						if (start == 0)
							break;
					}
					if (start > 0 && start <= 9 && !checkingUnique.contains(start)) {
						str += start;
						checkingUnique.add(start);
					} else
						break;
				}
				if (arr.charAt(j) == 'I') {
					while (checkingUnique.contains(start)) {
						start += 1;
						if (start == 9)
							break;
					}
					if (start > 0 && start <= 9 && !checkingUnique.contains(start)) {
						str += start;
						checkingUnique.add(start);
					} else
						break;
				}
			}
			if (str.length() == arr.length() + 1)
				possibleResults.add(str);
		}
		return possibleResults;
	}
}