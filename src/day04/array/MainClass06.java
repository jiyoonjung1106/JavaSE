package day04.array;

import java.util.Random;

public class MainClass06 {
	public static void main(String[] args) {
		Random random = new Random();
		int nums [] [] = new int [7] [7];
		
		for(int num = 0; num<7; num++ ) {
			for(int num1=0; num1<num; num1++) {
			int rint = random.nextInt(49)+1;
			System.out.print(rint+" \t");
			}
			System.out.println();
		}
		for(int num = 7; num>0; num-- ) {
			for(int num1=0; num1<num; num1++) {
			int rint = random.nextInt(49)+1;
			System.out.print( rint+" \t" );
			}
			System.out.println(	);
		}
	}
	
}
