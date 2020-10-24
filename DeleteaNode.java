

    // Complete the deleteNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        SinglyLinkedListNode temp = head;
        if(position==0){
            head=head.next;
        }
        while(position>1){
            temp=temp.next;
            position=position-1;
        }
        temp.next=temp.next.next;
        return head;
    }

