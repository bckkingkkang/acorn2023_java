package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		// 기본 data type double
		double num1 = 10.1;
		Double num2 = 10.2;
		
		// 참조 data type Double 이지만 마치 기본 data type 과 같이 사용할 수 있다.
		double result1 = num2 + 10;
		double result2 = num1 + num2;
		double result3 = num1 + num2;
		
		// 문자열을 숫자(double)로 바꾸기 "10.3" => 10.3
		double result4 = Double.parseDouble("10.3");
	}
}
