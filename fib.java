import java.util.Scanner;

public class fib {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter n?");
        int n=in.nextInt();

        int a=0,b=1,count=2;
        while(count<=n){
            int temp=b;
            b=a+b;
            a=temp;
            count++;
            // a=0,b=1,count =2
            //0,1,1,2,3,5,.....
        }
        System.out.println(b);
    }
}
