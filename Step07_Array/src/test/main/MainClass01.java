package test.main;

	// java에서 배열도 객체
	// 즉 배열은 참조 data type이다.

public class MainClass01 {
	public static void main(String[] args) {
		
		int[] nums = {10, 20, 30, 40, 50};
		
		double[] nums2 = {10.1, 10.2, 10.3, 10.4, 10.5};
		
		boolean[] truth = {true, false, false, true, true};
		
		String[] names = {"김구라", "해골", "원숭이", "주댕이", "덩어리"};
		
		// 배열 객체는 clone() 이라는 메소드와 length 라는 필드가 있다.
		// 배열 객체의 복제본 얻어내기
		int[] result = nums.clone();
		// 배열의 크기 얻어내기
		int size = nums.length;
		// 배열은 순서가 있는 데이터이다. 특정 index 의 item 참조하는 방법
		int first = nums[0];
		int second = nums[1];
		int third = nums[2];
		
	}
}
