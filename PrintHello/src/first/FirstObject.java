package first;

import java.util.Scanner;

class Object{
	String name;
	Object(String name){
		this.name=name;
	}
	void print(){
		System.out.println("name is "+name);
	}
}

public class FirstObject {

	public static void main(String[] args) {
		String name;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter your name");
		name=scanner.next();
		Object o1=new Object(name);
		o1.print();
		Object o2=o1;
		o2.print();
		

	}

}
