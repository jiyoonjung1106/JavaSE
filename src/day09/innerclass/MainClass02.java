package day09.innerclass;

import day09.mypac.MyUtil;

public class MainClass02 {
	public static void main(String[] args) {
		//MyUtil 클래스 안에 있는 HelloPrinter클래스 객체 생성하기
		MyUtil mu = new MyUtil();
		MyUtil.HelloPrinter hp = mu.new HelloPrinter();
		
		hp.printHello();
		
		//두번째방법
		MyUtil.HelloPrinter hp2 = new MyUtil().new HelloPrinter();
		
		hp2.printHello();
		
		//static 내부클래스 생성 및 호출
		MyUtil.Calculator calc = new MyUtil.Calculator();
		calc.calc(10, 20);
	}
}
