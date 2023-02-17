package day11.util;

import java.util.Stack;

/*
 * [[ Stack Class]]
 * - 배열성 클래스
 * - 선입후출(FILO) : 먼저 들어온 값이 마지막에 나간다.
 * 
 * Generic(제네릭)
 *  1. 잘못된 타입 들어오는 것 방지
 * 	 2. 변환(cast) 필요없다.
 * 
 * */
public class MainClass01 {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();		// 여기서 제너릭은 들어갈 타입을 정해주는 것.
		
		// 생성한 객체에 자료 저장하기
		stack .push("피카츄");
		stack.push("이브이");
		stack.push("이어롤");
		
		// 현재 저장하고 있는 데이터 개수
		System.out.println("데이터 개수 : "+stack.size());
		
		// 데이터를 하나씩 빼오기
//		System.out.println("1번"+stack.pop());
//		System.out.println("2번"+stack.pop());
//		System.out.println("3번"+stack.pop());
		
		System.out.println("가장 위에 있는 데이터 : "+ stack.peek());
		
		while(!stack.empty()) {		//empty가 아닌 경우 출력을 돌리겠다는 반복문
			String name = stack.pop();			//pop하면 데이터가 사라짐
			System.out.println("pop한 데이터 " + name);
		}

	}

}
