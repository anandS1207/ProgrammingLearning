package hackerearth.algorithms.searching;

public class Matrics {
	public static void main(String srs[]) {
		int n = 5;
		int i = 0;
		int j = n;
		int count = 0;
		while (i <= (n / 2 + 1) && j >= (n / 2 + 1)) {
			if ((count == n / 2 && n % 2 == 0) || (count == n / 2 + 1 && n % 2 == 1)) {
				i++;
				j--;
				count = 0;
				continue;
			}
			System.out.println(i + "," + (i + count));
			System.out.println(i + "," + (j - count));
			System.out.println(j + "," + (i + count));
			System.out.println(j + "," + (j - count));
			count++;
		}

	}
}
