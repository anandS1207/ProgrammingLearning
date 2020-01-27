package geeksforgeeks.arrays.problems;

import java.util.Scanner;

public class OneAndTwoComplement {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String oneComplement = oneComplement(str);
		String twoComplement = twoComplements(str);
		System.out.println(oneComplement);
		System.out.println(twoComplement);
	}

	public static String oneComplement(String str) {
		String s = "";
		for (int i = 0; i < str.length(); i++) {
			s += str.charAt(i) == '0' ? '1' : '0';
		}
		return s;
	}

	public static String twoComplements(String str) {
		String oneComplement = oneComplement(str);
		String twoComplement = "";
		if (oneComplement.contains("0")) {
			int index = oneComplement.lastIndexOf("0");
			String firstHalf = oneComplement.substring(0, index);
			String secondHalf = oneComplement(oneComplement.substring(index + 1));
			twoComplement = firstHalf + "1" + secondHalf;
		} else {
			twoComplement = oneComplement(oneComplement);
			twoComplement = "1" + twoComplement;
		}
		return twoComplement;
	}
}
