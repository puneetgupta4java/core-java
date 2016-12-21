
public class check {

	public static void main(String[] args) {
		
		String a = "x";
		String b = "x";
		String c = "0";
		String d = "x";
		if(a.equals(b)){
			System.out.println("a & b");
		}
		if(a==b){
			System.out.println("a & b equal by equal sign");
		}
		if(a==c){
			System.out.println("they are not equal");
		}
		if(a.equals(c)){
			System.out.println("by equals");
		}
		if(a.equals(b) && b.equals(d) && d.equals(a)){
			System.out.println("its done");
		}
		if(a==b && b==d){
			System.out.println("its almost done");
		}

	}

}
