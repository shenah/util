package datastructure;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetMain {

	public static void main(String[] args) {
		//HashSet은 같은 데이터를 저장 할 수 없고 순서도 없음
		HashSet <String> song = new HashSet();
		song.add("레미제라블");
		song.add("감자");
		song.add("위대한 개츠비");
		song.add("레미제라블");
		for(String s : song) {
			System.out.println(s);
		}
		System.out.println("============");
		
		//LinkedHashSet 저장된 순서를 기억
		LinkedHashSet <String> linkhs = new LinkedHashSet();
		linkhs.add("레미제라블");
		linkhs.add("감자");
		linkhs.add("위대한 개츠비");
		linkhs.add("레미제라블");
		for(String sl: linkhs) {
			System.out.println(sl);
		}
		

	}

}
