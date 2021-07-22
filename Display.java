import java.util.*;
import java.lang.Math;

	public class Display{
	
	public static void main(String[] args){

	


Scanner scr = new Scanner(System.in);
	int n = scr.nextInt();
	int z = n;
	int coun =0;
	for(int i=0 ; i<=20 ; i++){

	n=n/10;
	coun++;
	if(n==0){
	// System.out.println(coun);
	break;
	}
}
int y = (int)Math.pow(10,coun-1);
	for(int j=0;j<y;j++){
	
	int p = z%y;
	z=z/y;
	
	System.out.println(z);
	z = p;
	y--;
	if(coun==0){
break;}
}	 
}
}