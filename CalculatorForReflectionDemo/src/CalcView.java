import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class CalcView {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        System.out.println("enter the 1st no.");
        int firstno = scanner.nextInt();
        System.out.println("enter the 2nd no.");
        int secondno = scanner.nextInt();
        System.out.println("type add for addition");
        System.out.println("type subtract for subtraction");
        System.out.println("type multiply for multiplication");
        System.out.println("type divide for division");
        String methodname = scanner.next();
        int result = Callercalc.caller(methodname,firstno,secondno);
       // Callercalc cal = new Callercalc();
        //int result = cal.caller(methodname, firstno, secondno);
        System.out.println("result is "+result);
	}

}
	