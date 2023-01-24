package day04.loop;
/*
 * 중첩반복문 가능하다!
 */
public class MainClass04 {
		public static void main(String[] args) {
//					for(int i =0; i<7; i++) {
//						for(int j=0; j<7; j++) {
//							System.out.print("*");
//						}
//						System.out.println();
//					}
			
//			for(int i = 0; i<7; i++) {
//				for(int j= 0; j<i+1; j++) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
//			for(int i =1; i<=5; i++) {
//				for(int j= 5; j>0; j--) {
//					if(j>i) {
//						System.out.print(" ");
//					} else {
//						System.out.print("*");
//					}
//				}
//				System.out.println();
//			}
			for(int i =1; i<5; i++) {
				for(int j= 5; j>0; j--) {
					System.out.print(" ");
				}
				for(int j=1; j<=i*2-1; j++) {
				System.out.print("*");
				}
				System.out.println();
			}
		}
}
