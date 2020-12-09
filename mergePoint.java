

    // Complete the findMergeNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        int mergePoint=-999;
        SinglyLinkedListNode temp=head2;
        while(head1!=null){
            while(temp!=null){
                if(head1==temp){
                    mergePoint= head1.data;
                    return mergePoint;
                }
                temp=temp.next;
            }
            head1=head1.next;
            temp=head2;
        }
        return mergePoint;
    }


