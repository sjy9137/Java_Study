package arrayList;


import java.util.*;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("java");
		list.add("JDBC");
		list.add("Servelet/JSP");
		list.add("AR_VR");
		list.add(3, "Android");
		list.add("C#");
		
		int size = list.size();
		String skill = list.get(0);
		
		
		for(String value : list) {
			System.out.println(value);
		}
		
		
	}
}
