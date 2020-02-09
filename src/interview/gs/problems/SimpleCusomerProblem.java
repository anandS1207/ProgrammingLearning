package interview.gs.problems;

public class SimpleCusomerProblem {
	public static void main(String args[]) {
		String abc[] = new String[4];
		abc[0] = "[{}]";
		abc[1] = "[{]}";
		abc[2] = "{}[](){}[](){}[](){}[]()";
		abc[3] = "{{[[(())]]}}";
		int length = abc.length;
		for (int i = 0; i < length; i++) {
			String str = abc[i];
			int j = -1;
			while (j != str.length()) {
				j = str.length();
				str = str.replace("()", "");
				str = str.replace("{}", "");
				str = str.replace("[]", "");
			}
			if (str.length() > 0) {
				System.out.println("No");
			} else
				System.out.println("Yes");
		}
	}
}
