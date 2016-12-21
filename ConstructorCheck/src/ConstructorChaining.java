class animal{
	animal(){
		System.out.println("i m default cons animal");
		
	}
   animal(String c){
	   this();
	   System.out.println("i m parametrized cons animal");
	  
   }
}
class horse extends animal{
	horse(){
		super("ram");
		System.out.println("i m default cons horse");
	}
	horse(String a){
		this();
		System.out.println("i m parametewized cons horse");
	}
}


public class ConstructorChaining {

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		horse h = new horse("ram");
		
	}

}
