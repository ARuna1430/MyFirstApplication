package firstApp;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapJava {
	public static void main(String ar[]) {
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(3, "Welcome");
		map.put(1, "good");
		map.put(6, "hello");
		map.put(5, "hi");
		
		System.out.println("map is:"+map);
		//map.forEach((k,v) -> System.out.println("key is:"+k+"value is:"+v));
		
		System.out.println("keyset is:"+map.keySet());
		System.out.println("keyset is:"+map.values());
		
		TreeMap treeMap = new TreeMap();
		treeMap.putAll(map);
		
		System.out.println("Sorted Map is:"+treeMap);
		treeMap.forEach((k,v) -> System.out.println("key is:"+k+"value is:"+v));
		System.out.println("map is:"+map);

		
		//<Integer,String> sortedMap = sorts(map);
		//Collections.sort((Map.entry<K,V> entry1,Map.entry<K, V> entry2);

		
	}

}
