package seu.Andre.eighthtwenty;

import java.util.LinkedHashMap;
import java.util.Map;

/*
 * ��дlinkedHashMap��removeEldesEntry���������������ȵ�ȥ��
 * ��Ҫ���õ����ֹ��췽����ʹ��accessOrderΪtrue
 */
public class LRUCache {
	private LinkedHashMap<Integer, Integer> map;
    private final int CAPACITY;
    public LRUCache(int capacity) {
        CAPACITY = capacity;
        map = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true){
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > CAPACITY;
            }
        };
    }
    public int get(int key) {
    	if(!map.containsKey(key)) { return -1; }
        return map.get(key);
    }
    public void set(int key, int value) {
        map.put(key, value);
    }
}
