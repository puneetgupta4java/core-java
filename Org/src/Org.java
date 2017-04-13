import java.util.Scanner;

public class Org {

	private int idno;
	private String name;
	private double password;
	private int dept_name;
	String a = "ram";
	String b = "shyam";
	Scanner obj = new Scanner(System.in);

	void OrgEmployee() {
		System.out.println("enter your id no.");
		idno = obj.nextInt();
		System.out.println("enter the password");
		password = obj.nextDouble();
		if (password == 100) {
			System.out.println("enter your new password");
			password = obj.nextDouble();
			this.name = a;
		} else if (password == 200) {
			System.out.println("enter your new password");
			password = obj.nextDouble();
			this.name = b;
		} else {
			System.out.println("wrong password");
			return;
		}
		System.out.println("your id no. is" + idno);
		System.out.println("your name is" + name);
		System.out.println("your password is" + password);
	}

	void OrgManager() {
		System.out.println("enter the name of employee");
		name = obj.next();
		if (a.equals(name)) {
			System.out.println("enter new password");
			password = obj.nextDouble();
		} else if (b.equals(name)) {
			System.out.println("enter the password");
			password = obj.nextInt();
		}
		System.out.println("name is " + name);
		System.out.println("password is " + password);
	}

	void OrgCeo() {
		System.out.println("name is ram password is " + password);
		System.out.println("name is shyam password is " + password);

	}
}
