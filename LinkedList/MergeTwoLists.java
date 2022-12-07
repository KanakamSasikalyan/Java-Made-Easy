
public class MergeTwoLists{
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	public static Node insertBeg(Node head, int data){
		Node node = new Node(data);
		if(head == null){
			head = node;
			return head;
		}
		node.next = head;
		head = node;
		return head;
	}
	
	public static Node mergeLists(Node head1, Node head2){
		Node new_head = null;
		if(head1==null){return head2;}
		else if(head2==null){return head1;}
		else{
			Node trav=null,p = head1, q = head2;
			if(p.data<=q.data){
				trav = p;
				p = p.next;
			}else{
				trav = q;
				q = q.next;
			}
			new_head = trav;
			while(p.next!=null||q.next!=null){
				if(p.data<=q.data){
					trav.next = p;
					p = p.next;
				}else{
					trav.next = q;
					q = q.next;
				}
				trav = trav.next;
			}
			if(p.data<q.data){
				trav.next=p;
				trav.next.next=q;
			}if(q.data<p.data){
				trav.next = q;
				trav.next.next=p;
			}
		}
		return new_head;
	}
	public static void printList(Node head){
		Node p = head;
		while(p!=null){
			System.out.print(p.data+" ");
			p = p.next;
		}
		System.out.println();
	}

	public static void main(String[] args){
		Node head1 = null ,head2 = null;
		head1 = insertBeg(head1, 90);
		head1 = insertBeg(head1, 40);
		head1 = insertBeg(head1, 20);
		head1 = insertBeg(head1, 10);

		head2 = insertBeg(head2, 80);
		head2 = insertBeg(head2, 70);
		head2 = insertBeg(head2, 30);
		
		printList(head1);
		printList(head2);
		Node head_new = mergeLists(head1, head2);
		printList(head_new);
	}
}

