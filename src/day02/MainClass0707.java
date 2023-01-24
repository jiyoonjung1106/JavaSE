package day02;
/*
 * [[참조형 데이터형(레퍼런스형)]]
 * 5. String 형(문자열)
 * 		- 선언하는 방법
 * 			String 변수명;
 * 		- 문자열을 저장할 수 있다. 
 * 
 * 기본형 - boolean, char, byte, short, int, long, float, double
 *  참조형 - 기본형을 제외한 모든 클래스
 * 
 */
public class MainClass0707 {
	public static void main(String[] args) {
		// 변수 선언과 동시에 값 대입하기
		String str = "안녕하세요.";
		System.out.println("str : " + str);
		System.out.println(str.length());
		
		String str1 = new String();
		if(str.isEmpty())
			System.out.println("empty");
		else 
			System.out.println("not empty");
		
		
		/*
		 * h e l l o
		 * 0 1 2 3 4 => 인덱스 번호
		 */
		String hello = "hello";
		System.out.println("1번 인덱스 : " + hello.charAt(1));
		System.out.println("2번 인덱스부터 4번 인덱스까지 : " + hello.substring(2, 4));

		
		String addr = "서울 특별시 강남";
		boolean isContain = addr.contains("신촌");
		if(isContain) {		//true이면 실행
			System.out.println("addr에는 강남이라는 문자열이 있어요! ");
			
			String str2 = new String("asdf");
			char [] ch = new char[3];
			str.getChars(0, 3, ch, 0);
			
			System.out.println(ch);
			
			String str3 = new String("안녕하세요");
			String str4 = new String("안녕하세요");
			
			if(str3.equals(str4))
				System.out.println("equal");
			else
				System.out.println("not equal");
			
		}
	}

}
