package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

import com.sun.org.apache.bcel.internal.generic.RETURN;

import model.Karta;

public class KartaDAO {

	public static Karta get(int id) {
		
		Connection conn = ConnectionManager.getConnection();
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		try {
			String query = "SELECT * FROM karta WHERE id = ?";
			
			pstmt = conn.prepareStatement(query);
			int index = 1;
			pstmt.setInt(index++, id);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				String polazniLet = rset.getString(index++);
				String dolazniLet = rset.getString(index++);
				String sedistePolazniLet = rset.getString(index++);
				String sedistePovratniLet= rset.getString(index++);
				Date datumRezervacije = rset.getDate(index++);
				Date datumProdaje = rset.getDate(index++);
				String korisnikId = rset.getString(index++);
				boolean obrisan = rset.getBoolean(index++);
				
				return new Karta(id, polazniLet, dolazniLet, sedistePolazniLet, sedistePovratniLet, datumRezervacije, datumProdaje, korisnikId, obrisan);
			}
		}catch (Exception e) {
		
		}
		return null;
	}
	
}
