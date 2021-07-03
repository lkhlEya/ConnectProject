package tn.connect.services.club;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import tn.connect.entities.club.Club;
import tn.connect.entities.club.SimulClub;
import tn.connect.utils.commun.DBConnection;

public class SimulClubService {

	private Connection cnx;
	private Statement st;
	private PreparedStatement pre;

	public SimulClubService() {
		cnx = DBConnection.getInstance().getCnx();
	};

	public void createSimulClub(SimulClub c) throws SQLException {

		try {
			String req = "INSERT INTO SIMULCLUB (name," + "	university," + "	institue," + "	status,"
					+ "description) values ('" + c.getName() + "','" + c.getUniversity() + "','" + c.getInstitue()
					+ "','" + c.getStatus() + "','" + c.getDescription() + ",creation_date = to_char("
					+ c.getCreationDate() + ",'j')');";

			Statement ste = cnx.createStatement();
			ste.executeUpdate(req);

			System.out.println("Values Inserted");

		} catch (SQLException e) {
			System.out.println("Problem while Inserting in CLUB");
		}
	}

	public void updateClub(Club c) throws SQLException {

		try {
			String req = "UPDATE SIMULCLUB SET university = ? institue = ? , status = ? ,description = ? WHERE id_simulclub  = ?";

			  PreparedStatement pre = cnx.prepareStatement(req);
			  
		        pre.setString(1, c.getUniversity());
		        pre.setString(2, c.getInstitue());
		        pre.setString(3, c.getStatus());
		        pre.setString(4, c.getDescription());
		        pre.setLong(5, c.getIdClub());
		        
			  pre.executeUpdate();

			System.out.println("Values Updated");

		} catch (SQLException e) {
			System.out.println("Problem while Updating CLUB" + e.getMessage());
		}
	}

	public boolean deleteClub(int idSimulClub) {
		try {
			String req = "UPDATE SIMULCLUB SET status = 'HEXP' WHERE id_simulclub  = ? ;";
			
			PreparedStatement pre = cnx.prepareStatement(req);

	        pre.setLong(1, idSimulClub);

			if (pre.executeUpdate() == 1) {
			    return true;
			}
		} catch (SQLException e) {
			System.out.println("Problem While Deleting from Simulclub "+e.getMessage());
		}
        return false;

	}

	public List<Club> ReadListClub() throws SQLException {
		List<Club> clubs = new ArrayList<>();

		try {
			String sql = "SELECT * FROM SIMULCLUB; ";
			Statement ste = cnx.createStatement();
			ResultSet rs = ste.executeQuery(sql);
			while (rs.next()) {

				Long idSimulClub = rs.getLong("id_simulclub");
				String name = rs.getString("name");
				String university = rs.getString("university");
				String institue = rs.getString("institue");
				String status = rs.getString("status");
				String description = rs.getString("description");

				Club club = new Club(idSimulClub, name, university, institue, status, description);
				clubs.add(club);

			}
		} catch (SQLException e) {
			System.out.println("Problem while Selecting from CLUB" + e.getMessage());

		}

		return clubs;
	}

	public SimulClub ReadClub(Long idSimulClub) throws SQLException {
		SimulClub simulClub = new SimulClub(idSimulClub, null, null, null, null, null, null);
		try {
			String sql = "SELECT * FROM CLUB WHERE  WHERE id_simulclub  = " + idSimulClub + ";";
			Statement ste = cnx.createStatement();
			ResultSet rs = ste.executeQuery(sql);

			simulClub.setCreationDate(rs.getDate("creation_date"));
			simulClub.setDescription(rs.getString("description"));
			simulClub.setInstitue(rs.getString("institue"));
			simulClub.setName(rs.getString("name"));
			simulClub.setStatus(rs.getString("status"));
			simulClub.setUniversity(rs.getString("university"));

		} catch (SQLException e) {
			System.out.println("Problem while Selecting from CLUB");

		}

		return simulClub;
	}

}
