package Practice;


public class HashMapImplApp {

    public static void main(String[] args) {

        HashMapImpl<String, Integer> map = new HashMapImpl<>();

        map.put("India", 30);
        map.put("pak",50);
        map.put("Us",160);
        map.put("India2", 30);
        map.put("pak2",50);
        map.put("Us2",160);
        map.put("India3", 30);
        map.put("pak3",50);
        map.put("Us3",160);

        System.out.println(map);

        System.out.println(map.get("pak"));

        map.remove("Us");

        System.out.println(map);
    }
}
