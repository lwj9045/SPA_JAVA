package class073102;

import java.sql.*;

public class MemberDAO {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public void Connection() {
		con = DBConnection.makeConnection();
	}

	public int InsertMember(MemberDTO mDTO) {
		String sql = "INSERT INTO MEMBER VALUES(?,?,?,?,?)";
		int num = 0;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, mDTO.getMid());
			pstmt.setString(2, mDTO.getMpassword());
			pstmt.setString(3, mDTO.getMname());
			pstmt.setString(4, mDTO.getMphone());
			pstmt.setInt(5, mDTO.getMage());
			num = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return num;
	}

//	public void Login(MemberDTO mDTO) {
//		String sql = "SELECT * FROM MEMBER";
//		try {
//			pstmt = con.prepareStatement(sql);
//			rs = pstmt.executeQuery();
//			while (rs.next()) {
//				if (mDTO.getMid().equals(rs.getString("MID"))) {
//					if (mDTO.getMpassword().equals(rs.getString("MPASSWORD"))) {
//						System.out.println("로그인 성공 ");
//					} else {
//						System.out.println("아이디 또는 비밀번호가 틀립니다. ");
//					}
//				}
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}

	public boolean Login(MemberDTO mDTO) {
		String sql = "SELECT * FROM MEMBER WHERE MID = ? AND MPASSWORD = ?";
		boolean result = false;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, mDTO.getMid());
			pstmt.setString(2, mDTO.getMpassword());
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

	public void SelectAll() {
		String sql = "SELECT * FROM MEMBER";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.print(rs.getString("MID") + "\t");
				System.out.print(rs.getString("MPASSWORD") + "\t");
				System.out.print(rs.getString("MNAME") + "\t");
				System.out.print(rs.getString("MPHONE") + "\t");
				System.out.print(rs.getInt("MAGE"));
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public boolean IdCheck(MemberDTO mDTO) {
		String sql = "SELECT * FROM MEMBER WHERE MID = ?";
		boolean result = false;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, mDTO.getMid());
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

	public boolean ModifyPW(MemberDTO mDTO) {
		String sql = "UPDATE MEMBER SET MPASSWORD = ? WHERE MID = ?";
		boolean result = false;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, mDTO.getMpassword());
			pstmt.setString(2, mDTO.getMid());
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

	public boolean DeleteId(MemberDTO mDTO) {
		String sql = "DELETE FROM MEMBER WHERE MID = ?";
		boolean result = false;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, mDTO.getMid());
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
