package test.main;
import java.util.Random;

public class QuizMain2 {
	public static void main(String[] args) {
		
		// run 했을 때 5개의 문자열 중에서 3개가 한 줄에 한 번에 랜덤하게 출력되게 해보세요
		// 예) cherry | apple | cherry
		
		String[] arr = {"apple", "cherry", "banana", "apple", "7"};
		
		Random ran = new Random();
		
		int i = ran.nextInt(5);
		int j = ran.nextInt(5);
		int k = ran.nextInt(5);
		
		System.out.println("| " + arr[i] + " | " + arr[j] + " | " + arr[k] + " | ");
	}
}
