package seu.Andre.eighthtwenty;

//一个链表遍历完去遍历另一个链表，相当于每个指针都走了相同的长度，那么它们就是会相遇的。
public class IntersectionofTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;

        ListNode a = headA;
        ListNode b = headB;

        while( a != b){

        	//就是这里
            a = a == null? headB : a.next;
            b = b == null? headA : b.next;    
        }

        return a;
    }
}
