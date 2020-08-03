package class073102;

import java.util.*;

public class MemberMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MemberDAO mDAO = new MemberDAO();
		MemberDTO mDTO = null;
		boolean run = true;

		while (run) {
			System.out.println("-----------------------");
			System.out.println("0.����  1.ȸ������  2.�α���  3.��ü ��ȸ  4.ID �ߺ�Ȯ��   5.PW����  6.ȸ��Ż��");
			System.out.println("-----------------------");
			System.out.print("���� > ");
			int user_num = scan.nextInt();
			switch (user_num) {
			case 0: //����
				run = false;
				System.out.println("�����մϴ�.");
				break;
			case 1: // ȸ������
				mDAO.Connection();
				mDTO = new MemberDTO();
				System.out.print("ID : ");
				mDTO.setMid(scan.next());
				System.out.print("PW : ");
				mDTO.setMpassword(scan.next());
				System.out.print("�̸� : ");
				mDTO.setMname(scan.next());
				System.out.print("�ڵ��� : ");
				mDTO.setMphone(scan.next());
				System.out.print("���� : ");
				mDTO.setMage(scan.nextInt());

				if (mDAO.InsertMember(mDTO) == 1) {
					System.out.println("ȸ������ ����");
				} else {
					System.out.println("ȸ������ ����");
				}
				break;
			case 2: // �α���
				mDAO.Connection();
				mDTO = new MemberDTO();
				System.out.print("ID : ");
				mDTO.setMid(scan.next());
				System.out.print("PW : ");
				mDTO.setMpassword(scan.next());
//				mDAO.Login(mDTO);
				if (mDAO.Login(mDTO)) {
					System.out.println("�α��� ����");
				} else {
					System.out.println("���̵� �Ǵ� ��й�ȣ�� Ȯ���ϼ���.");
				}
				break;
			case 3: // ��ü��ȸ
				mDAO.Connection();
				mDAO.SelectAll();
				break;
			case 4: // ID �ߺ�üũ
				mDAO.Connection();
				mDTO = new MemberDTO();
				System.out.print("ID : ");
				mDTO.setMid(scan.next());
				if(mDAO.IdCheck(mDTO)) {
					System.out.println("�ߺ��� ���̵� �Դϴ�.");
				}else {
					System.out.println("��밡���� ���̵� �Դϴ�.");
				}
				break;
			case 5: // PW����
				mDAO.Connection();
				mDTO = new MemberDTO();
				System.out.println("ID : ");
				mDTO.setMid(scan.next());
				System.out.println("������ PW : ");
				mDTO.setMpassword(scan.next());
				if(mDAO.ModifyPW(mDTO)) {
					System.out.println("���� �Ϸ�");
				}else {
					System.out.println("���� ����");
				}
				
				break;
			case 6: // ȸ�� Ż��
				mDAO.Connection();
				mDTO = new MemberDTO();
				System.out.println("ID : ");
				mDTO.setMid(scan.next());
				if(mDAO.DeleteId(mDTO)) {
					System.out.println("���� ����");
				}else {
					System.out.println("���� ����");
				}
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
				break;
			}
		}
		scan.close();
	}
}
