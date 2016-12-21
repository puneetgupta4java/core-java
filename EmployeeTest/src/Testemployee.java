
public class Testemployee {

	public static void main(String[] args) {
		Employee ram = new Employee(1001, "ram", 10000, 5000, "ducat,ghaziabad", 235648, "ramgupta@gmail.com",
				"testing department", "Mr.sen");
		ram.print();
		ram.calculate(10000);
		System.out.println(
				"********************************************************************************************");
		Employee shyam = new Employee(1002, "shyam", 20000, 5000, "rkgit,ghaziabad", 254879, "shyamgupta@gmail.com",
				"coding departmant", "Mr.sharma");
		shyam.print();
		shyam.calculate(20000);
	}

}
