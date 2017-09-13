import java.util.Scanner;

/**
 * Created by lzy on 17-9-11.
 * 统计括号序列的深度 ()(())深度为2 ()深度为1
 */
public class MatchBrackets {
    public static int count(String s) {
        if (s == null) return 0;
        int num = 0;
        int max = 0;
//        int[] length=new int[25];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                num++;
                if (max < num) max = num;
            }
            if (s.charAt(i) == ')')
                num--;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(count(s));

    }
}
