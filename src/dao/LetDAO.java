package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

import model.Let;

public class LetDAO {

	
	public static Let get(int id) {
		Connection conn = ConnectionManager.getConnection(); 
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		try {
			String query = "SELECT * FROM let WHERE id = ?";
			
			pstmt = conn.prepareStatement(query);
			int index = 1;
			pstmt.setInt(index++, id);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				index = 2;
				String broj = rset.getString(index++);
				Date datumPolaska = rset.getDate(index++);
				Date datumDolaska = rset.getDate(index++);
				String polazniAerodrom = rset.getString(index++);
				String dolazniAerodrom = rset.getString(index++);
				Integer brojSedista = rset.getInt(index++);
				double cenaKarte = rset.getDouble(index++);
				boolean obrisan = rset.getBoolean(index++);
				
				return new Let(id, broj, datumPolaska, datumDolaska, polazniAerodrom, dolazniAerodrom, brojSedista, cenaKarte, obrisan);
			}
		}catch (Exception e) {
			
		}
		return null;
	}
}
