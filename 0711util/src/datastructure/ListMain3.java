package datastructure;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;

public class ListMain3 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list1 = new ArrayList();
		list1.add(30);
		list1.add(40);
		list1.add(25);
		
		Comparator<Integer>comp = new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Integer first = (Integer)o1;
				Integer second = (Integer)o2;
				return first - second;
			}	
		};
		
		list1.sort(comp);
		//list는 toString이 재정의 되어있다.
		System.out.println(list1);
		
		LinkedList list2 = new LinkedList();
		list2.add("가");
		list2.add("다");
		list2.add("나");
		
		Comparator <String>comp2 = new Comparator(){

			@Override
			public int compare(Object o1, Object o2) {
				String first = (String)o1;
				String second = (String)o2;
				return second.compareTo(first);
			}
			
		};
		list2.sort(comp2);
		System.out.println(list2);

	}

}
