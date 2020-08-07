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
			System.out.println("0.���α׷� ����  1.��������  2.�ɼǼ���  3.�������� ���� 4.�������� 5.����  6.��ȸ");
			System.out.println("------------------------------------------------------");
			System.out.print("���� > ");
			user_num = scan.nextInt();

			switch (user_num) {
			case 0: // ���α׷� ����(DB����)
				cDAO.DBConnection();
				
				if(cDAO.DataCheck()) { // ���� ������ �ʱ�ȭ
					cDAO.DeleteData();
				}
				break;

			case 1: // ��������
				cDTO = new ChoiceDTO();
				cDAO.CarChoice(cDTO, sDTO);// �� ����
				System.out.println("�귣�� :" + sDTO.getCompanyname() + "\t" + "���� :" + sDTO.getCarName() + "\t" + "���� :"
						+ sDTO.getCarTypeName() + "�� ���õǾ����ϴ�.");
				System.out.println("������ " + sDTO.getTotalPrice() + "�� �Դϴ�.");
				cDAO.SaveCarInfo(sDTO);// ���� ����
				break;

			case 2: // �ɼǼ���
				cDTO = new ChoiceDTO();
				int option = cDAO.OptionChoice(cDTO, sDTO);// �ɼǼ���
				int color = cDAO.ColorChoice(cDTO, sDTO);// �÷�����
				sDTO.setTotalPrice(cDAO.SumTotalPrice(option, color));// ���� ���ϱ�
				System.out.println("�ɼ� :" + sDTO.getOptionName() + "\t" + "���� :" + sDTO.getColorName() + "�� ���õǾ����ϴ�.");
				System.out.println("������" + (option + color) + "�� �Դϴ�.");
				cDAO.SaveDetailInfo(sDTO);
				break;

			case 3: // �������� ����
				cDTO = new ChoiceDTO();
				cDAO.PaymentChoice(cDTO, sDTO);
				System.out.println(
						"ī��� :" + sDTO.getCardName() + "\t" + "�Һ� ���� :" + sDTO.getMonthName() + "������ ���õǾ����ϴ�.");
				System.out.println("�������� " + sDTO.getInterest() + "% �Դϴ�.");
				cDAO.SavePaymentInfo(sDTO);
				break;

			case 4: // ��������
				cDAO.AllPrint();
				cDAO.FinalPrice(sDTO);
				cDAO.MonthPrice(sDTO);
				cDAO.SaveMonthPrice(sDTO);
				break;

			case 5: // ����
				System.out.println("���� �Ͻðڽ��ϱ�?");
				System.out.println("1.��  2.�ƴϿ�");
				System.out.print("���� > ");
				int num = scan.nextInt();

				if (num == 1) { // ����
					System.out.println("ID,PW�� 3~10�ڸ� �̳��� �Է��ϼ���.");
					System.out.print("������ ID :");
					sDTO.setId(scan.next());
					System.out.print("������ PW : ");
					sDTO.setPw(scan.next());
					
					if (sDTO.getId().length() >= 3 && sDTO.getId().length() <= 10) { //3~10�ڸ�
						if (cDAO.SaveIDPW(sDTO)) {
							System.out.println("���� �Ϸ�");
						} else {
							System.out.println("���� ����");
						}
					}else {
						System.out.println("���̵� �ʹ� ª���ϴ�.");
					}
				} else if (num == 2) { // ����
					cDAO.DeleteData();
				}
				break;

			case 6: // ��ȸ
				if (cDAO.IDCheck(sDTO)) {
					cDAO.IDPrint(sDTO);
				} else {
					System.out.println("��ϵ��� ���� ���̵� �Դϴ�.");
				}
				break;

			}

		}

	}

}
