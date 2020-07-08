package linkedList;

public class LinkedListExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementLinkedList ilist= new ImplementLinkedList();
		ilist.append_node(23);
		ilist.append_node(23);
		ilist.append_node(45);
		ilist.append_node(45);
		ilist.append_node(45);
		ilist.append_node(64);
		ilist.append_node(79);
		ilist.append_node(79);
		ilist.append_node(79);
		
		//ilist.prepend_data(12);
		//ilist.insert_at(0,48);
		//ilist.delete_at(6);
		//ilist.insert_at(4,4);
		//ilist.reverse_linked_list(ilist.get_head());
		ilist.show_elements_in_linkedlist(ilist.removeDuplicates(ilist.get_head()));
		//System.out.println();
		//System.out.println(ilist.list_size());
		
		//ilist.print_reverse_list(ilist.reverse_linked_list(ilist.get_head()));
		//System.out.println(ilist.size_reverse_list());
		//System.out.println(ilist.size_reverse_list(ilist.get_head()));
		
		//ilist.show_elements_in_linkedlist();
		//System.out.println();
		//System.out.println(ilist.list_size());

	
	}
}
