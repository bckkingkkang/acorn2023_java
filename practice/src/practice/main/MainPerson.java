package practice.main;
import practice.person.Person;
import practice.person.Calc;

public class MainPerson {
	public static void main(String[] args) {

		// person1 생성 (고가현, 1) 저장
		Person person1 = new Person();
		person1.name = "고가현";
		person1.number = 1;
		
		// person2 생성 (이진영, 2) 저장
		Person person2 = new Person();
		person2.name = "이진영";
		person2.number = 2;
		
		// person3 생성 (김수정, 3) 저장
		Person person3 = new Person();
		person3.name = "김수정";
		person3.number = 3;

		// person1 나이만 26으로 수정
		person1.age = 26;

		// person1, person3의 personInfo() 출력
		person1.personInfo();
		person3.personInfo();


		// point 50, 100, 20 각각 저장하고 총합 출력
		person1.point = 50;
		person2.point = 100;
		person3.point = 20;

		// point 총합을 저장하는 변수 생성
		int pointSum = person1.point + person2.point + person3.point;

		// point 총합이 100이 넘으면 합격 문구 출력, 100 미만이면 불합격 문구 출력
		if (pointSum >= 100) {
			System.out.println("Point 총합은 " + pointSum +" 합격입니다.");
		} else {
			System.out.println("Point 총합은 " + pointSum +"불합격입니다.");
		}
		
		
		// practice.person 패키지 내 Calc 클래스 생성 > 정수 2개를 입력받아 정수의 합을 출력해주는 plus() 메소드 생성
		// Calc cal로 사용
		// sum() 메소드를 사용 565123, 54123 합 출력
		Calc cal = new Calc();
		System.out.println(cal.plus(564312,456));
		
		// 정수 두 개를 입력받아 나누는 div() 메소드 생성
		// div() 메소드 사용, 180을 36으로 나눈 값 출력
		System.out.println(cal.div(180, 36));
		
		// 실수 두 개를 입력받아 나누는 min() 메소드 생성
		// min() 메소드 사용, 45.5에서 37.5를 뺀 값 출력
		System.out.println(cal.min(45.5f, 37.5f));
		
		Person p = new Person();
		
		// Person 클래스에서 name(String type)을 입력받아 Point를 출력해주는 personPoint() 메소드 생성
		// person2의 Point 출력
		p.personPoint(person2.name);
		
		// Person 클래스에서 name, age 를 입력받아 정보를 출력하는 Info() 메소드 생성
		// person3.Info() 출력
		p.Info(person3.name, person3.age);
		
		// 어떤 정수(int type)을 전달받아도 10을 리턴하는 tenReturn() 메소드 생성
		// 정수 5를 넣고 10 return
		System.out.println(p.tenReturn(5));
		System.out.println(p.tenReturn(40));
		
		// 입력받은 정수가 5가 아닌 경우 5가 아닙니다 문구를 출력하는 fiveCollector() 메소드 생성
		p.fiveCollector(10);
		p.fiveCollector(5);
		
	}
}