package day07.mypac;

public class PersianCat extends Cat{
		public void getColor() {
			System.out.println("하얗다");
		}

		@Override		//부모 메소드 재정의
		public void move() {
			super.move();
			System.out.println("우아하게");
		}
		
}
