package test.main;

import test.mypac.Car;

public class MainClass07 {
	public static void main(String[] args) {
		
		// 개발자가 코딩하는 위치
	
		useCar(new Car());
		// 더 빨리 달리기 => 미리 만들어 놓은 Car 클래스의 drive() 메소드 수정 불가능
		useCar(new Car() {
			@Override
			public void drive() {
				System.out.println("빨리 달려요");
				// super.drive();
			}
		});
	}
	
	public static void useCar(Car c) {
		c.drive();
		c.drive();
	}
}
