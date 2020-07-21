package class071501;

public class Mobile_A {

	String company = "삼성";
	String model;
	String color;
	int type; // 4g,5g

	// 모든 필드를 매개변수로 하는 생성자
	Mobile_A(String company, String model, String color, int type) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.type = type;
	}

	// 생성자 overloading : 생성자를 여러 개 생성할 수 있음

}
