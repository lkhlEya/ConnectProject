package tn.connect.services.club;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import tn.connect.entities.club.Club;
import tn.connect.utils.commun.DBConnection;

public class ClubService {

	private Connection cnx;


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
			String req = "UPDATE CLUB SET university = ? ,institue = ? 	,status = ?,description = ? WHERE id_club = ? ;";
			
			PreparedStatement pre = cnx.prepareStatement(req);
			  
		        pre.setString(1, c.getUniversity());
		        pre.setString(2, c.getInstitue());
		        pre.setString(3, c.getStatus());
		        pre.setString(4, c.getDescription());
		        pre.setLong(5, c.getIdClub());
			
			  pre.executeUpdate();

			System.out.println("Values Updated");

		} catch (SQLException e) {
			System.out.println("Problem while Updating CLUB");
		}
	}
 
	
	 public boolean deleteClub(Long idClub) throws SQLException{
	        
			try {
				String req = "UPDATE CLUB SET status = 'HEXP' WHERE id_club = ? ;";
				
				PreparedStatement pre = cnx.prepareStatement(req);

		        pre.setLong(1, idClub);

				if (pre.executeUpdate() == 1) {
				    return true;
				}
			} catch (SQLException e) {
				System.out.println("Problem While Deleting from CLUB"+e.getMessage());
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

				Long idClub = rs.getLong("id_club");
				String name = rs.getString("name");
				String university = rs.getString("university");
				String institue = rs.getString("institue");
				String status = rs.getString("status");
				String description = rs.getString("description");

				Club club = new Club(idClub, name, university, institue, status, description);
				clubs.add(club);

			}
		} catch (SQLException e) {
			System.out.println("Problem while Selecting from CLUB"+e.getMessage());

		}

		return clubs;
	}

	public Club ReadClub(Long idClub) throws SQLException {
		Club club = new Club(idClub, null, null, null, null, null);
		try {
			String sql = "SELECT * FROM CLUB WHERE id_club = " + idClub + ";";
			Statement ste = cnx.createStatement();
			ResultSet rs = ste.executeQuery(sql);
			if (rs.first())
			{
				club.setDescription(rs.getString("description"));
				club.setInstitue( rs.getString("institue"));
				club.setName(rs.getString("name"));
				club.setStatus(rs.getString("status"));
				club.setUniversity(rs.getString("university"));
			}

		} catch (SQLException e) {
			System.out.println("Problem while Selecting from CLUB");

		}

		return club;
	}
}
