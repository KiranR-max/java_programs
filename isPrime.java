import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

      int n=in.nextInt();
       boolean ans=isPrime(n);
       System.out.println(ans);

    }
    static boolean isPrime(int n){
        if(n<=1)
         return false;

         for(int i=2;i<=Math.sqrt(n);i=i+2){
            if(n%2==0)
            return false;
         } return true;

    }
}
