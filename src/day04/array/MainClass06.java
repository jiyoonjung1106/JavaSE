package day04.array;

import java.util.Random;

public class MainClass06 {
	public static void main(String[] args) {
		Random random = new Random();
		int nums [] [] = new int [7] [7];
		
		
		for(int num = 0; num<7; num++ ) {
			for(int num1=0; num1<num; num1++) {
			int rint = random.nextInt(49)+1;
			nums[num][num1] = rint;
			System.out.print(nums[num][num1]+" \t");
			}
			System.out.println();
		}
		for(int num = 0; num<7; num++ ) {
			for(int num1=num; num1<7; num1++) {
			int rint = random.nextInt(49)+1;
			nums[num][num1] = rint;
			System.out.print( nums[num][num1]+" \t" );
			}
			System.out.println(	);
		}
	}
	
}
