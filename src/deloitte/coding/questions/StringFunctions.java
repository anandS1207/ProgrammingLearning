package deloitte.coding.questions;

public class StringFunctions {
	public static void main(String sfds[]) {
		StringBuilder sb = new StringBuilder(5);
		System.out.println(sb.length());
		sb.insert(0, "pqrst");
		System.out.println(sb.length());
		System.out.println(sb.toString());
		sb.append("abc");
		System.out.println(sb.length());
		System.out.println(sb.toString());
	}
}
