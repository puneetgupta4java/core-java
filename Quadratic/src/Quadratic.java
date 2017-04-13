
public class Quadratic {
	double a;
	double b;
	double c;

	public void solve(int a, int b, int c) {
		double y = (b * b) - 4 * a * c;
		double d = Math.sqrt(y);
		double p = (-b + d) / (2 * a);
		double q = (-b - d) / (2 * a);
		System.out.println("now the answers are:");
		System.out.println("your first root is " + p);
		System.out.println("your second root is " + q);
	}
}
