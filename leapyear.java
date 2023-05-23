import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class leapyear {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int year=in.nextInt();
        if(year%100==0||year%4==0 && year%100!=0){
            System.out.println("leapyear");
        }else System.out.println("not leap");
    }
}
