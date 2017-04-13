import java.util.Scanner;

public class Orgtest {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("1.you are a employee");
		System.out.println("2.you are a manager");
		System.out.println("3.you are a ceo");
		int i = obj.nextInt();
		if (i == 1) {
			Org employee = new Org();
			employee.OrgEmployee();
		} else if (i == 2) {
			Org manager = new Org();
			manager.OrgManager();
		} else {
			Org ceo = new Org();
			ceo.OrgCeo();
		}

	}

}
