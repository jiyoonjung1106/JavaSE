package day11.util;

import java.util.HashSet;
import java.util.Iterator;

/*
 * [[ HashSet Class ]]
 *  - 데이터 순서가 없다.
 *  - 중복값이 들어가지 않는다.
 */
public class MainClass04 {

	public static void main(String[] args) {
			HashSet<String>  hs = new HashSet<>();
			
			//데이터 저장
			hs.add("딸기");
			hs.add("가온");
			hs.add("로진");
			
			//사이즈 확인
			System.out.println(hs.size());
			
			//Iterator(반복자) 객체 이용해서 출력
			Iterator<String>  it = hs.iterator();
			
			while(it.hasNext()) {		//hasNext() 데이터가 있다면 true
				// 값 읽어오기
				String value = it.next();
				//출력
				System.out.println("name : "+ value);
			}
	}

}























