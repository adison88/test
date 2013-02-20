package Trees;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class LevelOrder {

	private static ArrayList<Integer> inOrderList = new ArrayList<Integer>();
	private static ArrayList<Integer> preOrderList = new ArrayList<Integer>();
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

		printLevelOrder(root);
		
	}

	private static void printLevelOrder(TreeNode root) {
		// TODO Auto-generated method stub
		
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		
		q.add(root);
		
		while(!q.isEmpty())
		{
			TreeNode temp = q.remove();
			System.out.print(temp.data + " ");
			
			if(temp.left != null)
			{
				q.add(temp.left);
			}
			
			if(temp.right != null)
			{
				q.add(temp.right);
			}
		}
		
		
	}

}
