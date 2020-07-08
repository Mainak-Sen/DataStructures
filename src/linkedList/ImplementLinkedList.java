package linkedList;

public class ImplementLinkedList {
Node head;
	
public void append_node(int data) {
	
		Node node=new Node(data);
		//node.data=data;
		
		if(head==null)
		{
			head=node;
		}
		else
		{
			Node current=head;
			while(current.next!=null)
			{
				current=current.next;
			}
			current.next=node;
		}
	
}

public void show_elements_in_linkedlist(Node head) {
	
Node curr= head;
			while(curr != null) {
				
				System.out.print(curr.data+" ");
				curr=curr.next;
			}
}

public void prepend_data(int data) {
	Node curr=head;
	Node node=new Node(data);
	head=node;
	//node.data=data;
	node.next=curr;	
}

public Node get_head() {
	Node curr =head;
	//System.out.println(head.data);
	return curr;
}

public void insert_at(int index,int data) {
	
	
	if(index==0)
	{
		prepend_data(data);
	}
    else if(index>(list_size()-1)){
		
		System.out.println("Index is out of bound");
	}
	else
	{
		Node node=new Node(data);
		//node.data=data;
	
	Node curr=head;
	for(int i=0;i<index-1;i++) {
		
		curr=curr.next;
		
	}
	node.next=curr.next;
	curr.next=node;
	
	}

	
}

public void delete_at(int index) {
	Node curr=head;
	if(index==0)
	{
		head=curr.next;
	}
	else if(index>(list_size()-1)){
		
		System.out.println("Index is out of bound");
	}
	else	
	{	
		Node curr1 =head;
		for(int j=0;j<index-1;j++) {
			
			curr=curr.next;
		}
		curr.next=curr.next.next;
	}
}

public int list_size() {
	int n=0;
	Node curr=head;
	while(curr!=null)
	{
		curr=curr.next;
		n++;
	}
	
	
	return n;
}

public Node reverse_linked_list(Node head) {
	
	Node current=head;
	Node previous=null;
	Node next=null;
	while(current!=null) {
		next=current.next;
		current.next=previous;
		previous=current;
		current=next;
	}
	head=previous;
	return head;
	
	
}
public void print_reverse_list(Node head) {
	int k=0;
	Node current=head;
	while(current!=null) {
		
		System.out.print(current.data+" ");
		current=current.next;
		k++;
	}
	System.out.println();
	System.out.println("The size of the reversed list is:"+k);
}

//recursive solution for removing duplicates in a linked list 
public static Node removeDuplicates(Node head) {
    //Write your code here
	if(head==null || head.next==null)
	{
		return head;
	}
	else
	{
      if(head.data==head.next.data)
      {
    	  head.next=head.next.next;
    	  removeDuplicates(head);
      }
      else
      {
    	  removeDuplicates(head.next);
      }
	}
	return head;
	
  }


/*public int size_reverse_list() {
	int k=0;
	Node reversehead=reverse_linked_list(get_head());
	Node current=reversehead;
	while(current!=null) {
		
		current=current.next;
		k++;
	}
	return k;
}*/





}
