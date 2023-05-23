public class searchInString {
    public static void main(String[] args) {
        String str="kiran r";
        char ch=' ';//space is also charcter

        System.out.println(searchInString(str,ch));
    }

    static boolean searchInString(String str,char ch){
        if(str.length()==0){
            return false;
        }
        // for(int i=0;i<str.length();i++){
        //     if(ch==str.charAt(i));
        //     System.out.println(ch+ " found at index "+ i);
        //     return true;
        // }return false;

            for(char target:str.toCharArray()){
                if(ch==target){
                //System.out.println(ch+"found at"+target);
                return true;}
            }return false;
    }
}
