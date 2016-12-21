import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("enter the string");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		int l = name.length();
		String a = new String(name);
		// char arr[] = null;
		// for (int i = 0; i < l; i++) {
		// arr[i] = name.charAt(l -1 - i);
		// }
		// name = String.valueOf(arr[l]);
		for (int i = 0; i < l; i++) {
			char c = name.charAt(l-1-i);
			String b = String.valueOf(c);
			name = name + b;
		}
		name = name.substring(l);
	    System.out.println(name);
		if (a.equals(name)) {
			System.out.println("strings are same");
		} else {
			System.out.println("strings are not equal");
		}
	}

}
