package day04;

public class Homework {
		public static void main(String[] args) {
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
