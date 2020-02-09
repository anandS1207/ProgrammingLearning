package interview.gs.problems;

public class GoodBinaryStringt {
	public static void main(String args[]) {
		String binString = "11011000";
		int nofones = getOnesCount(binString);
		int nofzeros = getZerosCount(binString);
		String maxPossible = "";
		for (int i = 0; i < nofones; i++)
			maxPossible += "1";
		for (int i = 0; i < nofzeros; i++)
			maxPossible += "0";
		System.out.println(maxPossible);
		if (isGoodString(maxPossible))
			System.out.println(maxPossible);
		else {
			long n = getDecimal(maxPossible);
			while (n > 0) {
				maxPossible = decToBinary(n);
				// if (getOnesCount(maxPossible) == getZerosCount(maxPossible))
				if (isGoodString(maxPossible))
					break;
				n = n - 1;
			}
			System.out.println(maxPossible);
		}
	}

	public static boolean isGoodString(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (getOnesCount(str.substring(0, i)) >= getZerosCount(str.substring(0, i)))
				count++;
		}
		if (count == str.length() - 1)
			return true;
		return false;
	}

	public static long getDecimal(String str) {
		long n = Long.parseLong(str);
		long decimal = 0, p = 0;

		while (n != 0) {
			decimal += ((n % 10) * Math.pow(2, p));
			n = n / 10;
			p++;
		}
		return decimal;
	}

	public static int getOnesCount(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++)
			if (str.charAt(i) == '1')
				count++;
		return count;
	}

	public static String decToBinary(long n) {
		String str = "";
		long[] binaryNum = new long[1000];
		int i = 0;
		while (n > 0) {
			binaryNum[i] = n % 2;
			n = n / 2;
			i++;
		}
		for (int j = i - 1; j >= 0; j--)
			str = str + binaryNum[j];
		return str;
	}

	public static int getZerosCount(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++)
			if (str.charAt(i) == '0')
				count++;
		return count;
	}
}
