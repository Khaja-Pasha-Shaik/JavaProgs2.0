public class PalindromeCheckRecursive {

    public static void main(String[] args) {
        String s ="1211";
        //Do it recursive. If it reads the sameway even after reversing
        //thats a palindrome
        //Recursive function task is
        //check if l,r pointer strings are same. If same continue
        //else stop and return saying not palindrome
        boolean res = func11(s,0,s.length()-1);
        System.out.println(res);
    }

    private static boolean func11(String s, int l, int r) {
        if(!(s.charAt(l) == s.charAt(r))){
            return false;
        } else if (l>=r) {
            return true;
        }
        return func11(s,l+1,r-1);
    }
}
