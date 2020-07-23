package class072201;

import java.util.*;

public class LibraryMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LibraryService service = new LibraryService();
		List<MemberDTO> memberList = new ArrayList<MemberDTO>();
		List<BookDTO> bookList = new ArrayList<BookDTO>();
		
		int user_num = 0;
		boolean run = true;
		
		
		while (run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.ȸ����� | 2.å ��� | 3.���� ���� | 4.���� ��� | 5.����| ");
			System.out.println("--------------------------------------------");
			System.out.print("���� > ");
			user_num = scan.nextInt();
			
			switch (user_num) {
			case 1: // ȸ�����
				service.AddMember(memberList);
				break;

			case 2: // å ���
				service.AddBook(bookList);
				break;

			case 3: // ���� ����
				service.LendBook(bookList,memberList);
				break;

			case 4: // ���� ���
				service.PrintBook(bookList);
				break;

			case 5: // ����
				run = false;
				break;
				
			default :
				System.out.println("�߸��� �Է��Դϴ�. ");
			}
		}

	}

}
