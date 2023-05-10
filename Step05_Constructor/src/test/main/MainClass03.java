package test.main;
import test.mypac.*;

public class MainClass03 {
	public static void main(String[] args) {
		/*
			MacBook 객체를 생성해서 참조값을 mac1 이라는 지역 변수에 담아보세요
			
			주의 - MacBook 클래스를 절대 수정하지 않기
		*/
		
		MacBook book = new MacBook(new Cpu(), new Memory(), new HardDisk());
		
		MacBook book2 = new MacBook(null, null, null);
		
		book.doGame();
		book2.doGame();
		
		// 생성자의 인자로 전달할 값이 지역변수에 있는 경우 지역변수를 참조해서 전달할 수도 있다.
		Cpu c = new Cpu();
		Memory m = new Memory();
		HardDisk h = new HardDisk();
		
		MacBook book3 = new MacBook(c, m, h);
		book3.doGame();
	}
}
