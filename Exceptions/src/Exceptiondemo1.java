                                              //  exception handling basics
//you have to run your program in a happy condition then check for other conditions
//one by one start removing the exceptions
//same thing we do here
//1st make the program then try to remove the input mismatch exception

import java.util.InputMismatchException;
import java.util.Scanner;
class Input{
	static int first =0;
	static int second =0;
	static Scanner scanner = new Scanner(System.in);
	public int firstno(){
		System.out.println("enter the 1st number");
		try{
			first = scanner.nextInt();
			}
			catch(InputMismatchException e){
				System.out.println("enter the correct arithmetic number");
				scanner.nextLine();
				firstno();
			}
		return first;
	}
	public int secondno(){
		System.out.println("enter the 2nd number");
		try{
			second = scanner.nextInt();
			if(second == 0){
	        	System.out.println("invalid input because no number is dividable by zero");
				secondno();
			}
		}
			catch(InputMismatchException e){
				System.out.println("enter the correct arithmetic number");
			    scanner.nextLine();
			    secondno();
	}
		return second;
}
}

public  class Exceptiondemo1 {

	public static void main(String[] args) {
		
		Input input = new Input();
		int first = input.firstno();
		
		int second = input.secondno();
		
            	
       
//		int first=0;
//		int second = 0;
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("enter the 1st number");;
//		try{
//		first = scanner.nextInt();
//		}
//		catch(InputMismatchException e){
//			System.out.println("enter the arithmetic number");
//			scanner.nextLine();
//			
//		}
//		System.out.println("enter the 2nd number");
//		try{
//			second = scanner.nextInt();
//			}
//			catch(InputMismatchException e){
//				System.out.println("enter the arithmetic number");
//			}
		int result = 0;
//		try{
//			 result = first/second;
//		}
//		catch(ArithmeticException e){
//                 System.out.println("you are not giving correct input");
//             }
        

       
		result = first/second;
			
		System.out.println("result is "+result);
        
}
}
	


