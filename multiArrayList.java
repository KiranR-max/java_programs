import java.util.ArrayList;
import java.util.Scanner;

public class multiArrayList {
    public static void main(String[] args) {
        //arraylist within arraylist is multiD arraylist
        Scanner in=new Scanner(System.in);


        ArrayList<ArrayList<Integer>> list=new ArrayList<>();

        // for(int i=0;i<3;i++){ //0,1,2 arraylist 
        //     list.add(new ArrayList<>());    //init. arraylist
        // }

        // //adding elements to array listc
        // for(int i=0;i<3;i++){ 
        //     for(int j=0;j<3;j++){
        //         list.get(i).add(in.nextInt()); //evalated from right to left
        //     }
        // }         System.out.println(list);  

        ArrayList<ArrayList<String>> list2=new ArrayList<>();//String warpper classes;

        for(int i=0;i<3;i++){
            list2.add(new ArrayList<>());

        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list2.get(i).add(in.next());

            }
        }System.out.println(list2);

    }
}
