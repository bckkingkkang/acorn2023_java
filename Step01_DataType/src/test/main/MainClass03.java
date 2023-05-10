package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		
		/* java 기본 데이터 type
		 * 
		 * 논리형 (boolean)
		 * 
		 * true, false 두 가지 값 중 하나이다.
		 * true, false 를 직접 쓰거나 비교 연산 혹은 논리 연산의 결과로 얻어낼 수 있다.
		 * 참과 거짓을 나타내는 데이터 type
		 * 
		 */
		
		boolean isRun = true;
		
		if (isRun) {
			System.out.println("달립니당");
		}
		
		boolean isGreater = 10 > 1;
		boolean result = true || false;
		
		System.out.println(isGreater);
		System.out.println(result);
		
		result = false;
		
		System.out.println(result);
		
	}
}
