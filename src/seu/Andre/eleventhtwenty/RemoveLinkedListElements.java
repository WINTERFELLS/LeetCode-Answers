package seu.Andre.eleventhtwenty;

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val == val){
            head = head.next;
        }
        ListNode first = head;
        while(head != null){
            if(head.next != null){
                if(head.next.val == val){
                    head.next = head.next.next;
                    continue;
                }   
            }
            head = head.next;
        }
        return first;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}