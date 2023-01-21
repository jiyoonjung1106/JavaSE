package day02;
/*
 * [[기본 자료형]]
 * 3. 정수형
 * 
 * 	- 선언하는 방법
 * 		byte 변수명; 			-128~127
 *		short 변수명 ;   		-32,768~ 32,767
 * 		int 변수명;  			-2,147,483,648 ~ 2,147,483,647
 * 		long 변수명; 			더 크다!!
 * 		
 * 			- 같은 정수형이지만 표현 범위가 다르다.
 * 			byte(1byte) < short(2byte) < int(4byte) < long(8byte)
 * 
 */
public class MainClass04 {
			public static void main(String[] args) {
				// 정수형 변수 선언과 동시에 값 대입하기
				byte iByte = 10;
				short iShort = 100;
				int iInt = 1000;
				long iLong = 10000;
				
				//저장된 값을 문자열로 출력하기
				iByte += 120; // iByte = iByte+120;
				System.out.println("byte 형 : " + iByte);
				System.out.println("short 형 : " + iShort);
				System.out.println("int 형 : " + iInt);
				System.out.println("Long 형 : " + iLong);
			}

}
