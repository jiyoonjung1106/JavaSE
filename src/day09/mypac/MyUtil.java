package day09.mypac;

public class MyUtil {
	public String name = "MyUtil";
	public static String staticName = "마이유틸";
	
	//내부클래스
	public class HelloPrinter{
			//메소드
			public void printHello() {
				System.out.println(staticName+" 내부 클래스 HelloPrinter입니다.");
				System.out.println(name+" 내부 클래스 HelloPrinter입니다.");
			}
	}
	
	public static class Calculator {
			// 메소드
			public void calc(int a, int b) {
				int result = a+b;
				System.out.println("전달받은 두 정수의 합 : "+ result);
				System.out.println(staticName+"static 내부 클래스입니다. ");
			}
	}

}
