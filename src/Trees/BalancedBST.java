package Trees;

import java.util.ArrayList;

public class BalancedBST {
	
	private static ArrayList<Integer> inOrderList = new ArrayList<Integer>();
	private static ArrayList<Integer> preOrderList = new ArrayList<Integer>();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeConstructor tConstrcutor = new TreeConstructor();
		inOrderList.add(5);
		inOrderList.add(10);
		inOrderList.add(12);
		inOrderList.add(15);
		inOrderList.add(20);
		inOrderList.add(35);
		inOrderList.add(40);
		preOrderList.add(new Integer(15));
		preOrderList.add(new Integer(10));
		preOrderList.add(new Integer(5));
		preOrderList.add(new Integer(12));
		preOrderList.add(new Integer(35));
		preOrderList.add(new Integer(20));
		preOrderList.add(new Integer(40));
		
		TreeNode root = tConstrcutor.constructTree(0, 0, 7,preOrderList,inOrderList);

		if(isBalanced(root))
		{
			System.out.println("BSTree is balanced.");
		}
		else
		{
			System.out.println("BSTree is not balanced.");
		}
		
	}

	private static boolean isBalanced(TreeNode root) {
		
		if(checkBalanced(root) == -1)
		{
			return false;
		}
		else
		{
			return true;
		}
		
	}

	private static int checkBalanced(TreeNode root) {
		
		if(root == null)
		{
			return 0;
		}
		
		int leftHeight = checkBalanced(root.left);
		if(leftHeight == -1)
		{
			return -1;
		}
		
		int rightHeight = checkBalanced(root.right);
		if(rightHeight == -1)
		{
			return -1;
		}
		
		if(Math.abs(leftHeight-rightHeight) > 1)
		{
			return -1;
		}
		else
		{
			return Math.max(leftHeight,rightHeight)+1;
		}
		
		
		
		
		
		
		
	}

}
