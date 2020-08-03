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
			System.out.println("0.DB접속 | 1.데이터 조회 | 2.데이터 입력 |3.주소 수정| 4.삭제| 5.종료");
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

				System.out.print("이름 : ");
				iDTO.setMname(scan.next());
				System.out.print("주소 : ");
				iDTO.setMaddress(scan.next());
				System.out.print("전화번호 : ");
				iDTO.setMphone(scan.next());
				System.out.print("생년월일 (YYYYMMDD) : ");
				iDTO.setMbirth(scan.next());

				if (iDAO.InsertData(iDTO)) {
					System.out.println("등록 완료");
				} else {
					System.out.println("등록 실패");
				}
				break;
			case 3:
				iDTO = new ICIADTO();
				System.out.print("수정할 회원의 번호 : ");
				iDTO.setMnumber(scan.nextInt());
				System.out.print("수정할 주소 : ");
				iDTO.setMaddress(scan.next());

				if (iDAO.ModifyData(iDTO)) {
					System.out.println("수정 완료");
				} else {
					System.out.println("수정 실패");
				}

				break;
			case 4:
				iDTO = new ICIADTO();
				System.out.print("삭제할 회원의 번호 : ");
				iDTO.setMnumber(scan.nextInt());
				
				if(iDAO.DeleteData(iDTO)) {
					System.out.println("회원 삭제");
				}else {
					System.out.println("삭제 실패");
				}
				break;
			case 5:
				run = false;
				System.out.println("종료");
				break;

			}

		}
	}

}
