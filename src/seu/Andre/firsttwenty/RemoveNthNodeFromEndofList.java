package seu.Andre.firsttwenty;

class RemoveNthNodeFromEndofList {
	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = head;
        ListNode end;
        ListNode temp = head;
        for(int i = 0; i < n; i++){
            temp = temp.next;
        }
        if(temp == null){
            head = head.next;
            return head;
        }
        end = temp;
        while(end.next != null){
            end = end.next;
            start = start.next;
        }
        temp = start.next;
        start.next = temp.next;
        temp.next = null;
        return head;
    }
}
