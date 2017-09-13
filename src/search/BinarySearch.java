package search;

/**
 * Created by lzy on 17-9-12.
 * 二分查找算法
 */
public class BinarySearch {
    public static int rank(int[] array, int key) {
        int low = 0, high = array.length - 1, mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (array[mid] == key)
                return mid;
            else if (array[mid] > key)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,3,5,4,2};
        int key = 3;
        System.out.println(rank(arr,key));
    }
}
