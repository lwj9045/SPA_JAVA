package class072301;

public class Phone {
	
	//필드 선언
	 String model;
	String color;
	
	//메소드 선언
	void hangOn() {
		System.out.println("전화를 겁니다. ");
	}
	void hangOff() {
		System.out.println("전화를 끊습니다. ");
	}
	
	void call(String sendVoice) {
		System.out.println(sendVoice);
	}
	
//	Phone(String model, String button){
//		this.model = model;
//		this.button = button;
//	}
}