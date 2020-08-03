package class073101;

import java.util.*;

public class ICIAMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ICIADAO iDAO = new ICIADAO();
		ICIADTO iDTO = null;

		boolean run = true;
		int user_num = 0;

		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("0.DB���� | 1.������ ��ȸ | 2.������ �Է� |3.�ּ� ����| 4.����| 5.����");
			System.out.println("-------------------------------------");
			user_num = scan.nextInt();

			switch (user_num) {
			case 0:
				iDAO.DBConnection();
				break;
			case 1:
				iDAO.SelectAll();
				break;
			case 2:
				iDTO = new ICIADTO();

				System.out.print("�̸� : ");
				iDTO.setMname(scan.next());
				System.out.print("�ּ� : ");
				iDTO.setMaddress(scan.next());
				System.out.print("��ȭ��ȣ : ");
				iDTO.setMphone(scan.next());
				System.out.print("������� (YYYYMMDD) : ");
				iDTO.setMbirth(scan.next());

				if (iDAO.InsertData(iDTO)) {
					System.out.println("��� �Ϸ�");
				} else {
					System.out.println("��� ����");
				}
				break;
			case 3:
				iDTO = new ICIADTO();
				System.out.print("������ ȸ���� ��ȣ : ");
				iDTO.setMnumber(scan.nextInt());
				System.out.print("������ �ּ� : ");
				iDTO.setMaddress(scan.next());

				if (iDAO.ModifyData(iDTO)) {
					System.out.println("���� �Ϸ�");
				} else {
					System.out.println("���� ����");
				}

				break;
			case 4:
				iDTO = new ICIADTO();
				System.out.print("������ ȸ���� ��ȣ : ");
				iDTO.setMnumber(scan.nextInt());
				
				if(iDAO.DeleteData(iDTO)) {
					System.out.println("ȸ�� ����");
				}else {
					System.out.println("���� ����");
				}
				break;
			case 5:
				run = false;
				System.out.println("����");
				break;

			}

		}
	}

}
