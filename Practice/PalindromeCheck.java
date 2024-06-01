package Practice;

import javax.management.monitor.StringMonitorMBean;

public class PalindromeCheck {

    public static void main(String[] args) {
        String s = "racecar";
//        StringBuffer sb = new StringBuffer(s);
//        sb.reverse();
//        if(s.equals(sb.toString())){
//            System.out.println("Its a palindrome");
//        }else{
//            System.out.println("Its isn't one");
//        }

        //take 2 pointers first and last
        //compare them - if equal increment first, decrement last and continue
        //If fails - return false saying not palindrome

        boolean res = palindromeCheck(s,0,s.length()-1);
        System.out.println(res);
    }

    private static boolean palindromeCheck(String s, int l, int r) {
        if(s.charAt(l) != s.charAt(r)){
            return false;
        } if(l >= r){
            return true;
        }
        palindromeCheck(s,l+1,r-1);
        return true;
    }
}
