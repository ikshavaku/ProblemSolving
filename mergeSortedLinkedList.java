

    // Complete the mergeLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode result = new SinglyLinkedListNode(0);
        SinglyLinkedListNode resultPointer=result;
        while(true) {
            if(head1==null){
                System.out.print("head1=null");
                result.next=head2;
                break;
            } else if(head2==null){
                System.out.print("head2=null");
                result.next=head1;
                break;
            } else if(head1.data>=head2.data){
                SinglyLinkedListNode temp = new SinglyLinkedListNode(head2.data);
                System.out.print(head2.data);
                result.next=temp;
                result=result.next;
                head2=head2.next;
            } else if(head1.data<head2.data){
                SinglyLinkedListNode temp = new SinglyLinkedListNode(head1.data);
                System.out.print(head1.data);
                result.next=temp;
                result=result.next;
                head1=head1.next;
            } 
            
        }
        return resultPointer.next;
    }


