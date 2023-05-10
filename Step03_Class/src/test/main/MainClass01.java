package test.main;
import test.mypac.Car;

public class MainClass01 {
	// run 했을 때 실행의 흐름이 시작되는 특별한 메인 메소드
	public static void main(String[] args) {

		Car car1 = new Car();
		
		car1.drive();
		car1.name = "소나타";
		car1.price = 1000;
		
		Car car2 = new Car();
		
		car2.drive();
		car2.name = "그랜져";
		car2.price = 2000;
		
		boolean result1 = car1 == car2;

	}
}
