package seu.Andre.eighthtwenty;

//һ�����������ȥ������һ�������൱��ÿ��ָ�붼������ͬ�ĳ��ȣ���ô���Ǿ��ǻ������ġ�
public class IntersectionofTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;

        ListNode a = headA;
        ListNode b = headB;

        while( a != b){

        	//��������
            a = a == null? headB : a.next;
            b = b == null? headA : b.next;    
        }

        return a;
    }
}
