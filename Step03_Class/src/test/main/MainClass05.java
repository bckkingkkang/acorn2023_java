package test.main;
import java.util.Scanner;
import test.mypac.*;

public class MainClass05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("<< 1. 거래 가능 차종 보기 | 2. 자동차 사기 | 3. 자동차 팔기 >>");
		System.out.print("▶ 메뉴 선택 : ");
		int menuChoice = scan.nextInt();
		System.out.println("===================================================");
		System.out.println();
		
		switch(menuChoice) {
		case 1: 
			System.out.println("<< 거래 가능 차종 보기 >>");
			System.out.println("1. 경차 \n2. 중형차\n3. SUV\n4. 종료");
			
			System.out.print("▶ 차량 정보 상세 보기 :");
			int viewChoice = scan.nextInt();
			System.out.println("===================================================");
			System.out.println();
			if (viewChoice == 1) {
				// 캐스퍼, 레이
				System.out.println("<< 거래 가능 경차 목록 >>");
				Citycar cityCar = new Citycar();
				cityCar.citycarInfoCasper();
				System.out.println();
				cityCar.citycarInfoRay();
			} else if (viewChoice == 2){
				// 소나타, k5
				Midsizecar midsizeCar = new Midsizecar();
				System.out.println("<< 거래 가능 중형차 목록 >>");
				midsizeCar.midcarInfoSonata();
				System.out.println();
				midsizeCar.midcarInfoK5();
			} else if (viewChoice == 3){
				// 쏘렌토
				System.out.println("<< 거래 가능 SUV 목록 >>");
				Suvcar suvCar = new Suvcar();
				suvCar.suvcarInfoGenesis();
			} else if (viewChoice == 4){
				
			} else {
				System.out.println("유효하지 않은 입력입니다.");
			}
			break;
			
		case 2 :
			Car car1 = new Car();
			System.out.println("▷ 현대 캐스퍼 (CASPER)\n▷ 기아 레이 (RAY)\n▷ 현대 소나타 SONATA)\n▷ 기아 K5\n▷ 제네시스 GV90 (Genesis GV90)");
			System.out.print("▶ 차종을 입력 : ");
			car1.name = scan.next();
			System.out.println();
//			System.out.print("희망 거래가 입력 (단위:만원) : ");
//			car1.wantPrice = scan.nextInt();
			car1.showInfo();
			break;
		case 3 :
			break;
		}
		scan.close();
	}
}
