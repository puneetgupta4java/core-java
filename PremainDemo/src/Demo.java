import java.lang.instrument.Instrumentation;

class t{
	int w;
}

public class Demo {
	
	public static void premain(String a,Instrumentation ins){
		System.out.println("demo size is " + ins.getObjectSize(new t()));
	}

	public static void main(String[] args) {
      System.out.println("i m here");
		
	}

}
