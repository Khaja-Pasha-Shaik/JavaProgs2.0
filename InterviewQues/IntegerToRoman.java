package InterviewQues;

import java.util.Arrays;

public class IntegerToRoman {

    //Ask if we can have negative integers
    //Whats the upper limit - considering 3000 here
    //Take units
    public static void main(String[] args) {
        String[] units = new String[]{"","I","II","III","IV","V","VI","VII","VIII","IX","X"};
        String[] tens = new String[]{"","X","XX","XXX","XL","L","LX","LXX","XXL","XC","C"};
        String[] hundreds = new String[]{"","C","CC","CCC","DC","D","DC","DCC","CCM","CM","M"};
        String[] thousands = new String[]{"","M","MM","MMM"};

        int i = 15;
        StringBuffer sb = new StringBuffer();
        System.out.println(i/1000+"  "+(i%1000)/100+"  "+(i%100)/10+"  "+i%10);
        sb.append(thousands[(i/1000)]);
        sb.append(hundreds[(i%1000)/100]);
        sb.append(tens[(i%100)/10]);
        sb.append(units[i%10]);
        System.out.println(sb);
    }
}
