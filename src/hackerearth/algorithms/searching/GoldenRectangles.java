package hackerearth.algorithms.searching;

import java.util.Scanner;

public class GoldenRectangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int count = 0;
		int w, h;
		for (int i = 0; i < t; i++) {
			w = s.nextInt();
			h = s.nextInt();
			double d = w * 1.0 / h * 1.0;
			double e = h * 1.0 / w * 1.0;
			if ((d >= 1.6 && d <= 1.7) || (e >= 1.6 && e <= 1.7))
				count++;
		}
		System.out.println(count);
	}

}
