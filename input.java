import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class input {
 public static void main(String[] args) {

    Scanner in=new Scanner(System.in);
//     int[] arr=new int[5];
// //    int[] arr={1,4,5,6,7};
//     for(int i=0;i<arr.length;i++){
//         arr[i]=in.nextInt();

//     }
    // for(int i=0;i<=arr.length;i++){
    //   System.out.println(arr[i]);//  =in.nextInt();

    // }
    //System.out.println(Arrays.toString(arr));

    // for(int num:arr){
    //     System.out.println(num+" ");
    // }

    String[] str=new String[5];
    for(int j=0;j<str.length;j++){
        str[j]=in.next();
    }//System.out.println(Arrays.toString(str));

    for(int j=0;j<str.length;j++){
      System.out.println(str[j]+" ");//  str[j]=in.next();
    }


 }   
}
