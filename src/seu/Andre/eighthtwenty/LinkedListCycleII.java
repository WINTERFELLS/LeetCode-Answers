package seu.Andre.eighthtwenty;

//相遇点之后每次都走一步，必然相遇为连接点
public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                flag = true;
                break;
            }
        }
        if(flag){
            slow = head;
            System.out.println(slow.val+" "+fast.val);
            while(slow != fast){
                slow = slow.next;
                fast = fast.next;
            }
            return fast;
        }else{
            return null;
        }
    }
}
