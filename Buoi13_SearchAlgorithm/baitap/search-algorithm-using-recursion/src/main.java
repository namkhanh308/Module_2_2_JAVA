import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        int left = 0;
        int right = list.length - 1;
        int value = 46;
        System.out.println(binarySearch(list, left, right, value));
    }
    public static boolean binarySearch(int[] list, int left, int right, int value) {
        if (left > right) {
            return false;
        }
        int mid = (left + right) / 2;
        if (value == list[mid]) {
            return true;
        } else {
            if (value < list[mid]) {
                right = mid - 1;
                return binarySearch(list, left, right, value);
            } else {
                left = mid + 1;
                return binarySearch(list, left, right, value);
            }
        }
    }
}

