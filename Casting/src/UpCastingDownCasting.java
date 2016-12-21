abstract class Loan{
	void applyforloan(){
		System.out.println("apply loan");
		System.out.println("loan report");
	}
}
class Homeloan extends Loan{
	@override
	void applyforloan(){
		System.out.println("apply Homeloan");
		System.out.println("Homeloan report");	
	}
}
class Autoloan extends Loan{
	@override
	void applyforloan(){
		System.out.println("apply autoloan");
		System.out.println("autoloan report");
	}
	void insurance(){
		System.out.println("new insurance");
	}
}
class LoanPrint{
	void print(Loan loan){
		loan.applyforloan();
		if(loan instanceof Autoloan){
			Autoloan autoloan=new Autoloan();
			autoloan.insurance();
		}
	}
}
public class UpCastingDownCasting {

	public static void main(String[] args) {
//	  Loan loan=new Homeloan();
	  LoanPrint lp=new LoanPrint();
	  lp.print(new Homeloan());
	  lp.print(new Autoloan());
//     loan.applyforloan();
//     loan=new Autoloan();
//     loan.applyforloan();
     //loan.insurance(); 
	}

}
