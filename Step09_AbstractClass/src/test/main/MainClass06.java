package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class MainClass06 {
	public static void main(String[] args) {
		// 아래에 있는 useWeapon() 메소드를 호출하려면 Weapon type의 참조값이 필요하다
		// 익명의 Local Inner Class를 이용해서 Weapon type의 참조값을 얻어내기
		useWeapon(new MyWeapon());
		
		Weapon w1 = new MyWeapon();
		useWeapon(w1);
		
		// 사용
		Weapon w2 = new Weapon() {
			// 이름이 없는 익명의 클래스, extends Weapon 한 클래스
			@Override
			public void attack() {
				System.out.println("아무나 공격");
			}
		};
		useWeapon(w2);
		
		// 메소드를 호출할 때 바로 익명클래스를 이용해서 Weapon type 의 참조값을 얻어내서 사용
		useWeapon(new Weapon() {
			@Override
			public void attack() {
				System.out.println("공격합니다.");
			}
		});
	}
	
	// Weapon type의 참조값을 전달받아서 사용하는 static 메소드
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
		w.attack();
	}
}
