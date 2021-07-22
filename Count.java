import java.util.*;

public class Count{


	public static void main(String[] args){
	//write your code here
	
	Scanner scr = new Scanner(System.in);
	int n = scr.nextInt();
		int coun =0;
	for(int i=0 ; i<=20 ; i++){

	n=n/10;
	coun++;
	if(n==0){
	System.out.println(coun);
	break;
	}
}




}
}