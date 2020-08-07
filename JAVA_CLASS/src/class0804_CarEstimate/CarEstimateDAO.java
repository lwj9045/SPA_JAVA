package class0804_CarEstimate;

import java.sql.*;
import java.util.*;

public class CarEstimateDAO {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	Scanner scan = new Scanner(System.in);

	public void DBConnection() { // DB����
		con = DBConnection.makeConnection();
	}

	public boolean DataCheck() { // ���� ������ �ʱ�ȭ
		boolean result = false;
		String sql = "SELECT * FROM MEMBER WHERE ID = 'ID'";
		
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				result = true;
			}else {
				result = false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public void CarChoice(ChoiceDTO cDTO, SaveDTO sDTO) { // 1.��������
		String sql = null;

		System.out.println("1.����  2.���");
		System.out.print("���� > ");
		cDTO.setCompanynumber(scan.nextInt());

		switch (cDTO.getCompanynumber()) {

		case 1: // ����
			System.out.println("���� �����ϼ���.");
			System.out.println("1.�ƹݶ� 2.�ҳ�Ÿ 3.�׷��� 4.���� 5.���� 6.��Ÿ��");
			System.out.print("���� > ");
			cDTO.setCarNumber(scan.nextInt());
			System.out.println("������ �����ϼ���.");
			System.out.println("1.���ָ� 2.����");
			System.out.print("���� > ");
			cDTO.setCarTypeNumber(scan.nextInt());

			sql = "SELECT * FROM CAR WHERE COMPANYNUMBER = ? AND CARNUMBER = ? AND ENGINENUMBER = ?";
			try {
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, cDTO.getCompanynumber());
				pstmt.setInt(2, cDTO.getCarNumber());
				pstmt.setInt(3, cDTO.getCarTypeNumber());
				rs = pstmt.executeQuery();
				
				if (rs.next()) {
					sDTO.setCompanyname(rs.getString("COMPANYNAME"));
					sDTO.setCarName(rs.getString("CARNAME"));
					sDTO.setCarTypeName(rs.getString("ENGINENAME"));
					sDTO.setTotalPrice(rs.getInt("CARPRICE"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;

		case 2: // ���
			System.out.println("���� �����ϼ���.");
			System.out.println("1.k3 2.k5 3.k7 4.���佺 5.����Ƽ�� 6.�ҷ���");
			System.out.print("���� > ");
			cDTO.setCarNumber(scan.nextInt());
			System.out.println("������ �����ϼ���.");
			System.out.println("1.���ָ� 2.����");
			System.out.print("���� > ");
			cDTO.setCarTypeNumber(scan.nextInt());

			sql = "SELECT * FROM CAR WHERE COMPANYNUMBER = ? AND CARNUMBER = ? AND ENGINENUMBER = ?";
			try {
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, cDTO.getCompanynumber());
				pstmt.setInt(2, cDTO.getCarNumber());
				pstmt.setInt(3, cDTO.getCarTypeNumber());
				rs = pstmt.executeQuery();

				if (rs.next()) {
					sDTO.setCompanyname(rs.getString("COMPANYNAME"));
					sDTO.setCarName(rs.getString("CARNAME"));
					sDTO.setCarTypeName(rs.getString("ENGINENAME"));
					sDTO.setTotalPrice(rs.getInt("CARPRICE"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		}
	}

	public void SaveCarInfo(SaveDTO sDTO) { // ���� ���û��� ����
		String sql = "INSERT INTO MEMBER(MEMBERNUMBER,COMPANYNAME,CARNAME,ENGINENAME,TOTALPRICE,ID) VALUES(SEQ_MEMBERNUMBER.NEXTVAL,?,?,?,?,'ID')";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, sDTO.getCompanyname());
			pstmt.setString(2, sDTO.getCarName());
			pstmt.setString(3, sDTO.getCarTypeName());
			pstmt.setInt(4, sDTO.getTotalPrice());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public int OptionChoice(ChoiceDTO cDTO, SaveDTO sDTO) { // �ɼ� ����
		int num = 0;
		System.out.println("�ɼ��� �����ϼ���.");
		System.out.println("1.�׺���̼� (80����) 2.��ǳ��Ʈ(�׺���̼� ���� 130����) 3.ũ���� ��Ʈ��(�׺���̼�,��ǳ��Ʈ ���� 250����) ");
		System.out.println("4.������ ��Ű��(�׺���̼�,��ǳ��Ʈ,ũ���� ��Ʈ�� ���� 345����) 5.������(�׺���̼�,��ǳ��Ʈ,ũ���� ��Ʈ��,��������Ű�� ���� 400 ����)");
		System.out.print("���� > ");
		cDTO.setOptionNumber(scan.nextInt());

		String sql = "SELECT OPTIONNAME,OPTIONPRICE FROM DETAIL WHERE OPTIONNUMBER = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, cDTO.getOptionNumber());
			rs = pstmt.executeQuery();

			if (rs.next()) {
				sDTO.setOptionName(rs.getString("OPTIONNAME"));
				num = rs.getInt("OPTIONPRICE");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return num;
	}

	public int ColorChoice(ChoiceDTO cDTO, SaveDTO sDTO) { // �÷� ����
		int num = 0;
		System.out.println("������ �����ϼ���.");
		System.out.println("1.BLACK(30����) 2.WHITE(30����) 3.GRAY 4.RED 5.BLUE");
		System.out.print("���� > ");
		cDTO.setColorNumber(scan.nextInt());

		String sql = "SELECT COLORNAME,COLORPRICE FROM DETAIL WHERE COLORNUMBER = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, cDTO.getColorNumber());
			rs = pstmt.executeQuery();
			if (rs.next()) {
				sDTO.setColorName(rs.getString("COLORNAME"));
				num = rs.getInt("COLORPRICE");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return num;
	}

	public int SumTotalPrice(int option, int color) { //�������� �ҷ����� �� �ɼ�,���� ���� ��
		String sql = "SELECT TOTALPRICE FROM MEMBER WHERE ID = 'ID'";
		int num = 0;
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				num = rs.getInt("TOTALPRICE") + option + color;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return num;
	}

	public void SaveDetailInfo(SaveDTO sDTO) { // �ɼ�,����,�ɼǻ��� �߰��� �ݾ� ����
		String sql = "UPDATE MEMBER SET OPTIONNAME = ?, COLORNAME = ?, TOTALPRICE = ? WHERE ID = 'ID'";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, sDTO.getOptionName());
			pstmt.setString(2, sDTO.getColorName());
			pstmt.setInt(3, sDTO.getTotalPrice());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void PaymentChoice(ChoiceDTO cDTO, SaveDTO sDTO) { // ���� ī���,�Һΰ��� ����

		System.out.println("���� �� ī��縦 �����ϼ���.");
		System.out.println("1.����ī��(36���� ������) 2.����ī��  3.����ī��");
		System.out.print("���� > ");
		cDTO.setCardNumber(scan.nextInt());
		System.out.println("�Һ� ���� ���� �����ϼ���.");
		System.out.println("�������� 12����(1%), 24����(2%), 36����(3%), 48����(4%), 60����(5%) �Դϴ�.");
		System.out.println("��, ����ī�忡 ��� 36���� ������ ����");
		System.out.println("1.12����  2.24����  3.36����  4.48����  5.60����");
		System.out.print("���� > ");
		cDTO.setMonthNumber(scan.nextInt());

		String sql = "SELECT CARDNAME,MONTHNAME,INTEREST FROM CARD WHERE CARDNUMBER = ? AND MONTHNUMBER = ?";

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, cDTO.getCardNumber());
			pstmt.setInt(2, cDTO.getMonthNumber());
			rs = pstmt.executeQuery();
			if (rs.next()) {
				sDTO.setCardName(rs.getString("CARDNAME"));
				sDTO.setMonthName(rs.getInt("MONTHNAME"));
				sDTO.setInterest(rs.getInt("INTEREST"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void SavePaymentInfo(SaveDTO sDTO) { // ���� ī���,�Һΰ���,������ ����
		String sql = "UPDATE MEMBER SET CARDNAME = ?, MONTHNAME = ?, INTEREST = ? WHERE ID = 'ID'";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, sDTO.getCardName());
			pstmt.setInt(2, sDTO.getMonthName());
			pstmt.setInt(3, sDTO.getInterest());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void AllPrint() { // ���û��� ���� ���
		String sql = "SELECT * FROM MEMBER WHERE ID = 'ID'";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				System.out.println("���û��� �� ���");
				System.out.println("�귣�� :" + rs.getString("COMPANYNAME") + " ���� :" + rs.getString("CARNAME") + " ���� :"
						+ rs.getString("ENGINENAME"));
				System.out.println("�ɼ� :" + rs.getString("OPTIONNAME") + " ���� :" + rs.getString("COLORNAME"));
				System.out.println("ī��� :" + rs.getString("CARDNAME") + " �Һ� ���� �� :" + rs.getInt("MONTHNAME") + " ������ :"
						+ rs.getInt("INTEREST") + "% �Դϴ�.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void FinalPrice(SaveDTO sDTO) { // ���������� ����� �� ���� ���
		String sql = "SELECT * FROM MEMBER WHERE ID = 'ID'";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				int final_price = rs.getInt("TOTALPRICE") + (rs.getInt("TOTALPRICE") * rs.getInt("INTEREST") / 100);
				System.out.println("���������� ����� ���� ������ " + final_price + "�� �Դϴ�.");
				sDTO.setTotalPrice(final_price);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void MonthPrice(SaveDTO sDTO) { // ������ �� �׿����� �� ���Ա� ���
		System.out.println("������ �ݾ��� �Է��ϼ���.");
		System.out.println("> ");
		sDTO.setPayment(scan.nextInt());

		String sql = "SELECT * FROM MEMBER WHERE ID = 'ID'";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				int monthprice = (rs.getInt("TOTALPRICE") - sDTO.getPayment()) / rs.getInt("MONTHNAME");
				sDTO.setMonthprice(monthprice);
				System.out.println("������ " + sDTO.getPayment() + "�� ���� �� �� ���� �ݾ��� " + sDTO.getMonthprice() + "�� �Դϴ�.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void SaveMonthPrice(SaveDTO sDTO) { //������, �� ���Ա� ����
		String sql = "UPDATE MEMBER SET PAYMENT = ?, MONTHPRICE = ? WHERE ID = 'ID'";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, sDTO.getPayment());
			pstmt.setInt(2, sDTO.getMonthprice());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public boolean SaveIDPW(SaveDTO sDTO) { // ID,PW ����
		boolean result = false;
		String sql = "UPDATE MEMBER SET ID = ?, PW = ? WHERE ID = 'ID'";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, sDTO.getId());
			pstmt.setString(2, sDTO.getPw());
			int num = pstmt.executeUpdate();
			if (num == 1) {
				result = true;
			} else {
				result = false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public void DeleteData() { // ������ �������� ���� ��� ���� ���� ����
		String sql = "DELETE FROM MEMBER WHERE ID = 'ID'";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public boolean IDCheck(SaveDTO sDTO) { // ���̵� ���� Ȯ��
		boolean result = false;
		System.out.print("��ȸ �� ID :");
		sDTO.setId(scan.next());
		System.out.print("��ȸ �� PW :");
		sDTO.setPw(scan.next());

		String sql = "SELECT * FROM MEMBER WHERE ID = ? AND PW = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, sDTO.getId());
			pstmt.setString(2, sDTO.getPw());
			rs = pstmt.executeQuery();
			if (rs.next()) {
				result = true;
			} else {
				result = false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public void IDPrint(SaveDTO sDTO) { //���û��� ��ȸ

		String sql = "SELECT * FROM MEMBER WHERE ID = ? AND PW = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, sDTO.getId());
			pstmt.setString(2, sDTO.getPw());
			rs = pstmt.executeQuery();
			while (rs.next()) {
			System.out.println("�귣�� :" + rs.getString("COMPANYNAME") + " ���� :" + rs.getString("CARNAME") + " ���� :"
					+ rs.getString("ENGINENAME"));
			System.out.println("�ɼ� :" + rs.getString("OPTIONNAME") + " ���� :" + rs.getString("COLORNAME"));
			System.out.println("ī��� :" + rs.getString("CARDNAME") + " �Һ� ���� �� :" + rs.getInt("MONTHNAME") + " ������ :"
					+ rs.getInt("INTEREST") + "%");
			System.out.println("�� ���� :"+rs.getInt("TOTALPRICE")+"��"+" ������ :"+rs.getInt("PAYMENT")+"��"+" �� ���Ա� :"+rs.getInt("MONTHPRICE")+"�� �Դϴ�.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}


}
