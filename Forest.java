import java.util.Scanner;

public class Forest {
static int count;
	void isTrue(int x, int y, String [][] str,int m ,int n){
		if((y+1)<n ){
			   if(str[x][y+1].equalsIgnoreCase("t")){
				   str[x][y+1]=Integer.toString(count);
			   }}
			   if((x-1)>=0 && (y-1)>=0){
			   if(str[x-1][y-1].equalsIgnoreCase("t")){
				   str[x-1][y-1]=Integer.toString(count);
			   }}
			   if((x-1)>=0){
			   if(str[x-1][y].equalsIgnoreCase("t")){
				   str[x-1][y]= Integer.toString(count);
			   }}
			   if(x-1>=0 && y+1<n){
			   if(str[x-1][y+1].equalsIgnoreCase("t")){
				   str[x-1][y+1]=  Integer.toString(count);
			   }}
			   if(y-1>=0 ){
			   if(str[x][y-1].equalsIgnoreCase("t")){
				   str[x][y-1]= Integer.toString(count);
			   }}
			   if(x+1<m && y-1>=0){
			   if(str[x+1][y-1].equalsIgnoreCase("t")){
				   str[x+1][y-1]=Integer.toString(count);
			   }}
			   if((x+1)<m && (y+1)<n){
			   if(str[x+1][y+1].equalsIgnoreCase("t")){
				   str[x+1][y+1]= Integer.toString(count);
			   }}
			   if(x+1<m){
			   if(str[x+1][y].equalsIgnoreCase("t")){
				   str[x+1][y]=  Integer.toString(count);
			   }
			
			   }
	}
	
	public static void main(String[] args) {
		Forest f=new Forest();
   
    Scanner scan=new Scanner(System.in);
   int m=scan.nextInt();
   int n=scan.nextInt();
    int x=scan.nextInt();
    int y=scan.nextInt();
   
    String str[][]=new String[m][n];
    if(3<=m && m<=20 && 3<=n && n<=20 )
    {
   for(int i=0;i<m;i++){
	   for(int j=0;j<n;j++){
		   str[i][j]=scan.next();
		   
	   }
   }
   str[x-1][y-1]=Integer.toString(++count);
   count++;
   
    --x;
    --y;
    f.isTrue(x, y, str, m, n);
count++;
int flag;

do{ 
	flag = 1;
	
  for(int i=0;i<m;i++){
	   for(int j=0;j<n;j++){
	   if(str[i][j].equalsIgnoreCase(Integer.toString(count-1))){
		    f.isTrue(i, j, str, m, n);
		   
		  }
	   }
	   }
  count++;
 for(int i=0;i<m;i++){
	   for(int j=0;j<n;j++){
		   if(flag == 1){
		  if(str[i][j].equalsIgnoreCase("t")) {
			 			  flag=0;
		  } 
		 
			  
		  }
		 
        		   
	   } 
	   }

	} while(flag==0);
	
	
System.out.println(--count);
    }
}
}

