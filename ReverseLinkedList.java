

    // Complete the reverse function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        SinglyLinkedListNode cur1,cur2;
        cur1=head.next;
        cur2=cur1.next;
        head.next=null;
        while(cur2!=null){
            cur1.next=head;
            head=cur1;
            cur1=cur2;
            cur2=cur2.next;
        }
        cur1.next=head;
        head=cur1;
        return head;
    }

