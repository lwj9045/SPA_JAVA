package class073101;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ICIADAO {
	Connection con = null; // ����
	PreparedStatement pstmt = null; // �޼��� ���� ���
	ResultSet rs = null; // ���̺� ��ȸ ��� ���� (select������ ���)

	public void DBConnection() { // DB����
		con = DBConnection.makeConnection();
	}

	public void SelectAll() {
		String sql = "SELECT * FROM ICIAMEMBER";

		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt("MNUMBER"));
				System.out.println(rs.getString("MNAME"));
				System.out.println(rs.getString("MADDRESS"));
				System.out.println(rs.getString("MPHONE"));
				System.out.println(rs.getDate("MBIRTH"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public boolean InsertData(ICIADTO iDTO) {
		String sql = "INSERT INTO ICIAMEMBER VALUES(SEQ_ICIA.NEXTVAL,?,?,?,?)";
		boolean result2 = false;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, iDTO.getMname());
			pstmt.setString(2, iDTO.getMaddress());
			pstmt.setString(3, iDTO.getMphone());
			pstmt.setNString(4, iDTO.getMbirth());

			int result = pstmt.executeUpdate();
			if (result == 1) {
				result2 = true;
			} else if (result == 0) {
				result2 = false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result2;
	}

	public boolean ModifyData(ICIADTO iDTO) {
		String sql = "UPDATE ICIAMEMBER SET MADDRESS = ? WHERE MNUMBER = ?";
		boolean result = false;

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, iDTO.getMaddress());
			pstmt.setInt(2, iDTO.getMnumber());

			int num = pstmt.executeUpdate();
			if (num == 1) {
				result = true;
			} else if (num == 0) {
				result = false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public boolean DeleteData(ICIADTO iDTO) {
		String sql = "DELETE FROM ICIAMEMBER WHERE MNUMBER = ?";
		boolean result = false;
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, iDTO.getMnumber());
			int num = pstmt.executeUpdate();
			
			if(num == 1) {
				result = true;
			}else if (num == 1) {
			result = false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
