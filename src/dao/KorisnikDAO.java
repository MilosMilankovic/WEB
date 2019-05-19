package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

import model.Korisnik;

public class KorisnikDAO {

	
	public static Korisnik get(String korisnickoIme) {
		Connection conn = ConnectionManager.getConnection();
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		try {
			String query = "SELECT * FROM korisnik WHERE korisnickoIme = ?";
			
			pstmt = conn.prepareStatement(query);
			int index = 1;
			pstmt.setString(index++, korisnickoIme);
			System.out.println(pstmt);
			
			rset = pstmt.executeQuery();
			
			if (rset.next()) {
				index = 2;
				String id = rset.getString(index++);
				String korIme = rset.getString(index++);
				String lozinka = rset.getString(index++);
				Date datumRegistracije = rset.getDate(index++);
				boolean uloga = rset.getBoolean(index++);
				boolean blokiran = rset.getBoolean(index++);
				String ime = rset.getString(index++);
				String prezime = rset.getString(index++);
				
				return new Korisnik(id, korIme, lozinka, datumRegistracije, uloga, blokiran, ime, prezime);
					}
		}catch (Exception e) {
			
		}
		return null;
			}
		
		}
	

