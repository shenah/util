package datastructure;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListMain2 {

	public static void main(String[] args) {
		
		//ArrayList와 LinkedList에 10만개 데이터 삽입할 때 시간측정
		ArrayList<Integer>ar = new ArrayList();
		LinkedList<Integer>li = new LinkedList();
		
		ar.add(1);
		ar.add(3);
		ar.add(4);
		
		li.add(1);
		li.add(3);
		li.add(4);
		
		long start = System.currentTimeMillis();
		for(int i=0; i<100000; i++) {
			ar.add(1, 2);
		}
		long end = System.currentTimeMillis();
		System.out.println("al삽입시간:" + (end - start));
		
		start = System.currentTimeMillis();
		for(int i=0; i<100000; i++) {
			li.add(1, 2);
		}
		end = System.currentTimeMillis();
		System.out.println("li삽입시간:" + (end - start));
		
		//10만개 데이터를 읽는 시간측정
		start = System.currentTimeMillis();
		for(int i=0; i<100000; i++) {
			ar.get(i);
		}
		end = System.currentTimeMillis();
		System.out.println("ar읽는시간:" + (end - start));
		
		start = System.currentTimeMillis();
		for(int i=0; i<100000; i++) {
			li.get(i);
		}
		end = System.currentTimeMillis();
		System.out.println("li읽는시간:" + (end - start));

	}

}
