package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass14 {
	public static void main(String[] args) {
		
		// 수정할 회원의 정보
		int num = 1;
		String name = "김구라";
		String addr = "독산동";
		
		// 위의 정보를 이용해서 1번 회원의 정보를 수정하고 성공이면 "수정했습니다" 가 출력
		
		/*
		MemberDto dto = new MemberDto();
		dto.setNum(num);
		dto.setName(name);
		dto.setAddr(addr);
		*/
		
		MemberDto dto = new MemberDto(num, name, addr);
		
		MemberDao dao = new MemberDao();
		
		boolean updateSuccess = dao.update(dto);
		
		if (updateSuccess) {
			System.out.println("수정했습니다.");
		}
	}
}
