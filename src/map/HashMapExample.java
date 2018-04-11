package map;

import java.util.Map;
import java.util.*;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		
		map.put("jiyong", 1000);
		map.put("sana", 2000);
		System.out.println(map.size());
		
		//System.out.println("sana : " +map.get("sana"));
		
		
		Set<String> keyset = map.keySet();
		Iterator<String> iter = keyset.iterator();
		
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.println(key+" : "+ map.get(key));
		}

		///////////////////////////////////////////////////////////////
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		
		Iterator<Map.Entry<String, Integer>> entryIter = entrySet.iterator();
		
		while(entryIter.hasNext()){
			Map.Entry<String, Integer> entry = entryIter.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key+" "+value);
		}
		
	}

}
