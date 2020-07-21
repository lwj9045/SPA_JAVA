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
			System.out.println("1.회원등록  2.전체 ID확인  3. 전체ID,PW확인  4.종료");
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
				System.out.println("잘못된 입력입니다. ");
				break;
			}
		}
		scan.close();
	}

}
