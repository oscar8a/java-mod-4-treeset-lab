import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        int[] numbers = { 1, 4, 5, 2, 34, 36, 5, 4, 23, 45, 6, 8, 56, 34, 37 };
        ArrayList<Integer> res = getNums(numbers);
        System.out.println(res); // [34, 36, 37, 45, 56]
    }

    public static ArrayList<Integer> getNums(int[] nums) {
        ArrayList<Integer> numsArrayList = new ArrayList<>();
        for (int n : nums) {
            numsArrayList.add(n);
        }
        TreeSet<Integer> ts = new TreeSet<>(numsArrayList);
        return new ArrayList<>(ts.tailSet(25));
    }
}
