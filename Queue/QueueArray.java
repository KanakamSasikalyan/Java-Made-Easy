
public class QueueArray{
	static int[] arr = new int[100];
	static int front=0, rear = 0;
	public static void enqueue(int data){
		arr[rear++] = data;
	}
	public static int dequeue(){
		int temp = arr[front++];
		return temp;
	}
	public static void print(){
		for(int i=front;i<rear;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static boolean isEmpty(){
		if(front>=rear){
			return true;
		}
		return false;
	}
	
	public static void main(String[] args){
		enqueue(100);
		enqueue(200);
		enqueue(300);
		print();
		System.out.println("Value dequeued: "+dequeue());
		print();
		System.out.println("Value dequeued: "+dequeue());
		System.out.println("Value dequeued: "+dequeue());
		print();
		System.out.println(isEmpty());
	}
}
	
