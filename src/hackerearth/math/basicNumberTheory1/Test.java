package hackerearth.math.basicNumberTheory1;

public class Test {
	public static void main(String arhs[]) {
		System.out.println(Hello.x);
	}
}
class Hello{
	static final int x;
	static {
		x = 23;
		System.out.println("In Static block");
	}
}
