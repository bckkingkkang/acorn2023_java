package test.main;
import java.util.Scanner;

public class MAinClass06 {
	public static void main(String[] args) {
		
		// 문자열을 지정할 수 있는 방 5개짜리 배열 객체를 생성해처 참조값을 msgs 라는 지역 변수에 담는다.
		String[] msgs = new String[5];
		// 키보드로부터 입력받을 수 있는 Scanner 객체를 생성해서 참조값을 scan 이라는 지역변수에 담는다.
		Scanner scan = new Scanner(System.in);
		// 반복문을 위에서 생성한 방의 갯수만큼 돌면서 키보드로부터 문자열을 입력받아 배열에 순서대로 저장한다.
		for (int i = 0; i < msgs.length; i++ ) {
			System.out.print("문자열 입력 : ");
			msgs[i] = scan.nextLine();
			
		}
		// 반복문을 돌면서 배열에 저장되었던 문자열을 순서대로 콘솔창에 출력한다.
		for (int i=0; i < msgs.length; i++) {
			System.out.println(msgs[i]);
		}
	}
}
