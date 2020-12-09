

    // Complete the reverse function below.

    /*
     * For your reference:
     *
     * DoublyLinkedListNode {
     *     int data;
     *     DoublyLinkedListNode next;
     *     DoublyLinkedListNode prev;
     * }
     *
     */
    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
        DoublyLinkedListNode temp=head,temp2=head;
        while(head!=null){
            temp=head.next;
            head.next=head.prev;
            head.prev=temp;
            head=head.prev;
        }
        while(temp2.prev!=null){
            temp2=temp2.prev;
        }
        return temp2;
    }


