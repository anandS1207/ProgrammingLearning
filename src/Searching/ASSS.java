package Searching;

public class ASSS {
	static int MAX = 256;

	public static void main(String args[]) {
		String patn = "AABA";
		String text = "BAAABAABCDBAAA";
		printAnagramIndexes(text, patn);
	}

	public static void printAnagramIndexes(String text, String patn) {
		int textLength = text.length();
		int patnLength = patn.length();
		char countOccurencesPattn[] = new char[MAX];
		char countOccurencestText[] = new char[MAX];
		for (int i = 0; i < patnLength; i++) {
			countOccurencesPattn[patn.charAt(i)]++;
			countOccurencestText[text.charAt(i)]++;
		}
		for (int i = patnLength; i < textLength; i++) {
			if (checkAnagramOrNot(countOccurencesPattn, countOccurencestText))
				System.out.println("Found index at  :" + (i - patnLength));
			countOccurencesPattn[text.charAt(i)]++;
			countOccurencesPattn[text.charAt(i - patnLength)]--;
		}
		if (checkAnagramOrNot(countOccurencesPattn, countOccurencestText))
			System.out.println("Found index at  :" + (textLength - patnLength));
	}

	public static boolean checkAnagramOrNot(char ar1[], char ar2[]) {
		for (int i = 0; i < 255; i++) {
			if (ar1[i] != ar2[i])
				return false;
		}
		return true;
	}
}
