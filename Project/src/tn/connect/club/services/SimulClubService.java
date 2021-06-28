package tn.connect.club.services;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import tn.connect.club.entities.Club;
import tn.connect.club.entities.SimulClub;
import tn.connect.commun.utils.DBConnection;

public class SimulClubService {
	
	private Connection cnx;
	private Statement st;
	private PreparedStatement pre;
	
	 public SimulClubService() {
			cnx = DBConnection.getInstance().getCnx();
	   };

	public void createClub(Club c) throws SQLException {

		try {
			String req = "INSERT INTO SIMULCLUB (name," + "	university," + "	institue," + "	status,"
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
			String req = "UPDATE SIMULCLUB SET university =" + c.getUniversity() + "	,institue = " + c.getInstitue()
					+ "	,status = " + c.getStatus() + ",description =" + c.getDescription() + " WHERE id_club = "
					+ c.getStatus() + ";";

			Statement ste = cnx.createStatement();
			ste.executeUpdate(req);

			System.out.println("Values Updated");

		} catch (SQLException e) {
			System.out.println("Problem while Updating CLUB");
		}
	}

	public void deleteClub(int idSimulClub) {
		String sql = "UPDATE CLUB SET status = 'HEXP' WHERE id_club = " + idSimulClub;

	}

	public List<Club> ReadListClub() throws SQLException {
		List<Club> clubs = new ArrayList<>();

		try {
			String sql = "SELECT * FROM SIMULCLUB; ";
			Statement ste = cnx.createStatement();
			ResultSet rs = ste.executeQuery(sql);
			while (rs.next()) {

				Long idSimulClub = rs.getLong("idSimulClub");
				String name = rs.getString("name");
				String university = rs.getString("university");
				String institue = rs.getString("institue");
				String status = rs.getString("status");
				String description = rs.getString("description");

				Club club = new Club(idSimulClub, name, university, institue, status, description);
				clubs.add(club);

			}
		} catch (SQLException e) {
			System.out.println("Problem while Selecting from CLUB");

		}

		return clubs;
	}

	public SimulClub ReadClub(Long idSimulClub) throws SQLException {
		SimulClub simulClub = new SimulClub(idSimulClub, null, null, null, null, null, null);
		try {
			String sql = "SELECT * FROM CLUB WHERE  WHERE id_club = " + idSimulClub + ";";
			Statement ste = cnx.createStatement();
			ResultSet rs = ste.executeQuery(sql);

			simulClub.setCreationDate(rs.getDate("creation_date"));
			simulClub.setDescription(rs.getString("description"));
			simulClub.setInstitue( rs.getString("institue"));
			simulClub.setName(rs.getString("name"));
			simulClub.setStatus(rs.getString("status"));
			simulClub.setUniversity(rs.getString("university"));
			

		} catch (SQLException e) {
			System.out.println("Problem while Selecting from CLUB");

		}

		return simulClub;
	}

}
