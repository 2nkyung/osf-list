package ink.list.service.impl;

import java.util.List;
import java.util.Map;

import ink.list.dao.PersonDAO;
import ink.list.dao.impl.PersonDAOImpl;
import ink.list.service.PersonService;

public class PersonServiceImpl implements PersonService {
	private PersonDAO pdao = new PersonDAOImpl();

	@Override
	public List<Map<String, String>> selectPersonList() {
		return pdao.selectPersonList();
	}

	@Override
	public boolean insertPerson(Map<String, String> person) {
		return pdao.insertPerson(person);
	}

	@Override
	public Map<String, String> selectPerson(Map<String, String> person) {
		return pdao.selectPerson(person);
	}

	@Override
	public boolean updatePerson(Map<String, String> person) {
		return pdao.updatePerson(person);
	}

	@Override
	public boolean deletePerson(Map<String, String> person) {
		return pdao.deletePerson(person);
	}

}