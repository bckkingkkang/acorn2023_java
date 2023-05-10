package test.main;

public class MainClass04 {

	public static class Kahyun {
		public void say() {
			System.out.println("안녕 나는..");
		}
	}
	
	// static 메소드
	public static void main(String[] args) {
		Kahyun k = new Kahyun();
		k.say();
		
		// 메소드 안에도 클래스 정의 가능
		// 메소드 안에 정의한 클래스를 지역 내부 클래스라고 한다. ( Local Inner Class)
		// 메소드 내부에서만 사용 가능
		class Cat {
			public void say() {
				System.out.println("고양이");
			}
		}
		Cat cat = new Cat();
		cat.say();
	}
	
}
