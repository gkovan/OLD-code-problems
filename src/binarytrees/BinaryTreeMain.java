package binarytrees;

public class BinaryTreeMain {
	
	public static void main(String[] args) {
		CreateBinaryTree bt = new CreateBinaryTree();
		
		BinaryTreeNode<Integer> myTree = bt.createBinaryTree();
		
		System.out.println("In order tree traversal:");
		System.out.println("------------------------");
		TraverseBinaryTree.inOrderTreeTraversal(myTree);
		
		System.out.println("");
		System.out.println("Pre order tree traversal:");
		System.out.println("------------------------");
		TraverseBinaryTree.preOrderTreeTraversal(myTree);
		
		System.out.println("");
		System.out.println("Post order tree traversal:");
		System.out.println("------------------------");
		TraverseBinaryTree.postOrderTreeTraversal(myTree);
		
		System.out.println("");
		System.out.println("Height of a binary tree:");
		System.out.println("-------------------------");
		int height = TraverseBinaryTree.maxDepth(myTree);
		System.out.println("Height of tree is: " + height);	
		
		System.out.println("");
		System.out.println("Is binary tree balanced:");
		System.out.println("-------------------------");
		TraverseBinaryTree.checkBalanced(myTree);
		System.out.println("Is the tree balanced: " + TraverseBinaryTree.isBalanced);
		

		System.out.println("");
		System.out.println("Is binary tree symmetric:");
		System.out.println("-------------------------");
		BinaryTreeNode<Integer> mySymmetricTree = bt.createSymmetricBinaryTree();
		TraverseBinaryTree.isSymmetric(mySymmetricTree);

		
	
	}

}
