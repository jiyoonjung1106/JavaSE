package day05.method;
/*
 * [[ 메소드(method) ]]
 * 	어떤 특정 작업을 수행하기 위한 명령문의 집합.
 * 
 *  (접근제어자) (정적) 반환타입 메소드이름(매개변수타입 매개변수명) {	// 선언부
 *  	실행할 코드(명령문)		// 구현부
 *  	
 *  	return 반환값;	// void 일때 생략가능
 *  }
 * 	
 * 	오버로딩(overloading)
 * 		메소드 명이 같아도, 매개변수 개수 또는 타입이 다르면 사용가능.
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
makeStar(); // 마름모 별찍기
		
		// hello 메소드 호출하기
		hello();
		
		// printName 메소드 호출하기
		printName("피카츄");
		printName("피카츄","김");
		printName(1000);
		printName(1000,"T-");
		
		hello();
		
		makeStar(); // 마름모 별찍기
	}

	// 인자 X 리턴 X -> 호출시 실행하고 끝나는 메소드
	public static void hello() {
		System.out.println("Hello, world");
	}
	
	// 인자 O 리턴 X
	public static void printName(String name) {
		System.out.println("이름 :  " +name) ;
	}
	
	// 인자 O 리턴 X
	public static void printName(String firstName, String lastName) {
		System.out.println("이름 : " + firstName);
		System.out.println("성 : " + lastName);
	}
	// 오버로딩(overloading)
		// 인자 O 리턴 X
		public static void printName(int name) {
			System.out.println("로봇 번호 : "+name);
		}
		
		public static void printName(int firstName, String lastName) {
			System.out.println("이름 :" +lastName+ firstName);
		}
		/**
		 * 마름모 별찍기
		 */
		public static void makeStar() {
			for (int i = 0; i < 7; i++) {
				for (int j = 0; j < 7; j++) {
					if (i < 7 / 2 + 1) {
						if (i + j < 3) {
							System.out.print(" ");
						} else if (3 < j - i) {
							System.out.print(" ");
						} else {
							System.out.print("*");
						}
					} else {
						if (i - j > 3) {
							System.out.print(" ");
						} else if (i + j > 9) {
							System.out.print(" ");
						} else {
							System.out.print("*");
						}
					}
				}
				System.out.println();
			}
		}
}
