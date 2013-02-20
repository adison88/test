package Trees;

public class TreeNode {
	
	int data;
	TreeNode left;
	
	
	
	public TreeNode(int data) {
	
		this.data = data;
		
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}

	public void setData(int data) {
		this.data = data;
	}

	TreeNode right;
	
	public int getData()
	{
		return data;
	}
	
	

}
