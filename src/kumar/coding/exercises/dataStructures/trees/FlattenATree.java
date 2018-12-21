package kumar.coding.exercises.dataStructures.trees;

import kumar.codeing.exercise.model.TreeNode;

public class FlattenATree {
	static TreeNode prev = null;
	public static void main(String[] args) {
		TreeNode head = new TreeNode(2);
		head.left = new TreeNode(1);
		head.left.left = new TreeNode(0);
		head.left.left.left = new TreeNode(-1);
		head.left.right = new TreeNode(4);
		head.left.right.left = new TreeNode(-3);
		head.left.right.right = new TreeNode(8);
		head.right = new TreeNode(3);
		head.right.left = new TreeNode(-2);
		head.right.right = new TreeNode(5);
		head.right.right.right = new TreeNode(6);
		
		preOrderTraversal(head);
		System.out.println(" FYI..............ends here");
		flatten(head);
		preOrderTraversal(head);
	}
	
	public static void flatten(TreeNode root){
		if(root == null){
			return ;
		}
		
		flatten(root.left);
		flatten(root.right);
		
		root.left = null;
		root.right = prev;
		prev = root;
		
	}
	
	public static void preOrderTraversal(TreeNode root){
		if(root != null){
			System.out.println(root.val);
			if(root.left != null) preOrderTraversal(root.left);
			if(root.right != null) preOrderTraversal(root.right);
		}
	}
	
	public static void inOrderTraversal(TreeNode root){
		if(root != null){
			if(root.left != null) inOrderTraversal(root.left);
			System.out.println(root.val);
			if(root.right != null) inOrderTraversal(root.right);
		}
	}
	
	public static void treeTraversal(TreeNode root){
		if(root != null){
			System.out.println(root.val);
			if(root.left != null) treeTraversal(root.left);
			if(root.right != null) treeTraversal(root.right);
		}
	}
	

}
