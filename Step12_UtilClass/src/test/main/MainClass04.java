package test.main;
import java.util.ArrayList;
import test.mypac.Car;
import java.util.List;
import java.util.function.Consumer;

public class MainClass04 {
	public static void main(String[] args) {
		
		// 1. Car type 을 저장할 수 있는 ArrayList 객체를 생성
		// 		참조값을 List 인터페이스 type 지역변수 cars에 담기
		List<Car> cars = new ArrayList<>();
				
		// 2. Car 객체(3개)를 생성해서 List 객체에 저장
		cars.add(new Car("SONATA"));
		cars.add(new Car("GENESIS"));
		cars.add(new Car("SPORTAGE"));
		/* Car car1 = new Car("IONIQ");
	 	cars.add(car1);	*/
		
		// 3. 일반 for문을 이용해서 List 객체에 저장된 모든 Car 객체의 drive() 메소드를 순서대로 호출
		for (int i = 0; i < cars.size(); i++) {
			cars.get(i).drive();
		}
		
		System.out.println("============================");
		// 4. 확장 for문을 이용해서 List 객체에 저장된 모든 Car 객체의 drive() 메소드를 순서대로 호출
		for (Car car:cars) {
			car.drive();
		}
		
		System.out.println("============================");
		// 5. Consumer 인터페이스를 활용해서 List 객체에 저장된 모든 Car 객체의 drive() 메소드를 순서대로 호출
		Consumer<Car> car = new Consumer<>() {
			@Override
			public void accept(Car t) {
				t.drive();
			}
		};
		cars.forEach(car);
	}
}
