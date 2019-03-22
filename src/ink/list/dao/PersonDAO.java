package ink.list.dao;

import java.util.List;
import java.util.Map;

public interface PersonDAO {
	
	public List<Map<String, String>> selectPersonList();
	public Map<String, String> selectPerson(Map<String, String> person);


	public boolean insertPerson(Map<String, String> person);
	public boolean updatePerson(Map<String, String> person);
	public boolean deletePerson(Map<String, String> person);
}