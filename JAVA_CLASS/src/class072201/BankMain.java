package class072201;

import java.util.*;

public class BankMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BankService service = new BankService();
		List<BankDTO> clientList = new ArrayList<BankDTO>();

		int user_num = 0;
		boolean run = true;
		service.Initial(clientList);

		while (run) {
			System.out.println("1.고객등록  2.예금  3.출금  4.잔액확인 5.계좌정보 확인 6.종료");
			System.out.print("선택 >");
			user_num = scan.nextInt();

			switch (user_num) {

			case 1:
				service.Client(clientList);
				service.Add(clientList);
				break;

			case 2:
				clientList = service.Deposit(clientList);
				break;

			case 3:
				clientList = service.WithDraw(clientList);
				break;

			case 4:
				service.PrintMoney(clientList);
				break;

			case 5:
				service.PrintClient(clientList);
				break;

			case 6:
				run = service.End();
				break;

			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}

		}
	}

}
