import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		String d = "puneet";
		Scanner obj = new Scanner(System.in);
		System.out.println("enter your name");	
		String w = obj.next();
		if (w.equals(d)) {
			System.out.println("hello,mr." + w);
			System.out.println("'enter the value of a");
			int a = obj.nextInt();
			System.out.println("'enter the value of b");
			int b = obj.nextInt();
			System.out.println("'enter the value of c");
			int c = obj.nextInt();
			Quadratic ram = new Quadratic();
			ram.solve(a, b, c);
		} else {
			System.out.println("your are not a person to do that");
			return;
		}

	}

}
