package arrayList;

import java.util.*;;

public class ArrayAsListExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("hong", "shin", "gam");
		
		List<String> list3 = new ArrayList<String>(list); //리스트를 ArrayList변경 후 추가
		list3.add("sjy");
		
		
		for(String l : list3) {
			System.out.println(l);
		}
		
		List<Integer> list2 = Arrays.asList(1, 2, 3);
		
		for(Integer l : list2) {
			System.out.println(l);
		}
		
		
	}

}
