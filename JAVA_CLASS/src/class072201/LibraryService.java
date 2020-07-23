package class072201;

import java.util.*;

public class LibraryService {

	Scanner scan = new Scanner(System.in);
	MemberDTO memberData = null;
	BookDTO bookData = null;

	public void AddMember(List<MemberDTO> memberList) {
		memberData = new MemberDTO();

		System.out.print("�̸� : ");
		memberData.setName(scan.next());
		System.out.print("��ȭ��ȣ : ");
		memberData.setPhone(scan.next());
		memberData.setMemNumber(memberList.size() + 1);
		memberList.add(memberData);
	}

	public void AddBook(List<BookDTO> bookList) {
		bookData = new BookDTO();

		System.out.print("���� �� : ");
		bookData.setBookname(scan.next());
		System.out.print("���� : ");
		bookData.setAuthor(scan.next());
		bookData.setBooknumber(bookList.size() + 1);
		bookList.add(bookData);
	}

	public void LendBook(List<BookDTO> bookList, List<MemberDTO> memberList) {
		System.out.print("�� ��ȣ : ");
		int memnumber = scan.nextInt();
		System.out.print("���� å ��ȣ : ");
		int booknumber = scan.nextInt();

		if (memnumber <= memberList.size()) {
			if (booknumber <= bookList.size()) {
				if (memnumber == memberList.get(memnumber - 1).getMemNumber()) {
					if (bookList.get(booknumber - 1).isCheck() == true) {
						System.out.println("������ �Ϸ�Ǿ����ϴ�.");
						bookList.get(booknumber - 1).setClientNumber(memnumber);
						bookList.get(booknumber - 1).setCheck(false);
					} else {
						System.out.println("������ �Ұ����� å �Դϴ�.");
					}
				}
			} else {
				System.out.println("��ϵ������� å�Դϴ�.");
			}
		} else {
			System.out.println("��ϵ������� ���Դϴ�.");
		}
	}

	public void PrintBook(List<BookDTO> bookList) {
		for (int i = 0; i < bookList.size(); i++) {
			System.out.println(bookList.get(i));
		}
	}

}
