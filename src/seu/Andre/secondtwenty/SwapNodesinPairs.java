package seu.Andre.secondtwenty;

class SwapNodesinPairs {
public ListNode swapPairs(ListNode head) {
        
        ListNode res = head;
        
        if(head == null || head.next == null){
            return res;
        }
        
        ListNode nextNode = head.next;
        res = nextNode;
        ListNode endNode = nextNode.next;
        nextNode.next = head;
        head.next = endNode;
        ListNode pre = head;
        
        while(pre.next != null){
            ListNode tempNow = pre.next;
            ListNode tempNext = tempNow.next;
            if(tempNext == null){
                break;
            }
            else{
                ListNode tempEnd = tempNext.next;
                pre.next = tempNext;
                tempNext.next = tempNow;
                tempNow.next = tempEnd;
                pre = tempNow;
            }
        }
        return res; 
    }
}
