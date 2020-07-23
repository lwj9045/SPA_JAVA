package class072201;

import java.util.*;

public class BankService {

	Scanner scan = new Scanner(System.in);
	BankDTO bankData = null;

	public void Initial(List<BankDTO> clientList) {
		bankData = new BankDTO();
		clientList.add(bankData);
	}

	public void Client(List<BankDTO> clientList) {
		bankData = new BankDTO();
		System.out.print("������ �Է��ϼ��� : ");
		bankData.setName(scan.next());
		System.out.print("����Ͻ� ���¹�ȣ�� �Է��ϼ��� : ");
		bankData.setAccountNumber(scan.nextInt());
		System.out.print("����Ͻ� ��й�ȣ�� �Է��ϼ��� : ");
		bankData.setPw(scan.next());
		System.out.print("���¿� �Ա��� �ݾ��� �Է��ϼ��� : ");
		bankData.setMoney(scan.nextInt());
		bankData.setNumber(clientList.size());
	}

	public boolean Check(List<BankDTO> clientList) {
		for (int i = 0; i < clientList.size(); i++) {
			if (bankData.getAccountNumber() == clientList.get(i).getAccountNumber()) {
				return false;
			}
		}
		return true;
	}

	public void Add(List<BankDTO> clientList) {
		if (Check(clientList)) {
			clientList.add(bankData);
			System.out.println("��� �Ϸ�");
		} else {
			System.out.println("�ߺ��� ���� �Դϴ�.");
		}
	}

	public List<BankDTO> Deposit(List<BankDTO> clientList) {
		bankData = new BankDTO();
		System.out.print("�Ա��Ͻ� ���¹�ȣ�� �Է��ϼ��� : ");
		bankData.setAccountNumber(scan.nextInt());
		System.out.print("��й�ȣ�� �Է��ϼ��� : ");
		bankData.setPw(scan.next());

		if (Check(clientList)) {
			System.out.println("��ϵ��� ���� �����Դϴ�.");
		} else {
			for (int i = 0; i < clientList.size(); i++) {
				if (bankData.getAccountNumber() == clientList.get(i).getAccountNumber()) {
					if (bankData.getPw().equals(clientList.get(i).getPw())) {
						System.out.print("�Ա��Ͻ� �ݾ��� �Է��ϼ��� : ");
						int money = scan.nextInt();
						clientList.get(i).setMoney(clientList.get(i).getMoney() + money);
						System.out.println("�ԱݿϷ�");
						System.out.println("�ܾ��� " + clientList.get(i).getMoney() + "�� �Դϴ�.");
					} else {
						System.out.println("���¹�ȣ�� ��й�ȣ�� �´��� Ȯ���ϼ���.");
					}
				}
			}
		}
		return clientList;
	}

	public List<BankDTO> WithDraw(List<BankDTO> clientList) {
		bankData = new BankDTO();
		System.out.print("����Ͻ� ���¹�ȣ�� �Է��ϼ��� : ");
		bankData.setAccountNumber(scan.nextInt());
		System.out.print("��й�ȣ�� �Է��ϼ��� : ");
		bankData.setPw(scan.next());

		if (Check(clientList)) {
			System.out.println("��ϵ��� ���� �����Դϴ�.");
		} else {
			for (int i = 0; i < clientList.size(); i++) {
				if (bankData.getAccountNumber() == clientList.get(i).getAccountNumber()) {
					if (bankData.getPw().equals(clientList.get(i).getPw())) {
						System.out.print("����Ͻ� �ݾ��� �Է��ϼ��� : ");
						int money = scan.nextInt();
						if (clientList.get(i).getMoney() >= money) {
							clientList.get(i).setMoney(clientList.get(i).getMoney() - money);
							System.out.println("��ݿϷ�");
							System.out.println("�ܾ��� " + clientList.get(i).getMoney() + "�� �Դϴ�.");
						} else {
							System.out.println("�ܾ��� �����մϴ�.");
						}

					} else {
						System.out.println("���¹�ȣ�� ��й�ȣ�� �´��� Ȯ���ϼ���.");
					}
				}
			}
		}
		return clientList;
	}

	public void PrintMoney(List<BankDTO> clientList) {
		bankData = new BankDTO();
		System.out.print("�ܾ�Ȯ���Ͻ� ���¹�ȣ�� �Է��ϼ��� : ");
		bankData.setAccountNumber(scan.nextInt());
		System.out.print("��й�ȣ�� �Է��ϼ��� : ");
		bankData.setPw(scan.next());

		if (Check(clientList)) {
			System.out.println("��ϵ��� ���� �����Դϴ�.");
		} else {
			for (int i = 0; i < clientList.size(); i++) {
				if (bankData.getAccountNumber() == clientList.get(i).getAccountNumber()) {
					if (bankData.getPw().equals(clientList.get(i).getPw())) {
						System.out.println("�ܾ��� " + clientList.get(i).getMoney() + "�� �Դϴ�.");
					} else {
						System.out.println("���¹�ȣ�� ��й�ȣ�� �´��� Ȯ���ϼ���.");
					}
				}

			}
		}
	}

	public void PrintClient(List<BankDTO> clientList) {
		bankData = new BankDTO();
		System.out.print("Ȯ���Ͻ� ���¹�ȣ�� �Է��ϼ��� : ");
		bankData.setAccountNumber(scan.nextInt());
		System.out.print("��й�ȣ�� �Է��ϼ��� : ");
		bankData.setPw(scan.next());

		if (Check(clientList)) {
			System.out.println("��ϵ��� ���� �����Դϴ�.");
		} else {
			for (int i = 0; i < clientList.size(); i++) {
				if (bankData.getAccountNumber() == clientList.get(i).getAccountNumber()) {
					if (bankData.getPw().equals(clientList.get(i).getPw())) {
						System.out.println("ȸ����ȣ : " + clientList.get(i).getNumber());
						System.out.println("�̸� : " + clientList.get(i).getName());
						System.out.println("���¹�ȣ : " + clientList.get(i).getAccountNumber());
						System.out.println("��й�ȣ : " + clientList.get(i).getPw());
						System.out.println("�ܾ� : " + clientList.get(i).getMoney() + "��");
					} else {
						System.out.println("���¹�ȣ�� ��й�ȣ�� �´��� Ȯ���ϼ���.");
					}
				}
			}
		}
	}

	public boolean End() {
		System.out.println("�����մϴ�.");
		return false;
	}

}
