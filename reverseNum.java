public class reverseNum {
    public static void main(String[] args) {
       // Scanner sc =new Scanner(System.in);
        int n=123456;
        int ans=0,rev=0;
        while(n>0){
            ans =n%10;
            n=n/10;
            rev=rev*10+ans;
               
        }
        System.out.println(rev);
        


    }
}
