import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        //syntax
        ArrayList<Integer> list =new ArrayList<>(10);//araylist is dynamic size
        list.add(10);
        list.add(11);
        list.add(14);    //Interger is called wrapper class for int ;;;
        list.add(16);
        list.add(40);
        list.add(80);

        System.out.println(list);

        System.out.println(list.contains(11));

       System.out.println(list.get(5)) ;

       list.set(0,100);
       System.out.println(list);

        for(int i=0;i<5;i++){
            list.add(in.nextInt());
        }

        for(int i=0;i<5;i++){
            System.out.println(list.get(i));
        }

    //    ArrayList<String> list2=new ArrayList<>();

    //    for(int i=0;i<5;i++){
    //     list2.add(in.next());
    //    }

    //    for(int i=0;i<5;i++){
    //     System.out.println(list2.get(i));
    //    }

    //    System.out.println(list2);

       //System.out.println();
    }
}
