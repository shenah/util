package datastructure;

import java.util.HashMap;
import java.util.Set;

public class MapMain1 {

	public static void main(String[] args) {
		HashMap <String, Object> map = new HashMap();
		map.put("name", "바네사");
		map.put("age", 28);
		map.put("company","Hollywood");
		//동일한 키로 다시 저장하면 업데이트된다.
		map.put("company","disney");
		//키 이름을 입력하여 값을 출력
		System.out.println(map.get("company"));
		//없는 키의 이름을 사용하면 null을 리턴
		System.out.println(map.get("position"));
		System.out.println(map.size());
		
		//모든 데이터 조회 - 저장할때 사용한 키를 몰라도 조회가능
		//모든 키를 Set으로 저장.
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(key + ":" + map.get(key));
		}

	}

}
