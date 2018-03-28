package seu.Andre.seventhtwenty;

import java.util.HashMap;
import java.util.Map;

public class CopyListwithRandomPointer {
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head == null){
            return null;
        }
        Map<RandomListNode, RandomListNode> map = new HashMap<>();
        RandomListNode cur = head;
        while(cur != null){
            map.put(cur, new RandomListNode(cur.label));
            cur = cur.next;
        }
        for(Map.Entry<RandomListNode, RandomListNode> entry : map.entrySet()){
            RandomListNode node = entry.getValue();
            node.next = map.get(entry.getKey().next);
            node.random = map.get(entry.getKey().random);
        }
        return map.get(head);
        
        
    }
}
class RandomListNode {
	int label;
	RandomListNode next, random;
	RandomListNode(int x) { this.label = x; }
}
