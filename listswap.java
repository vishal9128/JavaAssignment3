
import java.util.ArrayList;
import java.util.List;

public class listswap {
    public static void main(String[] args) {
        String temp;
        List<String> s1 = new ArrayList<>();
        s1.add("Apple");
        s1.add("Banana");
        s1.add("Cherry");
        s1.add("Date");
//        System.out.println(s1);
        int n = s1.size();
        int start=0;
        int end=n-1;
        while (start < end){
            temp = s1.get(start);
            s1.set(start, s1.get(end));
            s1.set(end, temp);
            start++;
            end--;
        }
        System.out.println(s1);
    }
}
