
class calc{
	public int add(int x,int y){
		return x+y;
	}
	public int add(int x,int y,int z){
		return x+y+z;
	}
	public int add(int... x){
		int sum=0;
		for(int w:x){
			sum=w+sum;
		}
		return sum;
	}
}
class calc1 extends calc{
	public int add(int a,int x,int y,int z){
		System.out.println("hello,I am here.");
		return x+y+z+a;
	}
}
public class OverloadingTest {

	public static void main(String[] args) {
		calc1 obj=new calc1();
		System.out.println(obj.add(100, 200));
		System.out.println(obj.add(100, 200,300));
		System.out.println(obj.add());
		System.out.println(obj.add(100, 200,456,778,3234,56,767,34,780,265377,72887));
		System.out.println(obj.add(100, 2000));
		System.out.println(obj.add(100, 20));
		System.out.println(obj.add(100, 200,300,40));
		System.out.println(obj.add());
	  	
	}

}
