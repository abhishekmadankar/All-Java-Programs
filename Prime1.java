import java.util.*;

public class Prime1{
    public static void main(String[] args) {
        // write your code here
        
	Scanner scr = new Scanner(System.in);
	int low = scr.nextInt();
	int high = scr.nextInt();

	for(int i = low ; i<=high ; i++){
			int count = 0;
		for(int j=2 ; j*j<=i ; j++){
			
			if(i%j==0){
				count++;
				break;
				}}
	if(count==0){
	System.out.println(i);
}
}
        
    
    }}
