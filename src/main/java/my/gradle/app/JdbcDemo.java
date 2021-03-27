package my.gradle.app;

import java.sql.*;

public class JdbcDemo {

	public static void main(String[] args) {
		System.out.println("Start");

		String className = "oracle.jdbc.driver.OracleDriver", url = "jdbc:oracle:thin:@localhost:1521:xe", user = "HR",
				password = "hr", sql = "SELECT * FROM departments";

		Connection con = null;
		Statement st;
		ResultSet rs;
		ResultSetMetaData rsmd;
		try {
			Class.forName(className);
			con = DriverManager.getConnection(url, user, password);
			st = con.createStatement();
			rs = st.executeQuery(sql);
			rsmd = rs.getMetaData();
			while (rs.next()) {
				for (int columnIndex = 1; columnIndex <= rsmd.getColumnCount(); columnIndex++) {
					System.out.print(rs.getString(columnIndex) + "\t");
				}
				System.out.println("\n");
			}
			con.close();
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("End");
		}
	}
}
