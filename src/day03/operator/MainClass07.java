package day03.operator;
/*
 * 8. 삼항 연산자(조건문과 비슷)
 * 		조건식 ? 조건식이 참일 경우 : 조건식이 거짓일 경우
 * 
 * 
 */
public class MainClass07 {
			public static void main(String[] args) {
				int num = 10;
				String result = num>0 ? "num은 양수" : "num은 음수";
				System.out.println(result + "입니다.");
			}
}
