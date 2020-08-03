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
			System.out.println("0.DB 접속|1.전체조회|2.고객등록|3.");
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
				System.out.print("이름 : ");
				String name = scan.next();
				System.out.print("주소 : ");
				String address = scan.next();
				System.out.print("전화번호 : ");
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
