package sort;

/**
 * Created by lzy on 17-9-13.
 * 插入排序算法
 * 1.折半查找出元素的待插入位置
 * 2.统一移动插入位置之后的元素
 */
public class InsertSort {
    public static void sort(int[] a) {
        int n = a.length;
        int i, j, low, high, mid, key;
        for (i = 1; i < n; i++) {
            low = 0;
            high = i - 1;
            mid = (low + high) / 2;
            key = a[i];
            while (low <= high) {
                mid = (low + high) / 2;
                if (a[mid] > key) high = mid - 1;
                else low = mid + 1;
            }
            for (j = i; j > high; j--) {
                a[j] = a[j - 1];
            }
            a[high + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 2, 6, 4};
        sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
