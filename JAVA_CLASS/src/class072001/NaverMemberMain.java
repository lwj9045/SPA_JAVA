package class072001;

import java.util.*;

public class NaverMemberMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<NaverMemberDTO> memberList = new ArrayList<NaverMemberDTO>();
		NaverMemberDTO member = null;
		NaverService service = new NaverService();
		
		boolean run = true;
		int user_num = 0;

		while (run) {
			System.out.println("1.ȸ����� | 2.ȸ�� ��ü ID Ȯ�� | 3. ȸ�� ��ü ID,PW Ȯ�� | 4. ����");
			user_num = scan.nextInt();

			switch (user_num) {
			case 1:
				member = new NaverMemberDTO();
				System.out.print("iD�� �Է��ϼ��� : ");
				member.setId(scan.next());
				System.out.print("PW�� �Է��ϼ��� : ");
				member.setPw(scan.next());
				System.out.print("�̸��� �Է��ϼ��� : ");
				member.setName(scan.next());
				System.out.print("��ȭ��ȣ�� �Է��ϼ��� : ");
				member.setPhone(scan.next());
				memberList.add(member);
				break;
			case 2:
				service.IdPrint(memberList);
				break;
			case 3:
				service.AllPrint(memberList);
				break;
			case 4:
				System.out.println("�����մϴ�.");
				run = false;
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�. ");
			}
		}
		scan.close();
	}

}
