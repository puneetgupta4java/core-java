import java.util.*;
import java.lang.*;
import java.io.*;


interface Borrower
{
   void checkin();
   void checkout();
}
class Book 
{
    int bookID;
    String title;
    String author;
    String booktype;
    String status="Available";
    String borroweduser="";
    Book(int bookID, String title, String author, String booktype)
    {
        this.bookID=bookID;
        this.title=title;
        this.author=author;
        this.booktype=booktype;
    }
}

public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    LinkedList<Book> lists=new LinkedList<>(); 
    	 for(;;)
    	 {
    	     System.out.println("1. Add Reference Book\n2. Add Text Book\n3. Check-Out\n4. Check-In\n5. List Books\n6. Exit\n");
             System.out.println("Enter your choice:");
             int n=sc.nextInt();
             String esc=sc.nextLine();
             int id;
             String title;
             String author;
             String username;
             
             
             if(n==1)
            {
                System.out.println("Input ID, Title and Author");
                id=sc.nextInt();
                String buff=sc.nextLine();
                title=sc.nextLine();
                author=sc.nextLine();
                Book b=new Book(id,title,author,"RefBook"); // RB: Reference Book 
                lists.add(b);
            }
             
            else if(n==2)
            {
                           System.out.println("Input ID, Title and Author");
                           id=sc.nextInt();
                           String buff=sc.nextLine();
                           title=sc.nextLine();
                           author=sc.nextLine();
                           Book b=new Book(id,title,author,"TextBook"); // TB: Text Book
                           lists.add(b);
        
            }
            else if(n==3)
            {
                           System.out.println("Input Book ID:");
                           id=sc.nextInt();
                           String buff=sc.nextLine();
                           for(Book b:lists)
                           {
                               if(b.bookID==id)
                               {
                                   if(b.booktype.equals("RefBook"))
                                   {
                                       System.out.println("Cannot be borrowed");
                                       break;
                                   }
                                   else
                                   {
                                       b.status="Borrowed";
                                       username=sc.nextLine();
                                       b.borroweduser=username;
                                   }
                               }
                           }
            }
            else if(n==4)
            {
                        System.out.println("Input Book ID:");
                        id=sc.nextInt();
                        for(Book b:lists)
                         {
                               if(b.bookID==id)
                               {
                                   if(b.booktype.equals("RefBook"))
                                   {
                                       System.out.println("Invalid");
                                       break;
                                   }
                                   else
                                   {
                                       b.status="Available";
                                   }
                               }
                           }
            }
            else if(n==5)
            {
                for(Book b:lists)
                {
                            
                    if(b.booktype.equals("RefBook"))
                    {
                        System.out.println("ReferenceBook:"+b.bookID+":"+b.title+":"+b.author);
                    }
                    else
                    {
                        if(b.status.equals("Available"))
                            System.out.println("TextBook:"+b.bookID+":"+b.title+":"+b.author+":Available");
                        else
                                System.out.println("TextBook:"+b.bookID+":"+b.title+":"+b.author+":Borrowed by "+b.borroweduser);
                    }
                }
                        
            }
            else
            {
                break;
            }
                        
                           
        
        }
	}
}
