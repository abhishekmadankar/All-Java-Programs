 import java.util.*;
  
  public class Prime{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
  
       // write ur code here


       for(int i=0;i<n;i++){

           int m = scn.nextInt();
	  int count = 0;

	   for(int j=2;j*j<=m;j++){

		if(m%j==0){

			count++;
			break;

		}
		
       }
if(count==0){
System.out.println("Prime");
}
else{
System.out.println("Not Prime");
}
  
   }
  }
}
