package tn.connect.gui.commun;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import tn.connect.entities.commun.Codif;
import tn.connect.utils.commun.DBConnection;

public class CodifService {

	private Connection cnx;
	private Statement st;
	private PreparedStatement pre;
	
	public CodifService() {
		cnx = DBConnection.getInstance().getCnx();
	}
	
	public void createCodif(Codif c) throws SQLException {

		try {
			String req = "INSERT INTO Codif (External_code," + "	Internal_code," + "	Text," + "	Label,"
					+ "status) values ('" + c.getExternal_code() + "','" + c.getInternal_code() + "','" + c.getText()
					+ "','" + c.getLabel() + "','" + c.getStaus() + "');";

			Statement ste = cnx.createStatement();
			ste.executeUpdate(req);

			System.out.println("Values Inserted");

		} catch (SQLException e) {
			System.out.println("Problem while Inserting in Codif");
		}
	}

	public void updateCodif(Codif c) throws SQLException {

		try {
			String req = "UPDATE Codif SET External_code =" + c.getExternal_code() + "	,Internal_code = " + c.getInternal_code()
					+ "	,Text = " + c.getText() + ",Label =" + c.getLabel() + " WHERE id_Codif = "
					+ c.getIdCodif() + ";";

			
			Statement ste = cnx.createStatement();
			ste.executeUpdate(req);

			System.out.println("Values Updated");

		} catch (SQLException e) {
			System.out.println("Problem while Updating Codif");
		}
	}

	
	 public boolean deleteCodif(Long idCodif) throws SQLException{
	        
			String sql = "UPDATE Codif SET status = 'HEXP' WHERE id_Codif = " + idCodif;
	        
	        Statement ste = cnx.createStatement();
	                
	        if (ste.executeUpdate(sql) == 1) {
	            return true;
	        }
	        
	        return false ;
	    }

	public List<Codif> ReadListCodif() throws SQLException {
		List<Codif> Codifs = new ArrayList<>();

		try {
			String sql = "SELECT * FROM Codif; ";
			Statement ste = cnx.createStatement();
			ResultSet rs = ste.executeQuery(sql);
			while (rs.next()) {


				
				Long idCodif = rs.getLong("idCodif");
				String external_code = rs.getString("External_code");
				String internal_code = rs.getString("Internal_code");
				String label = rs.getString("Label");
				String status = rs.getString("status");
				String text = rs.getString("Text");
				String type = rs.getString("Type");

				Codif Codif = new Codif(idCodif, external_code, internal_code, label, status, text);
				Codifs.add(Codif);

			}
		} catch (SQLException e) {
			System.out.println("Problem while Selecting from Codif");

		}

		return Codifs;
	}

	public Codif ReadCodif(Long idCodif) throws SQLException {
		Codif Codif = new Codif(idCodif, null, null, null, null, null);
		try {
			String sql = "SELECT * FROM Codif WHERE  WHERE id_Codif = " + idCodif + ";";
			Statement ste = cnx.createStatement();
			ResultSet rs = ste.executeQuery(sql);
			Codif.setExternal_code(rs.getString("External_code"));
			Codif.setInternal_code( rs.getString("Internal_code"));
			Codif.setLabel(rs.getString("Label"));
			Codif.setStaus(rs.getString("status"));
			Codif.setText(rs.getString("Text"));
			Codif.setType(rs.getString("Type"));
		} catch (SQLException e) {
			System.out.println("Problem while Selecting from Codif");

		}

		return Codif;
	}
}
