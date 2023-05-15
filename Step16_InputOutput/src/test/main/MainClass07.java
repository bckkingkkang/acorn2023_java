package test.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass07 {
	public static void main(String[] args) {
		
		String msg = "안녕하세요";
		
		File f = new File("C:/acorn202304/myFolder/diary.txt");
		
		// 파일이 존재하지 않는다면 
		try {
			if (!f.exists()) {
				// 파일을 만든다
				f.createNewFile();
				System.out.println("diary.txt 파일을 만들었습니다.");
			} 
			// 파일에 문자열을 출력할 수 있는 객체의 참조값 얻어내기
			// new FileWriter( File 객체, append 모드 여부 )
			// new FileWriter
			FileWriter fw = new FileWriter(f);
			fw.write(msg);	// 출력할 준비
			fw.flush();		// 출력
			fw.close();		// 마무리
			System.out.println("diary.txt 파일에 문자열을 기록했습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
