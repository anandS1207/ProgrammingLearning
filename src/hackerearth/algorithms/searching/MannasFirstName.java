package hackerearth.algorithms.searching;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MannasFirstName {
	public static void main(String args[]) throws Exception {
		// basic question need to be implemented in C only
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			int suvojit = 0;
			int suvo = 0;
			String str = br.readLine();
			while (str.contains("SUVOJIT")) {
				str = str.replace("SUVOJIT", "");
				suvojit++;
			}
			while (str.contains("SUVO")) {
				str = str.replace("SUVO", "");
				suvo++;
			}
			System.out.printf("SUVO = %d, SUVOJIT = %d", suvo, suvojit);
			System.out.println();
		}
	}
}
