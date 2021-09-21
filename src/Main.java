import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();
        int[] array = new int[] {3, -1, 5, 6, 91, 7, 1, 6, 7};
        System.out.println(Arrays.toString(sort.sort(array)));
        System.out.println(BinarySearch.binarySearch(array, 91));
    }
}