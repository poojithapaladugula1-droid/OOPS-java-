package S4;

public class Error2 {
	public static void main(String arg[]) {
		int a=10;
		int b=5;
		int c=5;
		int x,y;
		try {
			x=a/(b-c);
		}
		catch(ArithmeticException e) {
			System.out.println("Division by zero");
		}
		y=a/(b-c);
		System.out.println("y="+y);
	}
}
