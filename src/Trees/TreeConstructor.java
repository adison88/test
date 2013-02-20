package Trees;
import java.util.ArrayList;

public class TreeConstructor {

	private static ArrayList<Integer> inOrderList = new ArrayList<Integer>();
	private static ArrayList<Integer> preOrderList = new ArrayList<Integer>();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeConstructor tConstrcutor = new TreeConstructor();
		//tConstrcutor.populatePreOrderList(inOrderList);
		//tConstrcutor.populateInOrderList(preOrderList);
		//TreeNode root = tConstrcutor.constructTree(0, 0, 7,preOrderList,inOrderList);
		//tConstrcutor.performInOrderTraversal(root);
	}

	private void performInOrderTraversal(TreeNode node) {
		TreeNode left = node.getLeft();
		TreeNode right = node.getRight();

		if (left != null) {
			performInOrderTraversal(left);
		}

		System.out.println(node.getData());

		if (right != null) {
			performInOrderTraversal(right);
		}
	}

	public TreeNode constructTree(int preOrderIndex, int inOrderIndex,
			int length,ArrayList<Integer>preOrderList,ArrayList<Integer>inOrderList) {

		if (length == 0) {
			return null;
		}
		TreeNode rootNode = new TreeNode(preOrderList.get(preOrderIndex));
		int rootIndex = 0;
		for (int i = inOrderIndex; i < inOrderList.size(); i++) {
			int inOrderData = inOrderList.get(i).intValue();
			if (inOrderData == rootNode.getData()) {
				break;
			}
			rootIndex++;
		}
		rootNode.setLeft(constructTree(preOrderIndex + 1, inOrderIndex,
				rootIndex,preOrderList,inOrderList));
		rootNode.setRight(constructTree(preOrderIndex + rootIndex + 1,
				inOrderIndex + rootIndex + 1, length - (rootIndex + 1),preOrderList,inOrderList));
		return rootNode;
	}

	public void populateInOrderList(ArrayList<Integer> inOrderList) {
		inOrderList.add(5);
		inOrderList.add(10);
		inOrderList.add(12);
		inOrderList.add(15);
		inOrderList.add(20);
		inOrderList.add(35);
		inOrderList.add(40);
	}

	public void populatePreOrderList(ArrayList<Integer> preOrderList) {
		preOrderList.add(new Integer(15));
		preOrderList.add(new Integer(10));
		preOrderList.add(new Integer(5));
		preOrderList.add(new Integer(12));
		preOrderList.add(new Integer(35));
		preOrderList.add(new Integer(20));
		preOrderList.add(new Integer(40));
	}

}
