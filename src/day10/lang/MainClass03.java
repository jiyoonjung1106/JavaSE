package day10.lang;
/*
 * [[래퍼 클래스(Wrapper Class) ]]
 * 8개의 기본타입에 해당하는 데이터를 객체로 표현
 * boolean, byte, char, short,  int, long, float, double
 * 
 * 
 */
public class MainClass03 {
	public static void main(String[] args) {
		boolean b1 = true;
		Boolean b2 = new Boolean(true);
		Boolean b3 = new Boolean(false);
		
		Boolean b4 = Boolean.valueOf(true);
		
		if(b4) {
			System.out.println("b4는 true입니다.");
		}else {
			System.out.println("b4는 false입니다.");
		}
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		
		// int Wrapper Class
		Integer number1 = new Integer(10);
		Integer number2 = Integer.valueOf(20);
		int number3 = 10;
		
		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number3);
		
		int num1 = Integer.parseInt("1000");
		int num2 = Integer.parseInt("2000");
		
		System.out.println(num1+num2);
		
	}

}
