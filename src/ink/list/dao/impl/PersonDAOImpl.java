package ink.list.dao.impl;

import java.util.List;
import java.util.Map;

import ink.list.dao.PersonDAO;
import ink.list.data.PersonData;

	public class PersonDAOImpl implements PersonDAO {

		@Override
		public List<Map<String, String>> selectPersonList() {
			return PersonData.PERSON_LIST;
		}

		@Override
		public Map<String, String> selectPerson(Map<String, String> person) {
			for (int i = 0; i < PersonData.PERSON_LIST.size(); i++) {
				Map<String, String> p = PersonData.PERSON_LIST.get(i);
				if (p.get("이름").equals(person.get("이름"))) {
					return p;
				}
			}
			return null;
		}

		@Override
		public boolean insertPerson(Map<String, String> person) {
			return PersonData.PERSON_LIST.add(person);
		}

		@Override
		public boolean updatePerson(Map<String, String> person) {
			for (int i = 0; i < PersonData.PERSON_LIST.size(); i++) {
				Map<String, String> p = PersonData.PERSON_LIST.get(i);
				if (p.get("이름").equals(person.get("이름"))) {
					if (person.get("주소") != null) {
						p.put("주소", person.get("주소"));
					}
					if (person.get("전화번호") != null) {
						p.put("전화번호", person.get("전화번호"));
					}
					return true;
				}
			}
			return false;
		}

		@Override
		public boolean deletePerson(Map<String, String> person) {
			for (int i = 0; i < PersonData.PERSON_LIST.size(); i++) {
				Map<String, String> p = PersonData.PERSON_LIST.get(i);
				if (p.get("이름").equals(person.get("이름"))) {
					PersonData.PERSON_LIST.remove(i);
					return true;
				}
			}
			return false;
		}

		@Override
		public Map<String, String> selectPersonList(Map<String, String> person) {
			// TODO Auto-generated method stub
			return null;
		}
	}

