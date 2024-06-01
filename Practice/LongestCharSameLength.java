package Practice;

public class LongestCharSameLength {

    public static void main(String[] args) {
        String str = "aaabraaeqaaaaaa";

        char cur = str.charAt(0);
        int c=0;
        int maxc=0;
        for(int i=1;i<str.length();i++){
            if(cur == str.charAt(i)){
                c++;
                maxc = Math.max(maxc,c);
            } else {
                cur = str.charAt(i);
                c=0;
            }
        }
        System.out.println(maxc+1);
    }
}
