interface Lifo {
    void push(int i);
    int pop();
}

class Node {
    int data;
    Node next;

    Node(int i){
        this.data=i;
        this.next=null;
    }
}

class Stacks implements Lifo {
    Node head=null;    
    public void push(int i){
        if(this.head==null){
            this.head= new Node(i);
        }else{
            Node top = new Node(i);
            top.next=this.head;
            this.head=top;
        }
    }
    public int pop(){
        if(this.head==null){
            System.out.print("The Stack is empty");
        }
        else {
            int temp=this.head.data;
            this.head=this.head.next;
            return temp;
        }
        return 0;
    }
    void printStack(){
        Node temp = this.head;
        System.out.println("The current stack is");
        while(temp!=null){
            System.out.println(temp.data);
            System.out.println("-----");
            temp=temp.next;
        }
    }
}

class Stack{
    public static void main(String[] args){
        Stacks a = new Stacks();
        a.push(5);
        a.push(4);
        a.push(7);
        a.push(8);
        a.push(11);
        a.printStack();
        System.out.println("Top element popped from stack ----" + a.pop());
        System.out.println("Top element popped from stack ----" + a.pop());
        System.out.println("Top element popped from stack ----" + a.pop());
        System.out.println("Top element popped from stack ----" + a.pop());
        a.printStack();
        a.push(39);
        a.push(22);
        a.push(1);
        a.push(91);
        a.push(45);
        a.push(77);
        a.push(12);
        a.push(95);
        a.push(1);
        a.push(0);
        a.printStack();
    }
}