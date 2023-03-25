import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int x : list) {
            if (x > 0) {
                list1.add(x);
            }
        }
        for (int x : list1) {
            if (x % 2 == 0) {
                list2.add(x);
            }
        }
        list2.sort(Comparator.naturalOrder());
        list2.forEach(System.out::println);
    }
}