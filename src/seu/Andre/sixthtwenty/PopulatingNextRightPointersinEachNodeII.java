package seu.Andre.sixthtwenty;

public class PopulatingNextRightPointersinEachNodeII {
    public void connect(TreeLinkNode root) {
        while(root != null){
            TreeLinkNode tempNode = new TreeLinkNode(0);
            TreeLinkNode currentNode = tempNode;
            while(root != null){
                if(root.left != null){
                    currentNode.next = root.left;
                    currentNode = currentNode.next;
                }
                if(root.right != null){
                    currentNode.next = root.right;
                    currentNode = currentNode.next;
                }
                root = root.next;
            }
            root = tempNode.next;
        }
    }
}
