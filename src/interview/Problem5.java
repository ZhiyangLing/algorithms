package interview;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by lzy on 17-10-18.
 * 输入一个链表，从尾到头打印链表每个节点的值。
 */
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Problem5 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> s = new Stack<Integer>();
        ArrayList<Integer> newList = new ArrayList<Integer>();
        ListNode t = listNode;
        while (t != null) {
            s.push(t.val);
            t = t.next;
        }
        while (!s.empty()) {
            newList.add(s.pop());
        }
        return newList;
    }

    public static void main(String[] args) {

    }
}
