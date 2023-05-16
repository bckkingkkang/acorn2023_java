package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass13 {
	public static void main(String[] args) {
		
		// 새로 추가할 회원 정보
		String name = "누구";
		String addr = "어디";
		
		// 위의 정보를 DB에 저장하고 저장이 성공되었다면 "저장되었습니다."를 콘솔창에 출력
		
		// 추가할 회원의 이름과 주소를 dto 객체에 담고
		MemberDto dto = new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		
		MemberDto dto2 = new MemberDto(5, "고가현", "관악구");
		MemberDto dto3 = new MemberDto(6, "고", "봉천동");
		MemberDto dto4 = new MemberDto(7, "가현", "용담동");
		
		// MemberDao 객체를 이용해서 회원 정보를 저장하고 성공 여부를 리턴받는다.
		MemberDao dao = new MemberDao();
		boolean isSuccess = dao.insert(dto);
		dao.insert(dto2);
		dao.insert(dto3);
		dao.insert(dto4);
		
		if (isSuccess) {
			System.out.println("저장되었습니다.");
		}
	}
}
