package day04.array;

public class MainClass02 {
		public static void main(String[] args) {
			// 배열 객체 생성하기
			String[ ] names = new String[6];
			names[0] = "피카츄";
			names[1] = "파치리스";
			names[2] = "이어롤";
			names[3] = "꼬부기";
			names[4] = "체리";
			names[4] = "샤오랑";
			
			//값 가져오기
			System.out.println(names[3]);
			
			//배열의 길이
			System.out.println(names.length);
			
			//배열 for문을 사용해 전체 출력하기
			for(int i =0; i<names.length; i++) {
				System.out.println(names[i]);
			}
		}
	
}
