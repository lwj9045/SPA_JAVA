package class072001;
import java.util.*;
public class NaverMemberMain2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		NaverService2 service = new NaverService2();
		List<NaverMemberDTO2> MemberList = new ArrayList<NaverMemberDTO2>();
		
		int user_num = 0;
		boolean run = true;
		
		while(run) {
			System.out.println("1.ȸ�����  2.��ü IDȮ��  3. ��üID,PWȮ��  4.����");
			user_num = scan.nextInt();
			switch(user_num) {
			case 1 :
				service.Create();
				service.Add(MemberList);
				break;
			case 2 :
				service.IdView(MemberList);
				break;
			case 3 :
				service.AllView(MemberList);
				break;
			case 4 :
				run = service.Quit();
				break;
			default :
				System.out.println("�߸��� �Է��Դϴ�. ");
				break;
			}
		}
		scan.close();
	}

}
