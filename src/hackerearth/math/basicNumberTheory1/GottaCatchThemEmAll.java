package hackerearth.math.basicNumberTheory1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GottaCatchThemEmAll {

	public static void main(String[] args) {
		int t;
		Scanner s = new Scanner(System.in);
		Map<Integer, Integer> result = new HashMap<>();
		t = s.nextInt();
		int n = s.nextInt();
		for (int i = 1; i < n; i++)
			result.put(i, getFactors(i));
		for (int i = 0; i < t; i++) {
			int temp = s.nextInt();
			int count = 0;
			for (int l : result.keySet())
				if (temp != l && result.get(temp) > result.get(l))
					count++;
			System.out.println(count);
		}
	}

	public static int getFactors(int l) {
		int count = 0;
		int i;
		for (i = 1; i * i <= l; i++) {
			if (l % i == 0)
				count += 2;
		}
		if ((i - 1) * (i - 1) == l)
			count -= 1;
		return count;
	}

}
