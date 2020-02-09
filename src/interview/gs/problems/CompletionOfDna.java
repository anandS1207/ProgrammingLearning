package interview.gs.problems;

public class CompletionOfDna {
	public static void main(String args[]) {
		String s = "abasdf";
		String str = "";
		for (int i = s.length() - 1; i >= 0; i--)
			str = str + s.charAt(i);
		System.out.println(str);
	}
}
