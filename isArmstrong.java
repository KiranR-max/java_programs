public class isArmstrong {
    public static void main(String[] args) {
        
        boolean ans =isArmstrong(103);//153 is armstrong number 
        System.out.println(ans );
    }

    static boolean isArmstrong(int n){
        int sum=0,rem=0,cube;
        int original=n;
        while(n>0){
            rem=n%10;
            n=n/10;
            cube=rem*rem*rem;
            sum+=cube;
        }
        return sum==original;
        
    }
}
