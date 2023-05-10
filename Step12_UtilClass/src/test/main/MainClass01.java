package test.main;

import java.util.ArrayList;

/*
	JAVA 에서 배열은 크기를 조절할 수 없는 고정 배열이다.
	따라서 동적으로 item 을 추가하고 삭제하는 작업을 하려면 일반 배열은 사용할 수 없다.
	해당 작업을 하기 위해선 ArrayList 객체를 사용한다.
*/
public class MainClass01 {
	public static void main(String[] args) {
		// String type을 저장할 수 있는 ArrayList 객체를 생성해서 참조값을 names에 담기
		/*
		 * ArrayList<String> names = new ArrayList<>();
		names.add("Ko");
		names.add("kahyun");
		names.add("Ko Kahyun");
		
		String result = names.get(2);
		int size = names.size();
		System.out.println(result +" "+ size);
		*/
		
		// "김구라", "해골", "원숭이" 3개의 String type을 저장
		ArrayList<String> names = new ArrayList<>();
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		
		// 0번 방의 아이템을 불러와서 item이라는 변수에 담기
		String item = names.get(0);
		
		System.out.println(names);
		
		// 1번 방의 아이템을 삭제
		names.remove(0);
		
		System.out.println(names);
		
		// 0번 방에 "에이콘" 넣기
		names.add(0,"에이콘");
		
		System.out.println(names);
		
		// 저장된 아이템의 갯수(size)를 size라는 지역 변수에 담기
		int size = names.size();
		
		System.out.println(size);
		
		// 저장된 모든 아이템 전체 삭제
		names.removeAll(names);
		// names.clear(names);
		
		System.out.println(names + ", " + size);
	}
}
