package hackerearth.algorithms.searching;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BreakupApp {
	public static void main(String srgs[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int days[] = new int[31];
		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			String str = br.readLine().trim();
			String strs[] = str.split(" ");

			for (int j = 0; j < strs.length; j++) {
				try {
					int date = Integer.parseInt(strs[j]);
					if (strs[0].startsWith("G"))
						days[date] += 2;
					else
						days[date]++;
				} catch (Exception e) {

				}
			}
		}
		int max = days[1];
		int no_instances = 1;
		int going_date = 1;
		for (int i = 2; i <= 31; i++) {
			if (days[i] > max) {
				max = days[i];
				going_date = i;
			} else if (days[i] == max) {
				no_instances++;
			}
		}
		if (no_instances == 1) {
			if (going_date == 19 || going_date == 20) {
				System.out.println("Date");

			} else
				System.out.println("No Date");
		} else
			System.out.println("No Date");
	}
}