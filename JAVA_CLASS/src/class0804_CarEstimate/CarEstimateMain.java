package class0804_CarEstimate;

import java.util.*;

public class CarEstimateMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ChoiceDTO cDTO = null;
		SaveDTO sDTO = null;
		CarEstimateDAO cDAO = new CarEstimateDAO();
		boolean run = true;
		int user_num = 0;

		while (run) {
			sDTO = new SaveDTO();
			
			System.out.println("-----------------------------------------------------");
			System.out.println("0.프로그램 실행  1.차량선택  2.옵션선택  3.결제수단 선택 4.견적내기 5.저장  6.조회");
			System.out.println("------------------------------------------------------");
			System.out.print("선택 > ");
			user_num = scan.nextInt();

			switch (user_num) {
			case 0: // 프로그램 실행(DB접속)
				cDAO.DBConnection();
				
				if(cDAO.DataCheck()) { // 가상 데이터 초기화
					cDAO.DeleteData();
				}
				break;

			case 1: // 차량선택
				cDTO = new ChoiceDTO();
				cDAO.CarChoice(cDTO, sDTO);// 차 선택
				System.out.println("브랜드 :" + sDTO.getCompanyname() + "\t" + "차량 :" + sDTO.getCarName() + "\t" + "엔진 :"
						+ sDTO.getCarTypeName() + "이 선택되었습니다.");
				System.out.println("가격은 " + sDTO.getTotalPrice() + "원 입니다.");
				cDAO.SaveCarInfo(sDTO);// 정보 저장
				break;

			case 2: // 옵션선택
				cDTO = new ChoiceDTO();
				int option = cDAO.OptionChoice(cDTO, sDTO);// 옵션선택
				int color = cDAO.ColorChoice(cDTO, sDTO);// 컬러선택
				sDTO.setTotalPrice(cDAO.SumTotalPrice(option, color));// 가격 더하기
				System.out.println("옵션 :" + sDTO.getOptionName() + "\t" + "색상 :" + sDTO.getColorName() + "이 선택되었습니다.");
				System.out.println("가격은" + (option + color) + "원 입니다.");
				cDAO.SaveDetailInfo(sDTO);
				break;

			case 3: // 결제수단 선택
				cDTO = new ChoiceDTO();
				cDAO.PaymentChoice(cDTO, sDTO);
				System.out.println(
						"카드사 :" + sDTO.getCardName() + "\t" + "할부 개월 :" + sDTO.getMonthName() + "개월이 선택되었습니다.");
				System.out.println("이자율은 " + sDTO.getInterest() + "% 입니다.");
				cDAO.SavePaymentInfo(sDTO);
				break;

			case 4: // 견적내기
				cDAO.AllPrint();
				cDAO.FinalPrice(sDTO);
				cDAO.MonthPrice(sDTO);
				cDAO.SaveMonthPrice(sDTO);
				break;

			case 5: // 저장
				System.out.println("저장 하시겠습니까?");
				System.out.println("1.예  2.아니오");
				System.out.print("선택 > ");
				int num = scan.nextInt();

				if (num == 1) { // 저장
					System.out.println("ID,PW는 3~10자리 이내로 입력하세요.");
					System.out.print("저장할 ID :");
					sDTO.setId(scan.next());
					System.out.print("저장할 PW : ");
					sDTO.setPw(scan.next());
					
					if (sDTO.getId().length() >= 3 && sDTO.getId().length() <= 10) { //3~10자리
						if (cDAO.SaveIDPW(sDTO)) {
							System.out.println("저장 완료");
						} else {
							System.out.println("저장 실패");
						}
					}else {
						System.out.println("아이디가 너무 짧습니다.");
					}
				} else if (num == 2) { // 삭제
					cDAO.DeleteData();
				}
				break;

			case 6: // 조회
				if (cDAO.IDCheck(sDTO)) {
					cDAO.IDPrint(sDTO);
				} else {
					System.out.println("등록되지 않은 아이디 입니다.");
				}
				break;

			}

		}

	}

}
