package test.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class QuizMain3 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("로또 구입 수 : ");
		
		int amount = scan.nextInt();
		
		for (int i = 0; i < amount; i++ ) {
			printLotto();
			System.out.println();
		}
		/*
		// 로또 번호 6개를 출력
		
		// 무작위 수를 얻어낼 Random 객체
		Random ran = new Random();
		
		// 로또 번호를 저장할 HashSet 객체 생성 > 참조값을 Set 인터페이스 type 변수에 담기
		Set<Integer> lottoSet = new HashSet<>();
		
		// 반복문 > 로또번호
		while (true) {
			// 1 ~ 45 사이의 랜덤한 정수 얻기
			int ranNum = ran.nextInt(45) + 1;
			
			// set 에 담기
			lottoSet.add(ranNum);
			
			// 6개 숫자 > break
			if (lottoSet.size() == 6) {
				break;
			}
		}
		
		// ArrayList 에 담기
		List<Integer> lottoNums = new ArrayList<>(lottoSet);
		
		// Collections 클래스의 static 메소드를 이용해서 숫자를 오름차순 정렬
		Collections.sort(lottoNums);
		
		// 내림차순 정렬
		// Collections.sort(lottoNums, Collections.reverseOrder());
		
		for ( int i = 0; i < lottoNums.size(); i++ ) {
			int num = lottoNums.get(i);
			System.out.print("[ "+ num + " ] ");
		}
	*/
	}
	
	
	// 로또 번호 한 세트를 콘솔에 출력하는 메소드
	public static void printLotto() {
		// 로또 번호 6개를 출력
		
		// 무작위 수를 얻어낼 Random 객체
		Random ran = new Random();
				
		// 로또 번호를 저장할 HashSet 객체 생성 > 참조값을 Set 인터페이스 type 변수에 담기
		Set<Integer> lottoSet = new HashSet<>();
				
		// 반복문 > 로또번호
		while (true) {
			// 1 ~ 45 사이의 랜덤한 정수 얻기
			int ranNum = ran.nextInt(45) + 1;
					
			// set 에 담기
			lottoSet.add(ranNum);
					
			// 6개 숫자 > break
			if (lottoSet.size() == 6) {
				break;
			}
		}
				
		// ArrayList 에 담기
		List<Integer> lottoNums = new ArrayList<>(lottoSet);
				
		// Collections 클래스의 static 메소드를 이용해서 숫자를 오름차순 정렬
		Collections.sort(lottoNums);
				
		// 내림차순 정렬
		// Collections.sort(lottoNums, Collections.reverseOrder());
				
		for ( int i = 0; i < lottoNums.size(); i++ ) {
			int num = lottoNums.get(i);
			System.out.print("[ "+ num + " ] ");
		}
	}
}
