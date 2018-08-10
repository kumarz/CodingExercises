package kumar.coding.exercises.dataStructures.trees;

import java.util.List;

import kumar.codeing.exercise.model.TreeNode;

public class BinaryTreeTraversal {

	public static void main(String[] args) {
        TreeNode head = new TreeNode(1);
        head.left = new TreeNode(2);
        head.right = new TreeNode(3);
        head.left.left = new TreeNode(4);
        head.left.right = new TreeNode(5);
 
        System.out.println("Preorder traversal of binary tree is ");
        preOrderTraversal(head);
 
        System.out.println("\nInorder traversal of binary tree is ");
        inOrderTraversal(head);
 
        System.out.println("\nPostorder traversal of binary tree is ");
        postOrderTraversal(head);
        
	}
	
	private static void preOrderTraversal(TreeNode node){
		
		if(node == null){
			return;
		}
		
		System.out.print(node.val);
		
		preOrderTraversal(node.left);
		
		preOrderTraversal(node.right);
		
	}
	
	private static void inOrderTraversal(TreeNode node){
		if(node == null){
			return;
		}
		
		inOrderTraversal(node.left);
		
		System.out.print(node.val);
		
		inOrderTraversal(node.right);
		
	}
	
	private static void postOrderTraversal(TreeNode node){
		
		if(node == null){
			return;
		}
		
		postOrderTraversal(node.left);
		
		postOrderTraversal(node.right);
		
		System.out.print(node.val);
		
	}
	
}
