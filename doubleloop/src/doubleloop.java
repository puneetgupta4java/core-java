
public class doubleloop {

	public static void main(String[] args) {
		int x[][] = new int[3][];
		x[0] = new int[4];
		x[1] = new int[3];
		x[2] = new int[2];

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				System.out.println(x[i][j]);
			}
		}
		for (int w[] : x) {
			for (int e : w) {
				System.out.println("new is" + e);
			}
		}
	}

}
