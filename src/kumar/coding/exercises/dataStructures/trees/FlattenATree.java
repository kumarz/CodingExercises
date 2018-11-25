package kumar.coding.exercises.dataStructures.trees;

import kumar.codeing.exercise.model.TreeNode;

public class FlattenATree {

	public static void main(String[] args) {
		TreeNode head = new TreeNode(2);
		head.left = new TreeNode(1);
		head.right = new TreeNode(3);
		head.left.left = new TreeNode(0);
		head.left.right = new TreeNode(4);
		head.right.left = new TreeNode(-2);
		head.right.right = new TreeNode(5);
		treeTraversal(head);
		
		TreeNode temp = null;
		temp = flatten(head, temp);
		treeTraversal(temp);
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
	
	public static TreeNode flatten(TreeNode root, TreeNode temp){
		if(root == null){
			return null;
		}
		
		flatten(root.left, temp);
		flatten(root.right,temp);
		
		return root;
	}

}
