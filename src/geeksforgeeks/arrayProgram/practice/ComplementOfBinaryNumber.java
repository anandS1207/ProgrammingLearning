package geeksforgeeks.arrayProgram.practice;

public class ComplementOfBinaryNumber {

	public static void main(String[] args) {
		String bin = "110110111";
		printOneAndTwosComplement(bin);
	}

	static char flip(char c) {
		return (c == '0') ? '1' : '0';
	}

	static void printOneAndTwosComplement(String bin) {
		int n = bin.length();
		int i;
		String ones = "", twos = "";
		ones = twos = "";
		for (i = 0; i < n; i++) {
			ones += flip(bin.charAt(i));
		}
		twos = ones;
		for (i = n - 1; i >= 0; i--) {
			if (ones.charAt(i) == '1') {
				twos = twos.substring(0, i) + '0' + twos.substring(i + 1);
			} else {
				twos = twos.substring(0, i) + '1' + twos.substring(i + 1);
				break;
			}
		}
		if (i == -1) {
			twos = '1' + twos;
		}

		System.out.println(ones);
		System.out.println(twos);
	}
}
