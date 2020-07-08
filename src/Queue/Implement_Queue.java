package Queue;

import java.util.LinkedList;

//Program to implement queue with linkedlist: Concept of Queue-> FirstInFirstOut(FIFO)
//Concept of Stack-> LASTINFIRSTOUT(LIFO)

public class Implement_Queue {

    LinkedList<Integer> queue;
    
    public Implement_Queue() {
    	
    	queue=new LinkedList<Integer>();
    }
    
    public boolean is_empty() {
    	return queue.isEmpty();
    }
    
    public int size() {
    	return queue.size();
    }
    
    public void enqueue(int data) {
    	queue.addLast(data);
    }
    
    public int dequeue() {
    	return queue.removeFirst();
    }
    public int peek() {
    	return queue.getFirst();
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Implement_Queue Q= new Implement_Queue();
		Q.enqueue(5);
		Q.enqueue(4);
		Q.enqueue(3);
		Q.enqueue(2);
		Q.enqueue(1);
		
		System.out.println(Q.size());
		System.out.println("The first element dequeued is:"+Q.dequeue());
		System.out.println("The second element dequeued is:"+Q.dequeue());
		System.out.println("The third element dequeued is:"+Q.dequeue());
		System.out.println("The fourth element dequeued is:"+Q.dequeue());
		//System.out.println("The fifth element dequeued is:"+Q.dequeue());
		
		System.out.println(Q.is_empty());
		System.out.println(Q.peek());
		
		
		

	}

}
