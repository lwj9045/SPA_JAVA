package class080301;

import java.sql.*;

public class BoardDAO {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public void DBConnection() { // 0.DB����
		con = Board_DBCon.makeConnection();
	}

	public boolean Write(BoardDTO bDTO) { // 1.�� �ۼ�
		String sql = "INSERT INTO BOARD VALUES(SEQ_BNUMBER.NEXTVAL,?,?,?,TO_DATE(SYSDATE,'YY-MM-DD'),?)";
		boolean result = false;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bDTO.getBtitle());
			pstmt.setString(2, bDTO.getBwriter());
			pstmt.setString(3, bDTO.getBcontents());
			pstmt.setInt(4, bDTO.getBhits());
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

	public void PrintAll() { // 2.�� ��ü ��ȸ
		String sql = "SELECT * FROM BOARD";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.print("�� ��ȣ : " + rs.getInt("BNUMBER") + "		");
				System.out.print("���� : " + rs.getString("BTITLE") + "\t");
				System.out.print("�ۼ��� : " + rs.getString("BWRITER") + "\t");
				System.out.print("���� : " + rs.getString("BCONTENTS") + "\t");
				System.out.print("�ۼ���¥ : " + rs.getDate("BDATE") + "\t");
				System.out.print("��ȸ �� : " + rs.getInt("BHITS") + "\t");
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void FindBnumber(BoardDTO bDTO) { // 3.�󼼺���
		String sql = "UPDATE BOARD SET BHITS = BHITS+1 WHERE BNUMBER = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bDTO.getBnumber());
			pstmt.executeUpdate();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		sql = "SELECT * FROM BOARD WHERE BNUMBER = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bDTO.getBnumber());
			rs = pstmt.executeQuery();
			while(rs.next()) {
			System.out.print("�� ��ȣ : " + rs.getInt("BNUMBER")+"		");
			System.out.print("���� : " + rs.getString("BTITLE") + "\t");
			System.out.print("�ۼ��� : " + rs.getString("BWRITER") + "\t");
			System.out.print("���� : " + rs.getString("BCONTENTS") + "\t");
			System.out.print("�ۼ���¥ : "  + rs.getDate("BDATE") + "\t");
			System.out.print("��ȸ �� : " + rs.getInt("BHITS") + "\t");
			System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void OrderByBhits() { // 4. �α�� ���� ����
		String sql = "SELECT * FROM BOARD ORDER BY BHITS DESC";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.print("�� ��ȣ : " + rs.getInt("BNUMBER")+"		");
				System.out.print("���� : " + rs.getString("BTITLE") + "\t");
				System.out.print("�ۼ��� : " + rs.getString("BWRITER") + "\t");
				System.out.print("���� : " + rs.getString("BCONTENTS") + "\t");
				System.out.print("�ۼ���¥ : " + rs.getDate("BDATE") + "\t");
				System.out.print("��ȸ �� : " + rs.getInt("BHITS") + "\t");
				System.out.println();
				}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public boolean Modify(BoardDTO bDTO) { // 5.�� ���� ����
		String sql = "UPDATE BOARD SET BCONTENTS = ? WHERE BNUMBER = ?";
		boolean result = false;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bDTO.getBcontents());
			pstmt.setInt(2, bDTO.getBnumber());
			int num = pstmt.executeUpdate();
			if(num == 1) {
				result = true;
			}else {
				result = false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public boolean Delete(BoardDTO bDTO) {
		String sql = "DELETE FROM BOARD WHERE BNUMBER = ?";
		boolean result = false;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bDTO.getBnumber());
			int num = pstmt.executeUpdate();
			if(num == 1) {
				result = true;
			}else {
				result = false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

}
