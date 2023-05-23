import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
       // reverse(String [] )
       Scanner sc =new Scanner(System.in);
       String str=sc.next();
        //  //rev;
        //  char s[]=str.toCharArray();
        //  for(int i=str.length()-1;i>=0;i--){
        //      System.out.print(s[i]);
        //         }
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        rev+=str.charAt(i);
        System.out.println(rev);

    }
}
