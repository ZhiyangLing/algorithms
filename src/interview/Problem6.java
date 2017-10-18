package interview;

/**
 * Created by lzy on 17-10-18.
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，
 * 则重建二叉树并返回。
 */

import java.util.Arrays;

/**
 * Definition for Arrays.copyOfRange method
 * static int[] copyOfRange(int[] original, int from, int to)
 *     int[] original->被复制的数组
 *     int from->复制的开始位置(包含)
 *     int to->复制的结束位置(不包含)
 */
   class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Problem6 {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre==null ||in==null || pre.length<=0)
            return null;
        TreeNode root= new TreeNode(pre[0]);
        for(int i =0; i<in.length;i++){
            if(pre[0]==in[i]){
                root.left=reConstructBinaryTree(Arrays.copyOfRange(pre,1,i+1),Arrays.copyOfRange(in,0,i));
                root.right=reConstructBinaryTree(Arrays.copyOfRange(pre,i+1,pre.length),Arrays.copyOfRange(in,i+1,in.length));
            }
        }
        return root;
    }
}