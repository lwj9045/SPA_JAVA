package class072301;

//CellPhone 클래스를 Phone의 자식클래스로  선언
public class CellPhone extends Phone{
	
	String button;
	String message;
	
	//생성자
	CellPhone(){
		
	}

	//button, model, color를 매개변수로 하는 생성자 선언
	CellPhone(String button, String model, String color) {
		this.button = button;
		this.model = model;
		this.color = color;
	}
	
	//메소드
	void sendMessage(String message) {
		System.out.println("메시지 전송 : "+message);
	}
	void receiveMessage(String message) {
		System.out.println("메시지 수신 : "+message);
	}
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	// 메소드 재 정의(Overriding)
	@Override
	void hangOn() {
		System.out.println("CellPhone으로 전화를 겁니다. ");
	}
	
}
