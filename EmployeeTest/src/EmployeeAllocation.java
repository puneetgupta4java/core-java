import java.util.Scanner;

class dept {
	private String Dept_name;
	private String address;

	public String getDept_name() {
		return Dept_name;
	}

	public void setDept_name(String dept_name) {
		Dept_name = dept_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "dept [Dept_name=" + Dept_name + ", address=" + address + "]";
	}
}

class Employee1 {

	private String empid;
	private String name;
	private double Salary;

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return "Employee1 [empid=" + empid + ", name=" + name + ", Salary=" + Salary + "]";
	}

}

class CalculateSalary {
	double hra;
	double da;
	double ta;
	double gross;

	public void salary(double salary) {
		hra = (30 * salary) / 100;
		da = (10 * salary) / 100;
		ta = (20 * salary) / 100;
		gross = salary + hra + da + ta;
		
	}

	@Override
	public String toString() {
		return "calculateSalary [hra=" + hra + ", da=" + da + ", ta=" + ta + ", gross=" + gross + "]";
	}

}

public class EmployeeAllocation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your emp id");
		String empid = scanner.next();
		System.out.println("enter your name");
		String name = scanner.next();

		System.out.println("enter your salary");
		double salary = scanner.nextInt();
		Employee1 emp = new Employee1();
		emp.setEmpid(empid);
		emp.setName(name);
		emp.setSalary(salary);
		System.out.println(emp);
		CalculateSalary calculatesalary = new CalculateSalary();
		calculatesalary.salary(salary);
		System.out.println(calculatesalary);
		dept dept = new dept();
		dept.setDept_name("IT");
		dept.setAddress("ghaziabad");
		System.out.println(dept);
	}
}
