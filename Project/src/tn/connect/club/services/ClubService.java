package tn.connect.club.services;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import tn.connect.club.entities.Club;
import tn.connect.commun.utils.DBConnection;

public class ClubService {

	private Connection cnx;
	private Statement st;
	private PreparedStatement pre;

	public ClubService() {
		cnx = DBConnection.getInstance().getCnx();
	}

	public void createClub(Club c) throws SQLException {

		try {
			String req = "INSERT INTO CLUB (name," + "	university," + "	institue," + "	status,"
					+ "description) values ('" + c.getName() + "','" + c.getUniversity() + "','" + c.getInstitue()
					+ "','" + c.getStatus() + "','" + c.getDescription() + "');";

			Statement ste = cnx.createStatement();
			ste.executeUpdate(req);

			System.out.println("Values Inserted");

		} catch (SQLException e) {
			System.out.println("Problem while Inserting in CLUB");
		}
	}

	public void updateClub(Club c) throws SQLException {

		try {
			String req = "UPDATE CLUB SET university =" + c.getUniversity() + "	,institue = " + c.getInstitue()
					+ "	,status = " + c.getStatus() + ",description =" + c.getDescription() + " WHERE id_club = "
					+ c.getIdClub() + ";";

			Statement ste = cnx.createStatement();
			ste.executeUpdate(req);

			System.out.println("Values Updated");

		} catch (SQLException e) {
			System.out.println("Problem while Updating CLUB");
		}
	}

	
	 public boolean deleteClub(Long idClub) throws SQLException{
	        
			String sql = "UPDATE CLUB SET status = 'HEXP' WHERE id_club = " + idClub;
	        
	        Statement ste = cnx.createStatement();
	                
	        if (ste.executeUpdate(sql) == 1) {
	            return true;
	        }
	        
	        return false ;
	    }

	public List<Club> ReadListClub() throws SQLException {
		List<Club> clubs = new ArrayList<>();

		try {
			String sql = "SELECT * FROM CLUB; ";
			Statement ste = cnx.createStatement();
			ResultSet rs = ste.executeQuery(sql);
			while (rs.next()) {

				Long idClub = rs.getLong("idClub");
				String name = rs.getString("name");
				String university = rs.getString("university");
				String institue = rs.getString("institue");
				String status = rs.getString("status");
				String description = rs.getString("description");

				Club club = new Club(idClub, name, university, institue, status, description);
				clubs.add(club);

			}
		} catch (SQLException e) {
			System.out.println("Problem while Selecting from CLUB");

		}

		return clubs;
	}

	public Club ReadClub(Long idClub) throws SQLException {
		Club club = new Club(idClub, null, null, null, null, null);
		try {
			String sql = "SELECT * FROM CLUB WHERE  WHERE id_club = " + idClub + ";";
			Statement ste = cnx.createStatement();
			ResultSet rs = ste.executeQuery(sql);
			club.setDescription(rs.getString("description"));
			club.setInstitue( rs.getString("institue"));
			club.setName(rs.getString("name"));
			club.setStatus(rs.getString("status"));
			club.setUniversity(rs.getString("university"));
		} catch (SQLException e) {
			System.out.println("Problem while Selecting from CLUB");

		}

		return club;
	}
}
