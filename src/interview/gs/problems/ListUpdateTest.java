package interview.gs.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ListUpdateTest {
	public static List<Integer> updateList(List<Integer> list) {
		List<Integer> containItems = new ArrayList<Integer>();
		Set<Integer> temp = new HashSet<Integer>();
		int start = list.get(0);
		temp.add(start);
		int n = list.size();
		for (int i = 0; i < n; i++) {
			if (start < list.get(i)) {
				start = list.get(i);
				temp.add(list.get(i));
			}
		}
		list = new ArrayList<>(temp);
		Collections.sort(list);
		return list;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputStr = scanner.nextLine();
		scanner.close();
		String[] values = inputStr.split("\\s");

		List<Integer> list = new ArrayList<Integer>();
		for (String str : values) {
			list.add(new Integer(str));
		}

		list = updateList(list);

		System.out.println(list);
	}
}