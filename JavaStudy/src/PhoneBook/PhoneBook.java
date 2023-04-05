package PhoneBook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {

	HashMap<String, HashMap<String, PhoneBookInfo>> phonebook = new HashMap<>();

	// 새로운 그룹을 추가하는 메서드
	public boolean addGroup(String groupName) {

		if (!phonebook.containsKey(groupName)) {
			phonebook.put(groupName, new HashMap<>());		
			System.out.printf("그룹 [%s]을 성공적으로 생성했습니다.\n", groupName);	// 이런 문구 없는 게 낫다....
			return true;
		}
		System.out.println("이미 존재하는 그룹입니다.\n");
		return false;
	}


	// 겹치는 전화번호가 있는지 검사
	public boolean personAlreadyExistOtherGroup(PhoneBookInfo info) {
		boolean exist = false;
		for (String groupName : phonebook.keySet()) {		// 그룹 이름을 하나씩 꺼냄
			if (groupName.equals(info.group)) {			
				continue;
			}
			HashMap<String, PhoneBookInfo> groupMap = phonebook.get(groupName);
																	  // get(K) : 키값에 해당하는 Value를 꺼낸다. 키를 찾지못하면 null이 반환됨
			exist = exist || groupMap.containsKey(info.phoneNumber);  // 이번호로 존재하는 사람이 하나라도 있으면 false, 존재하는 사람이 없으면 true
																	  // --> ||이므로 하나라도 true이면 true
		}
		return exist;
	}

	// 그룹에 전화번호 및 개인정보를 추가하는 메서드
	public boolean addPerson(PhoneBookInfo info) {
		if (personAlreadyExistOtherGroup(info)) {
			System.out.println("다른 그룹에 이미 등록된 전화번호 입니다.");
			return false;
		}

		if (phonebook.containsKey(info.group)) {
			HashMap<String, PhoneBookInfo> groupMap = phonebook.get(info.group);

			if (groupMap.containsKey(info.phoneNumber)) {
				System.out.printf("'%s님'의 정보를 수정했습니다.\n", info.name);
			} else {
				System.out.println("새로운 정보를 등록했습니다.");
			}
			groupMap.put(info.phoneNumber, info);				// put(K, V) : 해당 키에 값을 저장한다
			return true;
		} else {
			System.out.println("해당 그룹이 존재하지 않아 추가 실패.");
			return false;
		}
	}	

	// 이름의 일부를 입력하면 일치하는 모든 사람의 목록을 보여주는 메서드
	public void searchByName(String nameFrag) {
		for (HashMap<String, PhoneBookInfo> group : phonebook.values()) {
			for (PhoneBookInfo info : group.values()) {
				if (info.name.contains(nameFrag)) {
					System.out.println(info);
				}
			}
		}
	}

	// 전화번호의 일부를 입력하면 일치하는 모든 사람의 목록을 보여주는 메서드
	public void searchByPhoneNumber(String phoneNumberFrag) {
		for (HashMap<String, PhoneBookInfo> group : phonebook.values()) {
			for (PhoneBookInfo info : group.values()) {
				if (info.phoneNumber.contains(phoneNumberFrag)) {
					System.out.println(info);
				}
			}
		}
	}

	
	// 등록된 모든 정보를 그룹명 순으로 출력, 같은 그룹 내에서는 이름 기준 오름차순으로 출력하는 메서드
	public void printAll() {
		List<PhoneBookInfo> allInfo = new ArrayList<>();
		for (HashMap<String, PhoneBookInfo> group : phonebook.values()) {
			for (PhoneBookInfo info : group.values()) {						// forEach : 배열, 리스트, 집합 등에서 요소를 하나씩 꺼내며 반복하는 문법
				allInfo.add(info);
			}
		}
		
		Collections.sort(allInfo, new Comparator<PhoneBookInfo>() {
			@Override
			public int compare(PhoneBookInfo i1, PhoneBookInfo i2) {
			int r1 = i1.group.compareTo(i2.group);
			
			if (r1 == 0) {
				return i1.name.compareTo(i2.name);
			} else {
				return r1;
			}
		}
	});
	
		System.out.println("### Print All Info ###");
		for (PhoneBookInfo info : allInfo) {
			System.out.println(info);
		}
	}
}