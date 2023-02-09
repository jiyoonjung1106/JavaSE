package day08.accessmodifier;

import day08.vo.MemberVO;

public class MainClass02 {
	public static void main(String[] args) {
		MemberVO memberVO = new MemberVO();
		
		memberVO.setId("abcd");
		memberVO.setPassword("abcd123@");
		memberVO.setName("알파벳");
		memberVO.setPhoneNumber("01012345678");
		memberVO.setEmail("abc@abcd.com");
		memberVO.setAddress("서울특별시 여의도");
		memberVO.setBirth("970311");
		
		System.out.println("ID : " + memberVO.getId());
		System.out.println("비밀번호 : " + memberVO.getPassword());
	}

}
