package seu.Andre.eighthtwenty;

//归并排序
public class SortList {
	public ListNode sortList(ListNode head) {
	    if (head == null || head.next == null)
	      return head;

	    ListNode pre = null, slow = head, fast = head;
	    
	    while (fast != null && fast.next != null) {
	      pre = slow;
	      slow = slow.next;
	      fast = fast.next.next;
	    }
	    
	    //这个很重要
	    pre.next = null;
	    
	    ListNode l1 = sortList(head);
	    ListNode l2 = sortList(slow);

	    return merge(l1, l2);
	  }
	  
	  ListNode merge(ListNode l1, ListNode l2) {
	    ListNode l = new ListNode(0), p = l;
	    
	    while (l1 != null && l2 != null) {
	      if (l1.val < l2.val) {
	        p.next = l1;
	        l1 = l1.next;
	      } else {
	        p.next = l2;
	        l2 = l2.next;
	      }
	      p = p.next;
	    }
	    
	    if (l1 != null)
	      p.next = l1;
	    
	    if (l2 != null)
	      p.next = l2;
	    
	    return l.next;
	  }
}
