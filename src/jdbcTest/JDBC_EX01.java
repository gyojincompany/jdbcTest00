package jdbcTest;

import java.sql.*;

public class JDBC_EX01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.jdbc.Driver");//mysql jdbc ����̹� ȣ��
			Connection conn = 
					DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root","12345");
			System.out.println("DB ���� �Ϸ�!!!");			
			
		} catch(ClassNotFoundException e) {
			System.out.println("JDBC ����̹� �ε� ����!!!");
		} catch(SQLException e) {
			System.out.println("DB ���� ����!!!");
		}
		
		
	}

}
