package kumar.coding.exercises.dataStructures.trees;

import kumar.codeing.exercise.model.TreeNode;

public class FlattenATree {
	static TreeNode prev = null;
	public static void main(String[] args) {
		TreeNode head = new TreeNode(1);
		head.left = new TreeNode(2);
		head.left.left = new TreeNode(3);
		head.left.right = new TreeNode(4);
		head.right = new TreeNode(5);
		head.right.right = new TreeNode(6);
		
		preOrderTraversal(head);
		System.out.println(" FYI..............ends here");
		flatten(head);
		preOrderTraversal(head);
	}
	
	public static void flatten(TreeNode root){
		if(root == null){
			return ;
		}
		
		flatten(root.right);
		flatten(root.left);
		
		root.left = null;
		root.right = prev;
		prev = root;
		
	}
	
	public static void preOrderTraversal(TreeNode root){
		if(root == null) {
			System.out.println("Null");	
		}else{
			System.out.println(root.val);
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
		}
		
	}
	
}
