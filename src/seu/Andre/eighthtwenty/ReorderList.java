package seu.Andre.eighthtwenty;

public class ReorderList {
public void reorderList(ListNode head) {
        
        if(head == null || head.next == null){
            return;
        }
        ListNode p1 = head;
        ListNode p2 = head;
        //找到链表的中间节点
        while(p2.next != null && p2.next.next != null){
            p1 = p1.next;
            p2 = p2.next.next;
        }
        //将后面的结点进行转置
        ListNode preMiddle = p1;
        ListNode preCurrent = p1.next;
        ListNode next = null;
        ListNode pre = null;
        while(preCurrent != null){
            next = preCurrent.next;
            preCurrent.next = pre;
            pre = preCurrent;
            preCurrent = next;
        }
        preMiddle.next = pre;
        //交换位置
        p1 = head;
        p2 = pre;
        while(p1!=preMiddle){
            preMiddle.next=p2.next;
            p2.next=p1.next;
            p1.next=p2;
            p1=p2.next;
            p2=preMiddle.next;
        }
        
    }
}
