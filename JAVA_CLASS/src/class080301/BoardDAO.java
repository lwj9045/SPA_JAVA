package class080301;

import java.sql.*;

public class BoardDAO {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public void DBConnection() { // 0.DB접속
		con = Board_DBCon.makeConnection();
	}

	public boolean Write(BoardDTO bDTO) { // 1.글 작성
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

	public void PrintAll() { // 2.글 전체 조회
		String sql = "SELECT * FROM BOARD";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.print("글 번호 : " + rs.getInt("BNUMBER") + "		");
				System.out.print("제목 : " + rs.getString("BTITLE") + "\t");
				System.out.print("작성자 : " + rs.getString("BWRITER") + "\t");
				System.out.print("내용 : " + rs.getString("BCONTENTS") + "\t");
				System.out.print("작성날짜 : " + rs.getDate("BDATE") + "\t");
				System.out.print("조회 수 : " + rs.getInt("BHITS") + "\t");
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void FindBnumber(BoardDTO bDTO) { // 3.상세보기
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
			System.out.print("글 번호 : " + rs.getInt("BNUMBER")+"		");
			System.out.print("제목 : " + rs.getString("BTITLE") + "\t");
			System.out.print("작성자 : " + rs.getString("BWRITER") + "\t");
			System.out.print("내용 : " + rs.getString("BCONTENTS") + "\t");
			System.out.print("작성날짜 : "  + rs.getDate("BDATE") + "\t");
			System.out.print("조회 수 : " + rs.getInt("BHITS") + "\t");
			System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void OrderByBhits() { // 4. 인기글 위로 정렬
		String sql = "SELECT * FROM BOARD ORDER BY BHITS DESC";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.print("글 번호 : " + rs.getInt("BNUMBER")+"		");
				System.out.print("제목 : " + rs.getString("BTITLE") + "\t");
				System.out.print("작성자 : " + rs.getString("BWRITER") + "\t");
				System.out.print("내용 : " + rs.getString("BCONTENTS") + "\t");
				System.out.print("작성날짜 : " + rs.getDate("BDATE") + "\t");
				System.out.print("조회 수 : " + rs.getInt("BHITS") + "\t");
				System.out.println();
				}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public boolean Modify(BoardDTO bDTO) { // 5.글 내용 수정
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
