package test.mypac;

public class Member {
	// 필드
	public int num;
	public String name;
	public String addr;
	
	// default 생성자 정의하기
		public Member() {}
	
	// 생성자 정의하기
	public Member(int num, String name, String addr) {
		// 생성자의 매개변수에 전달된 갓을 필드에 저장해놓기
		this.num = num;
		this.name = name;
		this.addr = addr;
	}
	
	
	
	public void printInfo() {
		
	}
}
