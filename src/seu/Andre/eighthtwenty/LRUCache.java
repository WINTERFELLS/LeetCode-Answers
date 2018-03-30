package seu.Andre.eighthtwenty;

import java.util.LinkedHashMap;
import java.util.Map;

/*
 * 重写linkedHashMap的removeEldesEntry方法，将超过长度的去除
 * 需要采用第五种构造方法，使用accessOrder为true
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
