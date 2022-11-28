class Cnode{
    int data;
    Cnode next;
    Cnode(int data){
        this.data = data;
        this.next = null;
    }
}

class CircularList{
    Cnode last;          //null
    
    void insert(int data){
        Cnode node = new Cnode(data);
        if(last == null){
            last = node;
            last.next = last;
            return;
        }
        node.next = last.next;
        last.next = node;
        last = node;
    }
    
    void insertBeg(int data){
        Cnode node = new Cnode(data);
        node.next = last.next;
        last.next = node;
    }
    
    void insertPos(int data, int pos){
        Cnode node = new Cnode(data);
        int i=1;
        Cnode p = last.next;
        while(i<pos-1){
            p = p.next;
            i++;
        }
        node.next = p.next;
        p.next = node;
    }
    
    int length(){
        int i=1;
        Cnode p=last.next;
        while(p!=last){
            i++;
            p = p.next;
        }
        return i;
    }
    
    void deleteBeg(){
        last.next = last.next.next;
    }
    
    void deleteEnd(){
        Cnode curr = last.next, prev = null, temp=last.next;
        while(curr!=last){
            prev = curr;
            curr = curr.next;
        }
        last = prev;
        last.next = temp;
    }
    
    void printList(){
        Cnode curr = last.next;
        while(curr!=last){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.print(curr.data+"\n");
    }
    
    public static void main (String[] args) {
        /* code */
        CircularList list = new CircularList();
        list.insert(10);
        list.insert(67);
        list.insert(34);
        list.insert(35);
        
        list.insertBeg(100);
        list.insertPos(2,2);
        list.printList();
        System.out.println("CircularList Length is : "+ list.length());
        
        list.deleteBeg();
        list.printList();
        
        list.deleteEnd();
        list.printList();
    }
}
