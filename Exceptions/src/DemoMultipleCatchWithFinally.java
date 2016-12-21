import java.util.Scanner;

public class DemoMultipleCatchWithFinally {

	public static void main(String[] args) {
     int result = 0;
		Scanner scanner = new Scanner(System.in);
	System.out.println("enter the number");	
	try{
//	int i = scanner.nextInt();
//	 result = 10/i;
//		System.out.println("result is "+result);
	int a[] = {10,20,30};
	a[10]=1000;
	String b = null;
	@SuppressWarnings("null")
	int l = b.length();
	System.out.println(l);
	}
	catch(ArithmeticException e){
	
		System.out.println("result is "+result);
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println("Array Index Out Of Bounds "+ e);
	}
	catch(NullPointerException e){
		System.out.println("string is null");
	}
	finally{
		System.out.println("connection close");
	}
	scanner.close();
 }
}
