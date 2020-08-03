package class073001;

import java.util.*;

public class DBMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		TestDAO tDAO = new TestDAO();
		CustomerDTO customerDTO = null;
		
		boolean run = true;
		int selectNum = 0;

		while (run) {
			System.out.println("--------------------");
			System.out.println("0.DB ����|1.��ü��ȸ|2.�����|3.");
			System.out.println("--------------------");
			selectNum = scan.nextInt();
			switch (selectNum) {
			case 0:
				tDAO.dbConnection();
				break;
			case 1:
				tDAO.selectAll();
				break;
			case 2:
				System.out.print("�̸� : ");
				String name = scan.next();
				System.out.print("�ּ� : ");
				String address = scan.next();
				System.out.print("��ȭ��ȣ : ");
				String phone = scan.next();
				
				customerDTO = new CustomerDTO();
				customerDTO.setName(name);
				customerDTO.setAddress(address);
				customerDTO.setPhone(phone);
				
				tDAO.insertCustomer(customerDTO);
				break;
				
			}
		}

	}

}
