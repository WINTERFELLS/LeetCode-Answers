package seu.Andre.eleventhtwenty;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if(head == null){
            return true;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast != null) { 
            slow = slow.next;
        }
        ListNode tail = resver(slow);
        while(head != null && tail != null){
            if(head.val != tail.val){
                return false;
            }else{
                head = head.next;
                tail = tail.next;
            }
        }
        return true;
    }
    
    public ListNode resver(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        while(cur != null){
            ListNode temp = cur;
            cur = cur.next;
            temp.next = pre;
            pre = temp;
        }
        return pre;
    }
}
