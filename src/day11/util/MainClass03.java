package day11.util;

import java.util.Vector;

/*
 * [[ Vector Class]]
 *  - ArrayList와 동일
 *  - Thread safe
 *  - ArrayList보단 무겁다.
 * 
 * 
 */
public class MainClass03 {
	public static void main(String[] args) {
		
		Vector<String> vec = new Vector<>();
		
		//추가
		vec.add("피카츄");
		vec.add("펭도리");
		vec.add("마자용");
		
		//저장된 데이터에서 특정 인덱스 내용 삭제하기
		vec.remove(1);
		
		System.out.println("저장된 데이터의 개수 : "+vec.size());
		
		for(int i =0; i<vec.size(); i++) {
			System.out.println("vec["+ i+ "] : "+ vec.get(i));
		}
		
		for(String name : vec) {
			System.out.println("name : "+ name);
		}
		
		

	}

}
