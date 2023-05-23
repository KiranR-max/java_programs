import java.util.Scanner;

class Solution {
    static void armstrongNumber(int n){
        // code here
        int sum=0,rem=0,original=n;
        while(n>0){
            rem=n%10;
            n/=10;
            sum+=rem*rem*rem;
        } 
        if(original==sum)
        System.out.print("Yes");
        else 
          System.out.print("No");
        
    } 
    public static void main (String[] args){
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        armstrongNumber(n);
        
    }
}