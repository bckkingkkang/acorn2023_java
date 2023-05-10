package test.main;
import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print(">> 나눌 수 입력 : ");
		String inputNum1 = scan.nextLine();
		
		System.out.print(">> 나누어지는 수 입력 : ");
		String inputNum2 = scan.nextLine();
		try {
			System.out.println("-----------------------------");
		
			int num1 = Integer.parseInt(inputNum1);
			int num2 = Integer.parseInt(inputNum2);
		
			int result1 = num2 / num1;	// 몫
			int result2 = num2 % num1;	// 나머지
		 
			System.out.println(">> " + num2 + "를 " + num1 + "(으)로 나눈 몫 : " + result1);
			System.out.println(">> " + num2 + "를 " + num1 + "(으)로 나눈 나머지 : " + result2);
		
		} catch (NumberFormatException nfe) {
			System.out.println(">> 숫자 형식으로 입력해주세요");
		
		} catch (ArithmeticException ae) {
			System.out.println(">> 0으로 나눌 수 없습니다.");
		
		} catch (Exception e) {
			// Exception type은 모든 예외의 부모 type이기 때문에 모든 예외가 여기서 처리된다.
			System.out.println("예외가 발생했습니다.");
			System.out.println("예외 메세지 : " + e.getMessage());
		
		} finally {
			// 예외가 발생 여부에 관계없이 반드시 실행이 보장되는 블럭
			// 중요한 마무리 작업을 주로 여기서 수행
			System.out.println("중요한 마무리 작업을 합니다.");
		}
		
		System.out.println("main 메소드가 정상 종료됩니다.");
	}
}
