package class072301;

public class CellPhoneMain {

	public static void main(String[] args) {

		CellPhone cp = new CellPhone();
		SmartPhone sp = new SmartPhone();
		
		//�ڽ�Ŭ�������� �θ�Ŭ������ ������ �ִ� �ʵ带 ��� ��� ����
		cp.button = "��ư 10 ��";
		cp.color = "red";
		cp.message = "�޽���";
		cp.model = "��ȭ��";
		
		//�θ�Ŭ����(Phone) �޼ҵ� ȣ��
		cp.hangOn();
		cp.hangOff();
		//�ڽ�Ŭ����(CellPhone) �޼ҵ� ȣ��
		cp.sendMessage("�ȳ�");
		cp.powerOn();
		
		sp.button = "��ġ��ũ��";
		sp.color = "black";
		sp.message = "ī��";
		sp.model = "������";
		sp.type = "lte";
		sp.call("��������");
		
		sp.hangOff();
		sp.hangOn();
		sp.powerOff();
		sp.powerOn();
		sp.receiveMessage("�ȳ�");
		sp.sendMessage("�ȳ�");
	}

}
