import java.util.*;

public class Freq {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    public static int getDigitFrequency(int n, int d) {
        // write code here
        
        
        
        int num = n;
        int count=0;
        while(num!=0){
            
            num = num / 10;
            count++;
        }
        int counts=0;
        for(int i=0;i<count;i++){
            
            int a = n % 10;
            n = n/10;
            if(a==d){
                counts++;
            }
        }
        
        return counts;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}