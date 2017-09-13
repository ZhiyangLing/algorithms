package sort;

/**
 * Created by lzy on 17-9-13.
 * 选择排序算法
 * 每一趟确定一个元素的最终位置
 */
public class SelectionSort {
    public static void sort(int[] a){
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i+1; j <n; j++) {
                if(a[min] > a[j])
                    min = j;
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] a = {1,3,2,6,4};
        sort(a);
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }
    }
}
