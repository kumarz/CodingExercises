package kumar.coding.exercises.dataStructures.trees;
/**
 * This exercise is to find if the given BST is valid.
 * @author Kumar
 *
 */
public class FinIisValidBST {
	public class TreeNode{
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) {
			 val = x; 
		}
	}
	
    TreeNode prev = null;
    public boolean isValidBST(TreeNode root) {
        return helper(root);
        
    }
    
    private boolean helper(TreeNode node){
      if(node == null)
          return true;
      boolean isLeftValid = helper(node.left) &&  (prev == null || node.val > prev.val);
      prev = node;
      return isLeftValid && helper(node.right);
    }
      
	public static void main(String[] args) {
		FinIisValidBST obj = new FinIisValidBST();
		TreeNode root = obj.new TreeNode(2);
		root.left = obj.new TreeNode(1);
		root.right = obj.new TreeNode(3);
		
		System.out.println(obj.isValidBST(root));
		
		System.out.println(obj.isItValidBST(root));

	}
	
	public boolean isItValidBST(TreeNode root) {    
	        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);       
    }
	
    public boolean isValid(TreeNode root, long min, long max)
    {
        if(root==null)
            return true;
        return root.val<max && root.val>min && isValid(root.left,min,root.val) && isValid(root.right,root.val,max);
    }

}
