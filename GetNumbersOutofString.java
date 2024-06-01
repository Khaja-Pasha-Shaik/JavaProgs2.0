import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class GetNumbersOutofString {

    public static void main(String[] args) {
        AtomicInteger sum= new AtomicInteger();
        String s = "qjbf5fbia98fhu6jjc89";
        String s2 = s.replaceAll("[^0-9]"," ");
        System.out.println(s2);
        String s3 = s2.replaceAll(" +","-");
        System.out.println(s3);
        String[] s4 = s3.split("-");
        Arrays.stream(s4).forEach(str -> {
            if(!str.equals(""))
                sum.addAndGet(Integer.parseInt(str));
        });
        System.out.println(sum);
    }

}
