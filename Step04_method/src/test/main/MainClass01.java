package test.main;
import java.io.File;

import test.mypac.Airplane;
import test.mypac.Test;

public class MainClass01 {
	public static void main(String[] args) {
		Test t = new Test();

		// return type이 void인 메소드 호출
		t.walk();
		
		// return type이 int인 메소드 호출하고 리턴되는 값을 a라는 int type 지역 변수에 담기
		int a = t.getNumber();
		
		String b = t.getGreeting();
		
		System.out.println(a+ "km " + b);
		
		System.out.println("메인 메소드가 종료됩니다.");
	
		// return type이 AirPlane인 메소드 호출하고 리턴되는 값을 c라는 AirPlane type 지역변수에 담기
		
		Airplane c = t.getPlane();
		c.fly();
		
		// 위에서 생성한 객체의 setNum 메소드를 호출해보세요
		t.setNum(45);
		
		//new File().delete()
		
	}
}
