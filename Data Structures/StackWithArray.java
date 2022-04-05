class Stack{
    static int size = 5;  /* 50 100 200 300 400 ...... */
    static int[] Stack = new int[size];
    static int top = -1;
    static void push(int data){
        try {
         Stack[++top] = data;   
        } catch(Exception e) {
            System.out.println("StackOverflowError");
        }
    }
    
    static int pop(){
        if(top<0){
            System.out.println("StackUnderflowError");
            return -1;
        }
        int pop = Stack[top];
        top--;
        return pop;
    }
    
    static int peek(){
        return Stack[top-1];
    }
    
    static void printStack(){
        for(int i=top;i>=0;i--){
            System.out.println(Stack[i]);
        }
    }
    
    public static void main (String[] args) {
        /* code */
        pop();
        push(10);
        push(40);
        push(30);
        push(11);
        push(100);
        printStack();
        push(120);          //Error
        System.out.println("Peek element :"+peek());
        System.out.println("Height of Stack :"+top);
    }
}
