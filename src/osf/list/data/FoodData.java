package osf.list.data;

import java.util.ArrayList;
import java.util.List;

import osf.list.vo.FoodVO;

public class FoodData {
	public static final List<FoodVO> FOOD_LIST = new ArrayList();
	static {
		FoodVO food = new FoodVO();
		food.setNumber(1);
		food.setName("참치");
		food.setPrice(30000);
		FOOD_LIST.add(food);

//		Map<String, String> map = new HashMap<>(); //해쉬맵은 순서없음
//		map.put("번호", "1");
//		map.put("이름", "초밥");
//		map.put("가격", "20000");
//		FOOD_LIST.add(map);
//		map = new HashMap<>();
//		map.put("번호", "2");
//		map.put("이름", "떡볶이");
//		map.put("가격", "10000");
//		FOOD_LIST.add(map);
//		map = new HashMap<>();
//		map.put("번호", "3");
//		map.put("이름", "족발");
//		map.put("가격", "30000");
//		FOOD_LIST.add(map);
//		map = new HashMap<>();
//		map.put("번호", "4");
//		map.put("이름", "연어");
//		map.put("가격", "50000");
//		FOOD_LIST.add(map);
	}
}
