package osf.list.dao;

import java.util.List;

import osf.list.vo.FoodVO;

//규칙 : 인터페이스를 바라보는 클래스를(?) impl패키지에 몰아넣는다
public interface FoodDAO {
	public List<FoodVO> selectFoodList();

	public FoodVO selectFood(FoodVO food);

	public boolean insertFood(FoodVO food);
	public boolean updateFood(FoodVO food);
	public boolean deleteFood(FoodVO food);
}
