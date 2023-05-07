import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                System.out.println(nums.get(i));
            }
        }
    }

    public static void task2() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 8, 2, 3, 4, 4, 5, 5, 6, 7));
        List<Integer> nums1 = new ArrayList<>(List.of());
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                nums1.add(nums.get(i));
                for (int j = i + 1; j < nums.size(); j++) {
                    if (nums.get(i) == nums.get(j)) nums.remove(j);
                }
            }
        }
        Collections.sort(nums1);

        System.out.println(nums1);
    }

    public static void task3() {
        String number = null;
        List<String> strings = new ArrayList<>(List.of("один", "один", "два", "два", "два", "три", "три", "три", "asdas"));
        Set<String> wordSet = new HashSet<>(strings);
        System.out.println(wordSet);
    }

    public static void task4() {
        List<String> strings = new ArrayList<>(List.of("один", "один", "два", "два", "два", "три", "три", "три", "asdas"));
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.size(); i++) {
            int counter = 0;
            for (int j = 0; j < strings.size(); j++) {
                if (strings.get(i).equals(strings.get(j))) map.put(strings.get(i), counter++);
            }
        }
        for (Map.Entry<String, Integer> values : map.entrySet()) {
            System.out.println(values.getValue());
        }
    }
}