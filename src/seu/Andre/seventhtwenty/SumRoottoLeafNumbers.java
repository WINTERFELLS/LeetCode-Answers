package seu.Andre.seventhtwenty;

public class SumRoottoLeafNumbers {
    public int[] tempNum = new int[10000];
    public int count = 0;
    public int sumNumbers(TreeNode root) {
        if(root == null){
            return 0;
        }
        dfs(root, 0);
        int res = 0;
        for(int i = 0; i < count; i++){
            System.out.println(tempNum[i]);
            res += tempNum[i];
        }
        return res;
    }
    public void dfs(TreeNode root, int pre){
        if(root.left != null){
            dfs(root.left, pre*10+root.val);
        }
        if(root.right != null){
            dfs(root.right, pre*10+root.val);
        }
        if(root.left == null && root.right == null){
            pre = pre*10+root.val;
            tempNum[count] = pre;
            count++;
        }
    }
}
