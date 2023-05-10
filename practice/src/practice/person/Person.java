package practice.person;

public class Person {

	// 이름
	public String name;

	
	// 나이는 모두 25살로 정의 
	public int age = 25;

	// 번호 number
	public int number;

	// 사람의 정보 출력
	// ex. 이름은 ㅇㅇㅇ, 나이는 ㅇ살, 번호는 ㅇ번입니다.
	public void personInfo() {
		System.out.println("이름은 " + name + ", 나이는 " + age + ", 번호는 " + number + "번입니다.");
	}


	// 포인트 point
	public int point;
	
	// person의 포인트를 출력
	// ex. ㅇㅇㅇ의 포인트는 ㅇㅇ입니다.
	public void personPoint(String name) {
		System.out.println(name+ "의 포인트는 " + point);
	}
	
	// Person 클래스에서 name, age 를 입력받아 정보를 출력하는 Info() 메소드 생성
	public void Info(String name, int age) {
		System.out.println(name + " : " + age);
	}
	
	// 어떤 정수를 전달받아도 10을 리턴하는 tenReturn() 메소드 생성
	public int tenReturn(int a) {
		return 10;
	}
	
	// 입력받은 정수가 5가 아닌 경우 5가 아닙니다 문구를 출력하는 fiveCollector() 메소드 생성
	public void fiveCollector(int a) {
		if ( a == 5 ) {
			System.out.println("5");
		} else {
			System.out.println("5가 아닙니다.");
		}
	}


}