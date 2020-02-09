package interview.gs.problems;

import java.util.Scanner;

public class ProjectCompleted {
	public static void main(String srgs[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int timeTaken[] = new int[n];
		for (int i = 0; i < n; i++)
			timeTaken[i] = s.nextInt();
		int timeAvailable = 0;
		int projectFinishible = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			int start = i;
			int temp = 0;
			for (int j = 0; j < n; j++) {
				if (timeTaken[(start - j + n) % n] <= timeAvailable) {
					temp++;
					timeAvailable++;
				}
			}
			projectFinishible = projectFinishible > temp ? projectFinishible : temp;
		}
	}
}
