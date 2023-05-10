package test.main;
import java.util.Random;

public class QuizMain {
	public static void main(String[] args) {
		
		// 1. run 했을 때
		// cherry, apple, banana, melon, 7
		// 5개의 문자열 중에서 1개가 랜덤하게 출력되게 해보세요
		
		Random ran = new Random();
		
		int Num = ran.nextInt(5);
		
		switch (Num) {
		case 0 :
			System.out.println("cherry");
			break;
		case 1 :
			System.out.println("apple");
			break;
		case 2 :
			System.out.println("banana");
			break;
		case 3 :
			System.out.println("melon");
			break;
		case 4 :
			System.out.println("7");
			break;
		}
		
		String[] arr = {"cherry", "apple", "banana", "melon", "7"};
		System.out.println(arr[Num]);
	}
}
