
public class GameDAO {

	int loc1[] = { 20, 30, 40 };
	int loc2[] = { 32, 33, 34 };
	int loc3[] = { 64, 65, 66 };
	int a = 0, b = 0, c = 0, d = 0;

	public boolean test(int guess) {
		int i;
		String result="miss";
		for (i = 0; i < 3; i++) {
			if (guess == loc1[i]) {
				result="hit";
				loc1[i]=0;
				a++;
				// System.out.println(a);
				// break;
			} else if (guess == loc2[i]) {
				result="hit";
				b++;
				loc2[i]=0;
				// System.out.println(b);
				// break;
			} else if (guess == loc3[i]) {
				result="hit";
				c++;
				loc3[i]=0;
				// System.out.println(c);
				// break;
			}
		}
			System.out.println(result);
		if (a == 3) {
			System.out.println("kill enemy ship 'ho-twang' sink");
			d++;
			a = 0;
		}
		if (b == 3) {
			System.out.println("kill enemy ship 'phinoclus' sink");
			d++;
			b = 0;
		}
		if (c == 3) {
			System.out.println("kill enemy ship 'triok' sink");
			d++;
			c = 0;
		}
		if (d == 3)
			return true;
		else
			return false;
	}

}
