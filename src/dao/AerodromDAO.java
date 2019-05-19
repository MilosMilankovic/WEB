package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.Aerodrom;

public class AerodromDAO {

	//public static AerodromDAO instance = new AerodromDAO();
	
	public static Aerodrom get(int id) {
		Connection conn = ConnectionManager.getConnection();
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		try {
			String query = "SELECT * FROM aerodrom WHERE id = ?";
			
			pstmt = conn.prepareStatement(query);
			int index = 1;
			pstmt.setInt(index++, id);
			System.out.println(pstmt);
			
			rset = pstmt.executeQuery();
			
			if (rset.next()) {
				index = 2;
				String naziv = rset.getString(index++);
				
				return new Aerodrom(naziv, id);
			}
		}catch (Exception e) {
			
		}
		return null;
	}
	
}
