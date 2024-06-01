package Practice;

import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class FirstNonRepeatingChar {

    //Take frequency map
    //Then iterate through string, which ever char first sees 1 as value in map
    //break and print that

    public static void main(String[] args) {

        String str = "acegecfa";

        //Prepare a frequency map

        Map<Character, Long> map = str.chars().mapToObj(ch -> (char)ch)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println(map);

        for(int i=0;i<str.length();i++){
            if(map.get(str.charAt(i)) == 1){
                System.out.println(str.charAt(i));
                break;
            }
        }

        //For first repeating
        for(int i=0;i<str.length();i++){
            if(map.get(str.charAt(i)) > 1){
                System.out.println(str.charAt(i));
                break;
            }
        }

    }
}
