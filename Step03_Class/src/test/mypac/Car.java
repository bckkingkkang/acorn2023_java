package test.mypac;
import java.util.Scanner;
/*
 * 		class의 역할
 * 
 * 		1. 객체의 설계도 역할
 * 	- 객체는 heap 영역에 들어있는 물건
 * 	- class를 이용해서 객체를 원하는 시점에 원하는 갯수만큼 만들어 낼 수 있다.
 * 	- 만들어진 객체가 어떤 저장소와 어떤 기능을 가지게 할지 class로 설계할 수 있다.
 * 
 * 		2. data type 역할
 * 		
 * 		3. static 필드와 메소드를 포함하는 역할
*/

public class Car {
	/*	필드 정의하기
	 * 	- 클래스의 { } 중괄호 안에 아래와 같은 형식으로 필드를 정의할 수 있다.
	 * 	- 초기 값을 부여하지 않으면 기본 값이 들어간다.
	 * 	- int 의 기본 값은 0, boolean 의 기본 값은 false, 참조데이터 type 의 기본 값은 null
	 * 
	 * 	접근 지정자 data type 필드명 = 초기값;
	*/
		
	public String name;
	public int price;
	public int wantPrice;
		
	/*	메소드 정의하기
	 * 	- 접근지정자 return type 메소드명() {}
	 * 
	*/
		
	public void drive() {
		System.out.println(this.name + "가 달린다.");
	}
	
	public void showInfo() {
		Scanner scan = new Scanner(System.in);
//		System.out.print("희망 거래가 입력 (단위:만원) : ");
//		wantPrice = scan.nextInt();
		if (name.equals("소나타") || (name.equals("SONATA")) || (name.equals("sonata") || (name.equals("3"))) ) {
			System.out.println("<< 선택 차종 : 현대 소나타 (SONATA) >>");
			System.out.print("희망 거래가 입력 (단위:만원) : ");
			wantPrice = scan.nextInt();
			System.out.println("현재 가격 : 1520만원");
			if ( wantPrice >= 1520 ) {
				System.out.println("거래 가능합니다. 여유: " + (wantPrice-1000)+"만원");
				System.out.println("색상 : Black | White | Red");
			} else {
				System.out.println("거래 불가능합니다. 부족: " + (1520-wantPrice));
			}
		} else if (name.equals("아반떼")) {
			System.out.println("차의 이름은 아반떼이고 가격은 800만원입니다.");
		} else if (name.equals("제네시스")) {
			System.out.println("차의 이름은 제네시스, 가격은 2000만원입니다.");
		} else {
			System.out.println("등록되지 않은 차량 정보");
		}
		scan.close();
	}
//	public int sum(int a, int b) {
//		System.out.println(a+b);
//		return a + b;
//	}
}