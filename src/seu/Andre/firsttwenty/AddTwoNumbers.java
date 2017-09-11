package seu.Andre.firsttwenty;

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}

class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int temp = 0;
        ListNode l3 = new ListNode((l1.val+l2.val+temp)%10);
        ListNode head = l3;
        while(l1.next!=null&&l2.next != null){
            if(l1.val+l2.val+temp>=10){
                temp = 1;
            }else{
                temp = 0;
            }
            l3.next = new ListNode((l1.next.val+l2.next.val+temp)%10);
            l3 = l3.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        if(l1.next!= null){
            if(l1.val+l2.val+temp>=10){
                temp = 1;
                l1 = l1.next;
                l3.next = new ListNode((l1.val+temp)%10);
                l3 = l3.next;
                if(l1.val+temp<10){
                    temp = 0;
                }
                while(l1.next!= null){
                    if(l1.val+temp>=10){
                        temp = 1;
                    }else{
                        temp = 0;
                    }
                    l3.next = new ListNode((l1.next.val+temp)%10);
                    l3 = l3.next;
                    l1 = l1.next; 
                }
                if(l1.val+temp>=10){
                    l3.next = new ListNode(1);
                }
            }else{
                l3.next = l1.next;
            }
        }
        else if(l2.next!= null){
            if(l1.val+l2.val+temp>=10){
                temp = 1;
                l2 = l2.next;
                l3.next = new ListNode((l2.val+temp)%10);
                l3 = l3.next;
                if(l2.val+temp<10){
                    temp = 0;
                }
                while(l2.next!= null){
                    if(l2.val+temp>=10){
                        temp = 1;
                    }else{
                        temp = 0;
                    }
                    l3.next = new ListNode((l2.next.val+temp)%10);
                    l3 = l3.next;
                    l2 = l2.next; 
                }
                if(l2.val+temp>=10){
                    l3.next = new ListNode(1);
                }
            }else{
                l3.next = l2.next;
            }
        }
        else if(l1.val+l2.val+temp>=10){
            l3.next = new ListNode(1);
        }
        return head;
    }
}
