package test.main;
import test.mypac.Member;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MainClass05 {
	public static void main(String[] args) {
		
		// 1. Member 객체를 담을 수 있는 ArrayList 객체를 생성해서 참조값을 members 라는 지역변수에 담기
		ArrayList<Member> members = new ArrayList<>();
		
		// 2. 3명의 회원정보를 Member 객체에 각각 담기 (Member 객체가 3개 생성되어야 함)
		// members.add(new Member(1, "김구라","노량진"));
		// members.add(new Member(2, "해골", "행신동"));
		// members.add(new Member(3, "원숭이", "봉천동"));
		
		Member mem1 = new Member(1, "김구라", "노량진");
		Member mem2 = new Member(2, "해골", "행신동");
		Member mem3 = new Member(3, "원숭이", "봉천동");
		
		// 3. 위에서 생성된 Member 객체의 참조값을 members List 객체에 모두 담기
		members.add(mem1);
		members.add(mem2);
		members.add(mem3);
		
		// 디폴트 생성자를 호출해서 Member 객체를 생성하면 필드를 직접 참조해서 값을 넣어주어야 한다.
		/*
			Member mem3 = new Member();
			mem3.num = 3;
			mem3.name = "원숭이";
			mem3.addr = "동물원";
		*/
		
		/* 4. Members List 객체에 담긴 내용을 이용해서 회원 목록을 아래와 같은 형식으로 반복문 돌면서 출력
			
			번호 : 1, 이름 : 김구라, 주소 : 노량진
			번호 : 2, 이름 : 해골, 주소 : 행신동
		*/
		for (Member mem:members) {
			System.out.println("번호 : " + mem.num + ", 이름 : " + mem.name + ", 주소 : " + mem.addr);
		}
		
		System.out.println("****************************************");
		members.forEach(new Consumer<>() {
			@Override
			public void accept(Member t) {
				System.out.println("번호 : " + t.num + ", 이름 : " + t.name + ", 주소 : " + t.addr);
			}
		});
		
		System.out.println("****************************************");
		members.forEach((t)->{
			System.out.println("번호 : " + t.num + ", 이름 : " + t.name + ", 주소 : " + t.addr);
		});
	}
}
	
