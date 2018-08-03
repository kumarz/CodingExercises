package kumar.coding.exercises.dataStructures.trees;
/**
 * This is the exercise to find the kth smallest element in a BST
 * @author Kumar
 *
 */
public class kthSmallestElementInBST {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
    
	public static void main(String[] args) {
		kthSmallestElementInBST obj = new kthSmallestElementInBST();
		TreeNode head = obj.new TreeNode(2);
		head.left = obj.new TreeNode(1);
		head.right = obj.new TreeNode(3);
		System.out.println(kthSmallest(head, 1));	
	}
	
    public static int kthSmallest(TreeNode root, int k) {
        int depth = 0;
        int counter = 0;
        TreeNode aroot = root;
        while(aroot != null){
            depth++;
            aroot = aroot.left;
        }
        depth = depth - k ;
        if(depth <= 0){
            depth = 0;
            return root.val;
        }
        
        while(root != null){
            counter++;
            System.out.println("value is " + root.val);
            root = root.left;
            System.out.println("depth is " + depth);
            System.out.println("counter is " + counter);
            if(root != null){
                System.out.println("value is " + root.val);
            }
            
            if(counter == depth && root != null){
                System.out.println("value is " + root.val);
                return root.val;
            }
        }
        
        return 0;
        
    }
	

}
