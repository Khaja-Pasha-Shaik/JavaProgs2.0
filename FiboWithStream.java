import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FiboWithStream {

    public static void main(String[] args) {

        int n=10;
        IntStream.range(0,n).forEach(i -> {
            System.out.print(fibo(i)+" ");
        });

       List<Integer> ds =  Stream.iterate(new int[]{0,1}, f -> new int[]{f[1], f[0]+f[1]})
                .limit(n)
                .map(f -> f[0])
                .collect(Collectors.toList());
        System.out.println(ds);

    }

    public static int fibo(int n){
        if(n<=1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
