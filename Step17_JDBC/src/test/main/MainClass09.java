package test.main;

import test.dto.MemberDto;

public class MainClass09 {
	public static void main(String[] args) {
		
		String name = "에이콘";
		String addr = "강남역";
		
		// 아래의 insert() 메소드를 활용해서 위의 회원정보가 DB에 저장되도록 해 보세요
		MemberDto dto1 = new MemberDto();
		dto1.setName(name);
		dto1.setAddr(addr);
		
		MainClass09.insert(dto1);
	}
	
	public static void insert(MemberDto dto) {
	}
}
