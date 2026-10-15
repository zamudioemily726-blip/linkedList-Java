
public class linkedList {
    private Node head;
    private Node tail;
    private int length;// londitud 
    class Node{
        int value;
        Node next;
        public Node(int value){
            this.value=value;
        }
    }
    public linkedList (int value){
        Node newNode=new Node(value);
        length=1;
        head=newNode;
        tail=newNode;
    }
    public void getHead(){
        System.out.println("Head:" + head.value);
    }
    public void getTail(){
        System.out.println("Tail:" + tail.value);
    }
    public void getLength(){
            System.out.println("Length:" + length);
    }
    public void append(int value){
        if(length==0){
            Node newNode=new Node(value);
            length=1;
            head=newNode;
            tail=newNode;
            return;
        }
        Node newNode=new Node(value);
        tail.next=newNode;
        tail=newNode;
        length++;
    }
    public void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
    public Node removeLast(){
        if(length==0){
            return null;
        }
        Node temp=head;
        Node pre=head;
        while(temp.next!=null){
            pre=temp;
            temp=temp.next;
        }
        tail=pre;
        tail.next=null;
        length--;
        if(length==0){
            head=null;
            tail=null;
        }
        return temp;
    }
    public void prepend (int n){
        Node newNode = new Node (n);
        
        if (length==0){
            head = newNode;
            tail = newNode;
        } else {
           newNode.next = head;
           head = newNode;
        } 
       length++;    
    }   
    public Node RemoveFirst(){
          if(length==0){
            return null;
        }
        Node temp=head;
        head = head.next;
        temp.next = null;  
        
        length--;
        if(length==0){
            head=null;
            tail=null;
        }
        return temp;
    }
        public boolean insert(int index, int value){
        if (index < 0 || index > length){
           return false; 
        }
        if (index == 0){
          prepend(value);
          return true;
        }
        if (index == length){
        append(value);
        return true;
        }
        Node newNode = new Node (value);
        Node temp= head;
        
        for (int i = 0; i< index - 1; i++){
        temp = temp.next;
        } 
        newNode.next = temp.next;
        
        temp.next= newNode;
        
        length++;
        return true;
    }
     public Node Remove(int index){
       if (index < 0 || index >= length){
           return null; 
        }
       if (index == 0){
           return RemoveFirst();
       }
       if (index == length -1){
           return removeLast();
       }
       
       Node pre = head; 
       
       for (int i=0; i<index -1; i++){
           pre= pre.next;      
       }
       Node temp =pre.next;
       pre.next= temp.next;
       temp.next = null;
       
       length --;
       return temp;          
     }   
     // 1. Nodo de en medio - sin usar length, una sola pasada
     public Node medio() {
     if (head == null) return null;
     Node lento = head;
     Node rapido = head;
     while (rapido != null && rapido.next != null) {
     lento = lento.next;
     rapido = rapido.next.next;
     }
     return lento;
     }

     // 3. Reverse - 3 apuntadores, sin otra lista, una pasada
    public void reverse() {
    Node prev = null;
    Node current = head;
    Node next = null;
    tail = head;
    while (current != null) {
    next = current.next;
    current.next = prev;
    prev = current;
    current = next;
 }
     head = prev;
}
}
