class Var {
	boolean a = false;

	void print() {
		System.out.println("hello java");
	}

	void show() {
		System.out.println("hello variable " + a);
	}
}

public class FirstTry {

	public static void main(String[] args) {
		Var var = new Var();
		var.a = true;
		var.print();
		if (var.a == true)
			var.show();

	}

}
