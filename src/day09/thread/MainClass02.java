package day09.thread;

import day09.mypac2.CountThread;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("메인스레드가 시작됩니다.");
		
		new CountThread().start();
		
		System.out.println("메인스레드가 종료됩니다.");
	}

}
