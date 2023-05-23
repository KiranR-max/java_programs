import java.util.Scanner;

public class countNums {
    public static void main(String[] args) {
        int count=0;
        int rem;
        Scanner in =new Scanner(System.in);
        int n=1323453;
        
        
        while(n>0){
            rem=n%10;
            if(rem==3)
                count++;   
                n=n/10;
        }

        System.out.println(count);
    }
}
