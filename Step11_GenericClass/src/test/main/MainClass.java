package test.main;
import test.mypac.*;

/*
	클래스 안에서 사용하는 특정 type을 고정하지 않고
	클래스를 사용하는 시점에 type을 정할 수 있게 할 수 있다.
	
	- 아래 선언한 T는 마음대로 스펠링이나 단어로 정할 수 있다.
	- 보통 type 이라는 의미에서 T라고 많이 정한다.
	- T를 포괄 클래스 (Generic Class) 라고 한다.
*/

public class MainClass {
	public static void main(String[] args) {
		
		// FruitBox 객체를 생성해서 참조값을 box 라는 이름의 지역 변수에 담기
		FruitBox<Apple> box = new FruitBox<Apple>();
		
		// box에 담긴 참조값을 이용해서 pack() 메소드를 호출
		box.pack(new Apple());
		
		// box에 담긴 참조값을 이용해서 unPack() 메소드를 호출하고 리턴되는 값을 fruit라는 지역변수에 담기
		Apple fruit = box.unPack();
		
		// 여기에 생성한 박스에 Melon 을 담을 수 있는지 확인
		FruitBox<Melon> box2 = new FruitBox<Melon>();
		box2.pack(new Melon());
		Melon fruit2 = box2.unPack();
		
		// Orange
		FruitBox<Orange> box3 = new FruitBox<Orange>();
		// 객체 생성 시점에서 new FruitBox<>() 로 생략 가능 (Generic 클래스 생략 가능)
		box3.pack(new Orange());
		Orange fruit3 = box3.unPack();
	}
}
