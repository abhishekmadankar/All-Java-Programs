import java.util.*;
import java.lang.Math;
  
  public class Convert{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
       // write code here
       int num = 0;
       int i = 0;
       while(n>0){
           
           int a = 0;
           a = n % b;
           n = n/b;
           
           num = num + a * (int)Math.pow(10,i);
           i++;
           

         
       }
       return num;
   }
   
  }