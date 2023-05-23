public class factorial {
    public static void main(String[] args) {
        System.out.println(  factorial(0 )    );

        
    }
    static int factorial(int n){
        //iterative method
        int i,fact=1;
        for(i=2;i<=n;i++){
            fact=fact*i;
            
        }return fact;
    } 
}
