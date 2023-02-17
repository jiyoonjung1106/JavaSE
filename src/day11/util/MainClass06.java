package day11.util;

import java.util.LinkedList;
import java.util.Queue;

/*
 * [[ Queue ]]
 * 	- 배열성 인터페이스
 * 	- 선입선출(FIFO) : 먼저 들어온 값이 먼저 나간다.
 */
public class MainClass06 {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.add("피카츄");
		queue.offer("펭도리");
		queue.offer("이어롤");
		
		LinkedList<String> list = (LinkedList<String>) queue;
		
		list.remove();
		
		System.out.println(list.get(0));
		
		System.err.println(list.poll());		//poll : 데이터값 사라짐
		System.err.println(list.poll());
		System.err.println(list.poll());
		
		System.out.println(list.size());
	}

}
