import javax.lang.model.util.ElementScanner14;

public class sqrtX {
    public static void main(String[] args) {
         long n=16;
        System.out.println(sqrtX(n));

    }

    static long sqrtX(long n){
        long s=0;
        long e=n;
        long ans=0;
        while(s<=e){
            long m=s+(e-s)/2;
            if(m*m==n){
            ans=m;
            break;
        } if(m*m<n){
            s=m+1;
            ans=m;
        }
        else {
            e=m-1;
            //ans=m;
        }

    }return ans;
}
}