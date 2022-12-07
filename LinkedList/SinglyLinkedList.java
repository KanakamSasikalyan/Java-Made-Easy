
public class SinglyLinkedList{
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	static Node head = null;
	//insert node at the beginnig of linkelist
	public static void insertBeg(int data){
		Node node = new Node(data);
		if(head == null){
			head = node;
		}
		else{
			node.next = head;
			head = node;
		}
	}
	
	//insert node at the end of linkedlist
	public static void insertEnd(int data){
		Node node = new Node(data);
		if(head == null){
			head = node;
			return;
		}
		Node p = head;
		while(p.next!=null){
			p = p.next;
		}
		p.next = node;
	}

	public static int len(){
		int len = 0;
		Node p = head;
		while(p!=null){
			len++;
			p = p.next;
		}
		return len;
	}

	//insert node at a position in the linkedlist
	public static void insertPos(int data, int pos){
		Node node= new Node(data);
		if(pos==1){
			insertBeg(data);
			return;
		}
		else if(pos>len()){
			return;
		}
		int i=1;
		Node p = head;
		while(i<pos-1){
			p = p.next;
			i++;
		}
		node.next = p.next;
		p.next = node;
	}

	//delete node at beggining of a linkedlist
	public static void deleteBeg(){
		head = head.next;
	}
	
	//delete node at end of linkedlist
	public static void deleteEnd(){
		Node prev = null, curr = head;
		while(curr.next!=null){
			prev = curr;
			curr = curr.next;
		}
		prev.next = null;
	}
	
	//delete node at poistion of linkedlist
	public static void deletePos(int pos){
		if(head==null){return;}
		int i=1;
		Node p=head;
		while(i<pos-1){
			i++;
			p = p.next;
		}
		p.next = p.next.next;
	}
	

	//search a key in the linkedlist
	public static boolean searchKey(int key){
		Node curr = head;
		while(curr!=null){
			if(curr.data==key){
				return true;
			}
			curr = curr.next;
		}
		return false;
	}
	

	//print linkedlist
	public static void printList(){
		Node curr = head;
		while(curr!=null){
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		System.out.println();
	}
	
	//reverse linkedlist
	public static void reverseList(){
		Node prev = null, curr = head, next = null;
		while(curr!=null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
	}

	//find the middle node in linkedlist
	public static int findMiddle(){
		Node fast = head, slow = head;
		while(fast!=null&&fast.next!=null){
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}

	//find the nth node from the end
	public static int findNthNode(int n){
		int i = len()-n;
		Node p = head;
		while(i-->0){
			p = p.next;
		}
		return p.data;
	}
	public static void main(String[] args){
		insertBeg(10);
		insertBeg(20);
		insertBeg(45);

		insertEnd(100);
		insertPos(200,3);
		printList();

		/*deleteBeg();
		printList();
		deleteEnd();
		printList();
		deletePos(2);
		printList();

		System.out.println(searchKey(1000));
		reverseList();
		printList();*/
		System.out.println("Middle node is:"+findMiddle());
		System.out.println("Nthnode from end:"+findNthNode(2));
	}
}
