package osf.list;

import java.util.HashMap;
import java.util.Map;

import osf.list.controller.FoodController;

//osf.list 패키지 안에 
//controller,
//dao 데이타 엑세스 오브젝트(데이타 접근하는 오브젝트),
//service,
//vo 패키지가 있는것.
public class Execute {
	public static void main(String[] args) {
		FoodController fc = new FoodController();
		Map<String, String> req = new HashMap<>();
		Map<String, Object> res = new HashMap<>();
		req.put("cmd", "food");
		req.put("number", "2");
		fc.doGet(req, res);
		System.out.println(res);
		
//		req.put("cmd", "insert");
//		req.put("number", "5");
//		req.put("name", "꿔바로우");
//		req.put("price", "30000");
//		fc.doPost(req, res);
//		System.out.println(res);
//		
		req = new HashMap<>();
		res = new HashMap<>();
		req.put("cmd", "update");
		req.put("number", "4");
		req.put("name", "해장국");
		fc.doPost(req, res);
		System.out.println(res);
		
		req = new HashMap<>();
		res = new HashMap<>();
		req.put("cmd", "delete");
		req.put("number", "1");
		req.put("name", "초밥");
		fc.doPost(req, res);
		System.out.println(res);
		
		req = new HashMap<>();
		res = new HashMap<>();
		req.put("cmd", "foodList");
		fc.doGet(req, res);
		System.out.println(res);
		
		
				
	}
}
