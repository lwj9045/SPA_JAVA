package class072301;

public class Phone {
	
	//�ʵ� ����
	 String model;
	String color;
	
	//�޼ҵ� ����
	void hangOn() {
		System.out.println("��ȭ�� �̴ϴ�. ");
	}
	void hangOff() {
		System.out.println("��ȭ�� �����ϴ�. ");
	}
	
	void call(String sendVoice) {
		System.out.println(sendVoice);
	}
	
//	Phone(String model, String button){
//		this.model = model;
//		this.button = button;
//	}
}