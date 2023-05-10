package test.mypac;

public class Test {
	/*	메소드를 만들 때 고려해야 하는 것
	 * 	1. 접근지정자
	 * 	2. static or non static
	 * 	3. return type
	 * 	4. 메소드명
	 * 	5. 메소드에 전달하는 인자의 갯수와 데이터 type
	 * */
	
	public void walk() {
		System.out.println("걸어");
	}
	
	public int getNumber() {
		return 10;
	}
	
	public String getGreeting() {
		return "걷는다";
	}
	
	public Airplane getPlane() {
		Airplane air = new Airplane();
		return air;
	}
	
	// int type을 메소드의 인자로 전달받는 메소드
	public void setNum(int num) {
		
	}
	
	// String type을 메소드의 인자로 전달받는 메소드
	public void setName(String name) {
		
	}
	
	// Airplane type을 메소드의 인자로 전달받는 메소드
	public void setPlane(Airplane plane) {
		
	}
	
	public void doSomething(int num, String name, Airplane plane) {
		
	}
	
	public void send() {
		System.out.println("무언가를 전송");
	}
	public void send(int num) {
		System.out.println(num + "을 전송");
	}
	public void send(String name) {
		System.out.println(name + "에게 전송");
	}
	public void send(Airplane plane) {
		System.out.println("비행기를 전송");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
