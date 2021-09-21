// Возьмем средний элемент отсортированного массива и сравним его c искомым.
// Если элемент меньше – продолжим поиск в левой части массива, если больше в правой, пока не останется нужный элемент.
// Таким образом нам понадобится число операций равное тому, сколько раз нам нужно поделить массив размером n пополам.
public class BinarySearch {
    public static int binarySearch(int[] sortedArray, int key) {
        int low = 0;
        int high = sortedArray.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key > sortedArray[mid]) {
                low = mid + 1;
            } else if (key < sortedArray[mid]) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}