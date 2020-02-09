package interview.gs.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CHeckDead {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		String abc[] = input.split(" ");
		List<Integer> inputSet = new ArrayList<Integer>();
		for (String str : abc) {
			inputSet.add(Integer.parseInt(str));
		}
		Collections.sort(inputSet);
		List<Integer> backup = new ArrayList<>(inputSet);
		int soldiersSaved = 0;
		for (int i = backup.size() - 1; i >= 0; i--) {
			if (inputSet.contains(backup.get(i))) {
				if (inputSet.contains(backup.get(i) - 1))
					inputSet.remove(inputSet.indexOf(backup.get(i) - 1));
				if (inputSet.contains(backup.get(i) + 1))
					inputSet.remove(inputSet.indexOf(backup.get(i) + 1));
				soldiersSaved += backup.get(i);
			}
		}
		System.out.println(soldiersSaved);
	}

}
