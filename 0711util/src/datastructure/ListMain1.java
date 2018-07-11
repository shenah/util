package datastructure;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListMain1 {

	public static void main(String[] args) {
		ArrayList <String> arraylist = new ArrayList();
		//데이터 삽입
		arraylist.add("아이린");
		arraylist.add("설현");
		arraylist.add("수지");
		arraylist.add("유리");
		//개수 출력
		System.out.println("데이터 개수:" + arraylist.size());
		//전체 데이터 출력
		for(String temp : arraylist) {
			System.out.println(temp);
		}	
		//0번째 데이터를 출력
		System.out.println("0번째 데이터:" + arraylist.get(0));
		//0번째 데이터 삭제 
		arraylist.remove(0);
		System.out.println("데이터 삭제후 출력:");
		for(String temp : arraylist) {
			System.out.println(temp);
		}
		//2번째 자리에 데이터를 삽입
		arraylist.add(1, "아이린");
		System.out.println("데이터 삽입후 출력:");
		for(String temp : arraylist) {
			System.out.println(temp);
		}
		
		System.out.println(arraylist.isEmpty());

	}

}
