package day07.mypac;

public class CreamBread extends Bread {
	
	public CreamBread() {
		super();	//자식클래스에서 부모생성자 호출, super생성자는 항상 늘 위에 있어야함
		super.breadName = "크림빵";
		super.breadPrice = 1500;
	
	}

}
