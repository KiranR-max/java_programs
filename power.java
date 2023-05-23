public class power {
    public static void main(String[] args) {
        System.out.println(pow(2,10));
    }

    static int pow(int x,int n){

        int pow=1;
        while(n!=0){
            pow=pow*n;
            n--;
        }return pow;
    }
}
