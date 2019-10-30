package hackerearth.algorithms.searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MonkTakesWalk {
	public static void main(String srgs[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCases; i++) {
			String str = br.readLine().toLowerCase();
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == 'a' || str.charAt(j) == 'e' || str.charAt(j) == 'i' || str.charAt(j) == 'o'
						|| str.charAt(j) == 'u')
					count++;
			}
			System.out.println(count);
		}
	}
}
