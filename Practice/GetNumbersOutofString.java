package Practice;

public class GetNumbersOutofString {

    public static void main(String[] args) {
        String s = "dkjsg45vkbfkfae73i2nffksa72";
        String s1 = s.replaceAll("[^0-9]"," ");
        String s2 = s1.replaceAll(" +","-");
        int sum=0;
        String[] strArr = s2.split("-");
        for (String str : strArr){
            if(!str.isEmpty()){
                sum += Integer.parseInt(str);
            }
        }
        System.out.println(sum);
    }
}
