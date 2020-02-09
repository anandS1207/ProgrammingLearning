package gs.coding.problems;

import java.util.Scanner;

public class FindCheapWay {
	public static void main(String srgs[]) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int a[][] = new int[t][t];
		for (int i = 0; i < t; i++) {
			for (int j = 0; j < t; j++) {
				a[i][j] = s.nextInt();
			}
		}

		System.out.println(getPathCost(a, 3, 0, 0, 3));
	}

	public static int getPathCost(int a[][], int startX, int startY, int endX, int endY) {
		if (startX < 0 && startY > 3)
			return 0;
		if (startX == endX && startY == endY)
			return a[endX][endY];
		return a[startX][startY] + Math.min(getPathCost(a, startX - 1, startY, endX, endY),
				getPathCost(a, startX, startY + 1, endX, endY));
	}
}
