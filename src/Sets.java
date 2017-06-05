import java.util.*;

//Sorting Set
public class Sets {
    public static void main(String[] args) {
        Random k = new Random(10);
        Set<Integer> s1 = new TreeSet<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for (int i=1; i<10; i++)
            s1.add(k.nextInt(100));

        System.out.println(s1);
    }
}
