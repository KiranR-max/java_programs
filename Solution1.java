public class Solution1 {
    public static void main(String[] args) {
        char[] letters={'c','f','g'};
        char target='f';

        char ans=nextGreatestLetter(letters,target);
        System.out.println(ans);

    }

    static char nextGreatestLetter(char[] letters,char target){
        int s=0;
        int e=letters.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(target<letters[m])
            e=m-1;
            else 
            s=m+1;
        }return letters[s%letters.length];
    }
}
