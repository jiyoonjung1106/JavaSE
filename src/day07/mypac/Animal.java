package day07.mypac;

public class Animal {
		
	//변수와 직접 접근 막기 위해
	//get set 메소드 이용
	private String name;
	
	//set메소드 - 값 설정하기
	//이름 지어주기
	public void setName(String name) {
		this.name = name;
	}
	
	//get메소드 - 값 가져오기
	public String getName() {
			return name;
	}
	
	
	//움직인다.
	public void move() {
		System.out.println("움직인다.");
		}
 }
