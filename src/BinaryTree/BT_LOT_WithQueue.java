package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BT_LOT_WithQueue {
    BT_Node root;
	//we will be visiting the nodes from root ,print it and enqueue its children (FIFO)
	public void print_level_order() {
	Queue<BT_Node> q=new LinkedList<BT_Node>();
	q.add(root);
	while(!q.isEmpty())
	{
		BT_Node temp_q_head=q.poll();
		System.out.print(temp_q_head.data+" ");
		if(temp_q_head.left!=null)
		{
			q.add(temp_q_head.left);
		}
		if(temp_q_head.right!=null)
		{
			q.add(temp_q_head.right);
		}
	}
	
	}
	
	
}
