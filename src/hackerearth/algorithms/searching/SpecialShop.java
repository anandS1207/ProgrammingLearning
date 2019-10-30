package hackerearth.algorithms.searching;

import java.util.Scanner;

public class SpecialShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int p, x, y, result, temp;
		for (int i = 0; i < t; i++) {
			result = Integer.MAX_VALUE;
			p = s.nextInt();
			x = s.nextInt();
			y = s.nextInt();
			for (int j = 0; j <= p; j++) {
				temp = j * j * x + (p - j) * (p - j) * y;
				if (temp < result)
					result = temp;
			}
			System.out.println(result);
		}
	}

}
