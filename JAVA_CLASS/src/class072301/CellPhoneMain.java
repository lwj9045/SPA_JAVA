package class072301;

public class CellPhoneMain {

	public static void main(String[] args) {

		CellPhone cp = new CellPhone();
		SmartPhone sp = new SmartPhone();
		
		//자식클래스에서 부모클래스가 가지고 있는 필드를 모두 사용 가능
		cp.button = "버튼 10 개";
		cp.color = "red";
		cp.message = "메시지";
		cp.model = "전화기";
		
		//부모클래스(Phone) 메소드 호출
		cp.hangOn();
		cp.hangOff();
		//자식클래스(CellPhone) 메소드 호출
		cp.sendMessage("안녕");
		cp.powerOn();
		
		sp.button = "터치스크린";
		sp.color = "black";
		sp.message = "카톡";
		sp.model = "아이폰";
		sp.type = "lte";
		sp.call("여보세요");
		
		sp.hangOff();
		sp.hangOn();
		sp.powerOff();
		sp.powerOn();
		sp.receiveMessage("안녕");
		sp.sendMessage("안녕");
	}

}
