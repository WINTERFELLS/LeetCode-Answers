package seu.Andre.eighthtwenty;

//floyd��Ȧ�㷨
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode first = head;
        ListNode second = head;
        while(second.next != null && second.next.next != null){
            first = first.next;
            second = second.next.next;
            if(first == second){
                return true;
            }
        }
        return false;
    }
}

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
		next = null;
	}
}