package map;

import java.util.*;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		
		Iterator<Map.Entry<String, Integer>> entryiter = entrySet.iterator();
		
		int count = 0;

		while(entryiter.hasNext()) {
			Map.Entry<String, Integer> entry = entryiter.next();
			if(count == 0) {
				name = entry.getKey();
				maxScore = entry.getValue();
			}
			
			if(count >= 1 && maxScore < entry.getValue()) {
				name = entry.getKey();
				maxScore = entry.getValue();
			}
			totalScore += entry.getValue();
			count++;
		}
		
		System.out.println("평균 점수 : " +(totalScore/count));
		System.out.println("최고점수 : " +maxScore);
		System.out.println("최고점수를 받은 아이디 : "+name);
	}
}
