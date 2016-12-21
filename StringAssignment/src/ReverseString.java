import java.util.Scanner;

class Str {

	public void reverse(String a) {
		int i = a.length();
		for (int b = i - 1; b >= 0; b--) {
			System.out.print(a.charAt(b));
		}
	}

}
// class StrBuffer{
// public void reverse1(StringBuffer a){
// System.out.println();
// }
// }

public class ReverseString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the string");
		String a = scanner.next();
		System.out.println("by normal string:");
		Str str = new Str();
		str.reverse(a);
		System.out.println("\n\n"+a+"\n\n");
		StringBuffer stringbuffer = new StringBuffer("hello");
		System.out.println("  ");
		System.out.println("by stringbuffer"+ "\n"+stringbuffer.reverse());
		System.out.println(stringbuffer);

	}

}
