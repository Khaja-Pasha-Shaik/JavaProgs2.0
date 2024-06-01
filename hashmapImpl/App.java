package hashmapImpl;

public class App {

    public static void main(String[] args) {

        HashMapImpl<String, Integer> map = new HashMapImpl<>();

        map.put("India", 10);
        map.put("Pak", 20);
        map.put("Us",30);
        map.put("India2", 10);
        map.put("Pak2", 20);
        map.put("Us2",30);
        map.put("India3", 10);
        map.put("Pak3", 20);
        map.put("Us3",30);
        map.put("India4", 10);
        map.put("Pak4", 20);
        map.put("Us4",30);

        System.out.println(map.keySet());
    }
}
