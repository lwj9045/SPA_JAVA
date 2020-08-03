package class073001;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// DAO - DataBase Access Object
// �����ͺ��̽� ���� �� ������ ������ ���� Ŭ����
public class TestDAO {
	Connection con = null;
	// ������ ������ ���� ���Ǵ� Ŭ����
	PreparedStatement pstmt = null;
	// ������ ������ ��������� ���Ǵ� Ŭ����
	ResultSet rs = null;
	
	
	// DB������ ���� �޼ҵ�
	public void dbConnection() {
		// static �޼ҵ�� Ŭ���� �̸����� ���� ���� ����
		con = DBConnection.makeConnection();
	}
	
	// CUSTOMER ���̺� ��ü ��ȸ �޼ҵ�
	public void selectAll() {
		// ������ �������� �̸� ������  ����
		String sql = "SELECT * FROM CUSTOMER";
		
		try {
			// Connection Ŭ�������� �����ϴ�
			// prepareStatement �޼ҵ带 Ȱ���Ͽ�
			// ������ ������ �غ�
			pstmt = con.prepareStatement(sql);
			// ������ �����Ͽ� ���� ����� rs�� ����
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("CUSTID"));
				System.out.println(rs.getString("NAME"));
				System.out.println(rs.getString("ADDRESS"));
				System.out.println(rs.getString("PHONE"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
				
	}

	public void insertCustomer(CustomerDTO customerDTO) {
		String sql = "INSERT INTO CUSTOMER VALUES(SEQ_CUSTID.NEXTVAL,?,?,?)";
		try {
			pstmt = con.prepareStatement(sql);
//			pstmt.setInt(1, 10);
			pstmt.setString(1, customerDTO.getName());
			pstmt.setString(2, customerDTO.getAddress());
			pstmt.setString(3, customerDTO.getPhone());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}