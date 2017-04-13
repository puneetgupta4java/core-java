import java.util.Scanner;

interface SavingAccount{
	void amountincrease();
	void check();
}

interface FD{
	String time(String name);
	
	void interest();
}
class account implements SavingAccount,FD{

	
	

	@Override
	public void interest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void amountincrease() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void check() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String time(String name) {
	int time = name.length();
	String t = String.valueOf(time);
		return t;
	}
	
}
public class TryObject {

	public static void main(String[] args) {
		SavingAccount obj = new account();
		FD obj1 = new account();
		System.out.println("enter your name");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		String t = obj1.time(name);
		System.out.println(t);
		
	}

}
