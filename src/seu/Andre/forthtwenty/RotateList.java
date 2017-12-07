package seu.Andre.forthtwenty;

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}

//the listnode confused me eha...
public class RotateList {
	public ListNode rotateRight(ListNode head, int k) {
		if(head == null) return head;

		int length = 0;
		ListNode node = head;
		while(node != null){
			node = node.next;
			length++;
		}
		k = k % length;

		ListNode fpart, lpart;
		lpart = head;
		for(int i = 1; i < length - k; i++){
			head = head.next;
		}

		fpart = head.next;
		head.next = null;

		if(fpart == null) return lpart;
		node = fpart;
		while(node.next != null){
			node = node.next;
		}
		node.next = lpart;

		return fpart;
	}
}
