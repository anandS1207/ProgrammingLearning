package hackerearth.algorithms.searching;

import java.util.Scanner;

public class RestInPeace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		Long m;
		for (int i = 0; i < t; i++) {
			m = s.nextLong();
			if (String.valueOf(m).contains("21"))
				System.out.println("The streak is broken!");
			else if (m % 3 == 0 && m % 7 == 0) {
				System.out.println("The streak is broken!");
			} else
				System.out.println("The streak lives still in our heart!");
		}
	}

}
