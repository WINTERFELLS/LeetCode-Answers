package seu.Andre.secondtwenty;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class MergeTwoSortedListsOne {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 ==null){
            return l1;
        }
        
        ListNode mergeHead;
        if(l1.val < l2.val){
            mergeHead = l1;
            mergeHead.next = mergeTwoLists(l1.next, l2);
        }
        else{
            mergeHead = l2;
            mergeHead.next = mergeTwoLists(l1, l2.next);
        }
        return mergeHead;
    }
}

class MergeTwoSortedListsTwo{
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res;
        ListNode temp;
        if(l1 == null && l2 == null){
            return null;
        }
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        if(l1.val < l2.val){
            res = l1;
            temp = l1;
            l1 = l1.next;
        }
        else{
            res = l2;
            temp = l2;
            l2 = l2.next;
        }
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                temp.next = l1;
                l1 = l1.next;
                temp= temp.next;
            }
            else{
                temp.next = l2;
                l2 = l2.next;
                temp= temp.next;
            }
        }
        if(l1 != null){
            temp.next = l1;
        }
        else if(l2 != null){
            temp.next = l2;
        }
        return res;
    }
}
