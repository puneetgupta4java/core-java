
public class student {
   int rollno;
   String name;
   String course;
   double fees;
   String college;
   
   student(){
	   college="rkgit";
   }
   student(int rollno,String name,String course,int fees){
	   this();
	   this.rollno=rollno;
	   this.name=name;
	   this.course=course;
	   this.fees=fees;
	   print(rollno,name,course,fees);
     }
   void print(int rollno,String name,String course,int fees){
	   System.out.println("rollno is "+rollno);
	   System.out.println("name is "+name);
	   System.out.println("course is "+course);
	   System.out.println("fees is "+fees);
	   System.out.println("collegename is "+college);
   }
}
