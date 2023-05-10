package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		
		// String Type을 담을 수 있는 방 3개짜리 빈 배열객체를 만들어서 참조값을 지역변수 names에 담기
		String[] names = new String[4]; 
		
		// 3개의 방에 순서대로 친구의 이름을 담아보세요
		names[0] = "고가현";
		names[1] = "이진영";
		names[2] = "김수정";
		names[3] = "최유진";
		
		// 배열에 들어있는 친구의 이름을 하나씩 순서대로 콘솔창에 출력
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
	}
}
