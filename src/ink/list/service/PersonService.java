package ink.list.service;

import java.util.List;
import java.util.Map;

public interface PersonService {

	public List<Map<String,String>> selectPersonList();
	
	public boolean insertPerson(Map<String,String> person);
	
	public Map<String, String> selectPerson(Map<String,String> person);
	
	public boolean updatePerson(Map<String,String> person);
	
	public boolean deletePerson(Map<String,String> person);
}
