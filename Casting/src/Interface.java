interface calc{
	public int add(int x,int y);
	public int sub(int x,int y);
}
class MathCalc implements calc{
	public int add(int x,int y){
		return x+y;
	}
	public int sub(int x,int y){
		return x-y;
	}
}
class SciCalc implements calc{

	@Override
	public int add(int x, int y) {
		if(x==0||y==0){
			return 0;
		}
		else{
			return x+y;
		}
	}

	@Override
	public int sub(int x, int y) {
		return x-y ;
	}
	
}
class Print{
	void calcprint(calc calc){
		
	}
}
public class Interface {

	public static void main(String[] args) {
	
      
	}

}
