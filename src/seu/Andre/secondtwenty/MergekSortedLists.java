package seu.Andre.secondtwenty;


public class MergekSortedLists {
	public ListNode mergeKLists(ListNode[] lists) { 
        return partion(lists, 0, lists.length-1);
    }
    
    public ListNode partion(ListNode[] lists, int start, int end){
        if(start == end){
            return lists[start];
        }
        if(start < end){
            int mid = (start+end)/2;
            ListNode l1 = partion(lists, start, mid);
            ListNode l2 = partion(lists, mid+1, end);
            return mergeTwoLists(l1,l2);
            
        }
        else{
            return null;
        }
        
    }
    
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        
        ListNode newHead;
        if(l1.val < l2.val){
            newHead = l1;
            newHead.next = mergeTwoLists(l1.next, l2);
        }
        else{
            newHead = l2;
            newHead.next = mergeTwoLists(l1,l2.next);
        }
        return newHead;
    }
}
