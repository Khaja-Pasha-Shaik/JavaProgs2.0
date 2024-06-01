package InterviewQues;

public class StringRelated1 {

    public static void main(String[] args) {

        //Check all are capital or not
        //Brute Approach
        String s = "aaaa    ";
        String sb = s.toLowerCase();
        if(s.equals(sb)){
            System.out.println("All are capital");
        }

        //If asked not to use the String methods
        int slength = s.length();
        int count=0;
        for(char c : s.toCharArray()){
            if((int)c >= 97){
                count++;
            }
        }
        System.out.println(count +" "+ slength);
        if(count==slength){
            System.out.println("All are small");
        }
    }
}
