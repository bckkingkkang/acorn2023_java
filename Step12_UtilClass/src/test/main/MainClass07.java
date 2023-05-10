package test.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainClass07 {
	public static void main(String[] args) {
		
		/*
		 	세 명의 회원정보를 HashMap 객체에 각각 담아서
		 	ArrayList 객체에 누적
		 	반복문 > ArrayList 객체에 누적된 회원정보를 콘솔창에 순서대로 출력
		*/
		
		List<HashMap<String, Object>> list = new ArrayList<>();

		HashMap<String, Object> mem1 = new HashMap<>();
		mem1.put("name", "김구라");
		mem1.put("num", 1);
		mem1.put("addr", "노량진");
		
		HashMap<String, Object> mem2 = new HashMap<>();
		
		mem2.put("name", "해골");
		mem2.put("addr", "행신동");
		mem2.put("num", 2);
		
		HashMap<String, Object> mem3 = new HashMap<>();
		
		mem3.put("name", "원숭이");
		mem3.put("addr", "동물원");
		mem3.put("num", 3);

		
		list.add(mem1);
		list.add(mem2);
		list.add(mem3);
		
		for (int i = 0; i < 3; i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		
		// 확장 for문
		for (HashMap<String, Object> tmp : list) {
			int num = (int)tmp.get("num");
			String name = (String)tmp.get("name");
			String addr = (String)tmp.get("addr");
			
			System.out.println("num : " + num);
			System.out.println("name : " + name);
			System.out.println("adddr : " + addr);
			System.out.println();
		}
	}
}
