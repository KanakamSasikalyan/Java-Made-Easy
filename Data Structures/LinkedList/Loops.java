
public class Loops{
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	//check linkedlist contains loop
	public static boolean haveLoop(Node head){
		Node fast = head, slow = head;
		while(fast!=null&&fast.next!=null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow==fast){
				return true;
			}
		}
		return false;
	}
	
	//remove loop in the linkedlist
	public static Node removeLoop(Node head){
		Node fast = head, slow = head;
		while(fast!=null&&fast.next!=null){
			slow = slow.next;
			fast = fast.next.next;
			if(fast == slow){
				break;
			}
		}
		Node p = head, prev = null;
		while(p!=slow){
			p = p.next;
			prev = slow;
			slow = slow.next;
		}
		prev.next = null;
		return head;
	}

	//find start of loop
	public static int findStart(Node head){
		Node fast = head, slow = head;
		while(fast!=null&&fast.next!=null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow==fast){
				break;
			}
		}
		Node st = head;
		while(slow!=st){
			slow = slow.next;
			st = st.next;
		}
		return st.data;
	}
		
	//print linkedlist
	public static void printList(Node head){
		Node p = head;
		while(p!=null){
			System.out.print(p.data+" ");
			p = p.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		Node head = null;
		Node first = new Node(10);
		Node sec = new Node(20);
		Node thi = new Node(30);
		Node fou = new Node(40);
		Node fif = new Node(50);
		Node six = new Node(60);

		head = first;
		first.next=sec;
		sec.next = thi;
		thi.next = fou;
		fou.next = fif;
		fif.next = six;
		six.next = thi;
		System.out.println("Linkedlist have loop?: "+haveLoop(head));
		System.out.println("Find start loop: "+findStart(head));
		head = removeLoop(head);
		printList(head);
	}
}
