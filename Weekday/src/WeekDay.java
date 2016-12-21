import java.util.Scanner;

import org.testng.Assert;

public class WeekDay {

	public static void main(String[] args) {
		@test
		Scanner sc = new Scanner(System.in);
		int result = 4;
		System.out.println("enter the no. of day");
		int a = sc.nextInt();
		int Expectedresult = a;
		if (a == 1) {
			System.out.println("weekday 1:sunday");
		} else if (a == 2) {
			System.out.println("weekday 2:monday");
		} else if (a == 3) {
			System.out.println("weekday 3:tuesday");
		} else if (a == 4) {
			System.out.println("weekday 4:wednesday");
		} else if (a == 5) {
			System.out.println("weekday 5:thrusday");
		} else if (a == 6) {
			System.out.println("weekday 6:friday");
		} else if (a == 7) {
			System.out.println("weekday 7:saturday");
		} else {
			System.out.println("wrong input");
		}
		Assert.assertEquals(result, Expectedresult);

	}

}
