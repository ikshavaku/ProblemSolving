

    // Complete the hasCycle function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static boolean hasCycle(SinglyLinkedListNode head) {
        if(head.next==null || head==null){
            return false;
        }
        SinglyLinkedListNode cur1= head;
        SinglyLinkedListNode cur2=head.next;
        while(true){
            if(cur1==cur2){
                return true;
            }else if(cur1.next==null || cur2.next==null){
                return false;
            }else if(cur2.next.next==null){
                return false;
            }else{
                cur1=cur1.next;
                cur2=cur2.next.next;
            }
        }
    }

