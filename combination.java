public class combination {
    public static void main(String[] args) {
        System.out.println(nCr(5, 3));
    }
    
        static float nCr(int n,int r){
            float res=0;
            int num=factorial(n);
            try{
            int  den=factorial(r)*factorial(n-r);
            res+=num/den;
            
         }   catch (Exception e) {
            //TODO: handle exception
            System.out.println("error found is "+e);
        }return res;
        }
  
    
    // static void fac(int n, int r){
    //     int fac=n-r;
    //     int  temp=fac;


    // }
    static int factorial(int n){
        int fact=1;
        for(int i=0;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
}
