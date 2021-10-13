public class main {
    public static void main(String[] args) {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        System.out.println(binarySearch(list,61));
    }
    public static int binarySearch(int[] list, int key){
        int left = 0;
        int right = list.length;
        while (left <= right){
            int mid = (left + right) / 2;
            if(list[mid] == key){
                return mid;
            }
            else {
                if(key > list[mid]){
                    left = mid+1;
                }
                else {
                    right = mid-1;
                }
            }
        }
        return -1;
    }
}
