package test.main;
import test.mypac.MyUtil;

public class MainClass06 {
	public static void main(String[] args) {

		MyUtil.send();
		
		// MyUtil 클래스의 version 필드 참조해보기
		String v = MyUtil.version;
		
		System.out.println("오잉?");
		
		long time = System.currentTimeMillis();
		System.out.println(time);
	}
}
