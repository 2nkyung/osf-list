package ink.list.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonData {

	public static final List<Map<String, String>>
	PERSON_LIST = new ArrayList();
	
	static {
		Map<String,String> map = new HashMap<>();
		map.put("이름","최인경");
		map.put("주소","서울");
		map.put("전화번호","123456");
		PERSON_LIST.add(map);
		
		map = new HashMap<>();
		map.put("이름", "영준영준");
		map.put("주소", "부천");
		map.put("전화번호", "654321");
		PERSON_LIST.add(map);
		
		map = new HashMap<>();
		map.put("이름", "은송은송");
		map.put("주소", "강서구");
		map.put("전화번호", "777777");
		PERSON_LIST.add(map);
		
	}
}
