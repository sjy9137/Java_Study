package arrayList;

import java.util.*;
public class LinkedListExample {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long starttime;
		long endtime;
		
		starttime = System.nanoTime();
		for(int i =0 ; i < 1000000 ; i++) {
			list1.add(String.valueOf(i));
		};
		
		
		endtime = System.nanoTime();
		
		System.out.println(endtime - starttime + "ns");
		
		
		
		starttime = System.nanoTime();
		for(int i =0 ; i < 1000000 ; i++) {
			list2.add(String.valueOf(i));
		};
		
		
		endtime = System.nanoTime();
		
		System.out.println(endtime - starttime + "ns");
		
	}
}
