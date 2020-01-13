package hackerearth.algorithms.searching;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentArrangement {
	public static void main(String srgs[]) {
		Map<Integer, Integer> resultHashmap = new HashMap<>();
		int n, m, k;
		int result = 0;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		m = s.nextInt();
		k = s.nextInt();
		for (int i = 0; i < n; i++) {
			int temp = s.nextInt();
			if (resultHashmap.containsKey(temp)) {
				if (resultHashmap.get(temp) < k) {
					resultHashmap.put(temp, resultHashmap.get(temp) + 1);
				} else {
					boolean found = true;
					int location = temp + 1;
					while (found) {
						if (resultHashmap.containsKey(location)) {
							if (resultHashmap.get(location) < k) {
								result++;
								found = false;
							}
							if (location == m) {
								location = 1;
							}
							if (location == temp) {
								found = false;
								result++;
							}
							location++;
						} else {
							if (location < m) {
								resultHashmap.put(location, 1);
								result++;
								found = false;
							} else {
								result++;
								found = false;
							}
						}
					}
				}
			} else {
				resultHashmap.put(temp, 1);
			}
		}
		System.out.println(result);
	}
}
