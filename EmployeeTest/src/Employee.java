
public class Employee {
	private int employeeno;
	private String name;
	private double salary;
	private double bonus;
	private String address;
	private int phoneno;
	private String email;
	private String dept_name;
	private String managername;
	private String companyname;

	Employee() {
		companyname = "TCS";
	}

	Employee(int employeeno, String name, double salary, double bonus, String address, int phoneno, String email,
			String dept_name, String managername) {

		this();
		this.employeeno = employeeno;
		this.name = name;
		this.salary = salary;
		this.bonus = bonus;
		this.address = address;
		this.phoneno = phoneno;
		this.email = email;
		this.dept_name = dept_name;
		this.managername = managername;
	}

	public void print() {
		while (employeeno < 0) {
			System.out.println("invalid no.");
			return;
		}
		System.out.println("employee no. is " + employeeno);
		System.out.println("name is " + name);
		System.out.println("salary is " + salary);
		System.out.println("bonus is " + bonus);
		System.out.println("address is " + address);
		System.out.println("phone no. is " + phoneno);
		System.out.println("email address is " + email);
		System.out.println("department name is " + dept_name);
		System.out.println("manager name is " + managername);
		System.out.println("company name is " + companyname);
	}

	public void calculate(double salary) {
		double hra = (30 * salary) / 100;
		double da = (10 * salary) / 100;
		double ta = (20 * salary) / 100;
		double gross = salary + hra + da + ta;
		System.out.println("HRA is " + hra);
		System.out.println("DA is " + da);
		System.out.println("TA is " + ta);
		System.out.println("gross salary is " + gross);
	}
}
