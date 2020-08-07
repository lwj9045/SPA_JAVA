package class0804_CarEstimate;

import java.sql.*;
import java.util.*;

public class CarEstimateDAO {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	Scanner scan = new Scanner(System.in);

	public void DBConnection() { // DB접속
		con = DBConnection.makeConnection();
	}

	public boolean DataCheck() { // 가상 데이터 초기화
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
	
	public void CarChoice(ChoiceDTO cDTO, SaveDTO sDTO) { // 1.차량선택
		String sql = null;

		System.out.println("1.현대  2.기아");
		System.out.print("선택 > ");
		cDTO.setCompanynumber(scan.nextInt());

		switch (cDTO.getCompanynumber()) {

		case 1: // 현대
			System.out.println("차를 선택하세요.");
			System.out.println("1.아반떼 2.소나타 3.그랜져 4.베뉴 5.투싼 6.산타페");
			System.out.print("선택 > ");
			cDTO.setCarNumber(scan.nextInt());
			System.out.println("엔진을 선택하세요.");
			System.out.println("1.가솔린 2.디젤");
			System.out.print("선택 > ");
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

		case 2: // 기아
			System.out.println("차를 선택하세요.");
			System.out.println("1.k3 2.k5 3.k7 4.셀토스 5.스포티지 6.소렌토");
			System.out.print("선택 > ");
			cDTO.setCarNumber(scan.nextInt());
			System.out.println("엔진을 선택하세요.");
			System.out.println("1.가솔린 2.디젤");
			System.out.print("선택 > ");
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

	public void SaveCarInfo(SaveDTO sDTO) { // 차량 선택사항 저장
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

	public int OptionChoice(ChoiceDTO cDTO, SaveDTO sDTO) { // 옵션 선택
		int num = 0;
		System.out.println("옵션을 선택하세요.");
		System.out.println("1.네비게이션 (80만원) 2.통풍시트(네비게이션 포함 130만원) 3.크루즈 컨트롤(네비게이션,통풍시트 포함 250만원) ");
		System.out.println("4.디자인 패키지(네비게이션,통풍시트,크루즈 컨트롤 포함 345만원) 5.선루프(네비게이션,통풍시트,크루즈 컨트롤,디자인패키지 포함 400 만원)");
		System.out.print("선택 > ");
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

	public int ColorChoice(ChoiceDTO cDTO, SaveDTO sDTO) { // 컬러 선택
		int num = 0;
		System.out.println("색상을 선택하세요.");
		System.out.println("1.BLACK(30만원) 2.WHITE(30만원) 3.GRAY 4.RED 5.BLUE");
		System.out.print("선택 > ");
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

	public int SumTotalPrice(int option, int color) { //차량가격 불러오기 및 옵션,색상 가격 합
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

	public void SaveDetailInfo(SaveDTO sDTO) { // 옵션,색상,옵션색상 추가된 금액 저장
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

	public void PaymentChoice(ChoiceDTO cDTO, SaveDTO sDTO) { // 결제 카드사,할부개월 선택

		System.out.println("결제 할 카드사를 선택하세요.");
		System.out.println("1.현대카드(36개월 무이자) 2.국민카드  3.신한카드");
		System.out.print("선택 > ");
		cDTO.setCardNumber(scan.nextInt());
		System.out.println("할부 개월 수를 선택하세요.");
		System.out.println("이자율은 12개월(1%), 24개월(2%), 36개월(3%), 48개월(4%), 60개월(5%) 입니다.");
		System.out.println("단, 현대카드에 경우 36개월 무이자 적용");
		System.out.println("1.12개월  2.24개월  3.36개월  4.48개월  5.60개월");
		System.out.print("선택 > ");
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

	public void SavePaymentInfo(SaveDTO sDTO) { // 결제 카드사,할부개월,이자율 저장
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

	public void AllPrint() { // 선택사항 전부 출력
		String sql = "SELECT * FROM MEMBER WHERE ID = 'ID'";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				System.out.println("선택사항 총 출력");
				System.out.println("브랜드 :" + rs.getString("COMPANYNAME") + " 차량 :" + rs.getString("CARNAME") + " 엔진 :"
						+ rs.getString("ENGINENAME"));
				System.out.println("옵션 :" + rs.getString("OPTIONNAME") + " 색상 :" + rs.getString("COLORNAME"));
				System.out.println("카드사 :" + rs.getString("CARDNAME") + " 할부 개월 수 :" + rs.getInt("MONTHNAME") + " 이자율 :"
						+ rs.getInt("INTEREST") + "% 입니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void FinalPrice(SaveDTO sDTO) { // 이자율까지 계산한 총 가격 출력
		String sql = "SELECT * FROM MEMBER WHERE ID = 'ID'";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				int final_price = rs.getInt("TOTALPRICE") + (rs.getInt("TOTALPRICE") * rs.getInt("INTEREST") / 100);
				System.out.println("이자율까지 계산한 최종 가격은 " + final_price + "원 입니다.");
				sDTO.setTotalPrice(final_price);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void MonthPrice(SaveDTO sDTO) { // 선수금 및 그에따른 월 납입금 출력
		System.out.println("선수금 금액을 입력하세요.");
		System.out.println("> ");
		sDTO.setPayment(scan.nextInt());

		String sql = "SELECT * FROM MEMBER WHERE ID = 'ID'";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				int monthprice = (rs.getInt("TOTALPRICE") - sDTO.getPayment()) / rs.getInt("MONTHNAME");
				sDTO.setMonthprice(monthprice);
				System.out.println("선수금 " + sDTO.getPayment() + "원 납입 시 월 납입 금액은 " + sDTO.getMonthprice() + "원 입니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void SaveMonthPrice(SaveDTO sDTO) { //선수금, 월 납입금 저장
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

	public boolean SaveIDPW(SaveDTO sDTO) { // ID,PW 저장
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

	public void DeleteData() { // 저장을 선택하지 않은 경우 견적 내용 삭제
		String sql = "DELETE FROM MEMBER WHERE ID = 'ID'";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public boolean IDCheck(SaveDTO sDTO) { // 아이디 유무 확인
		boolean result = false;
		System.out.print("조회 할 ID :");
		sDTO.setId(scan.next());
		System.out.print("조회 할 PW :");
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

	public void IDPrint(SaveDTO sDTO) { //선택사항 조회

		String sql = "SELECT * FROM MEMBER WHERE ID = ? AND PW = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, sDTO.getId());
			pstmt.setString(2, sDTO.getPw());
			rs = pstmt.executeQuery();
			while (rs.next()) {
			System.out.println("브랜드 :" + rs.getString("COMPANYNAME") + " 차량 :" + rs.getString("CARNAME") + " 엔진 :"
					+ rs.getString("ENGINENAME"));
			System.out.println("옵션 :" + rs.getString("OPTIONNAME") + " 색상 :" + rs.getString("COLORNAME"));
			System.out.println("카드사 :" + rs.getString("CARDNAME") + " 할부 개월 수 :" + rs.getInt("MONTHNAME") + " 이자율 :"
					+ rs.getInt("INTEREST") + "%");
			System.out.println("총 가격 :"+rs.getInt("TOTALPRICE")+"원"+" 선수금 :"+rs.getInt("PAYMENT")+"원"+" 월 납입금 :"+rs.getInt("MONTHPRICE")+"원 입니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}


}
