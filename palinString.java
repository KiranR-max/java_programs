import java.util.Scanner;

//import javax.swing.plaf.synth.SynthEditorPaneUI;

public class palinString{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String rev="",str=in.next();
        str=str.toLowerCase();

        for (int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }       
        if(str.equals(rev)){
            System.out.println("paindrime");
        }
        else System.out.println("not palindrome");
    }

}