package tn.connect.offer.services;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import tn.connect.commun.utils.DBConnection;
import tn.connect.offer.entities.Internships;

public class InternshipService {

    private Connection cnx;
    private Statement st;
    private PreparedStatement pre;

    public InternshipService() {
        cnx = DBConnection.getInstance().getCnx();

    }

    public void addInternship(Internships i) throws SQLException {
        String req = "INSERT INTO INTERNSHIP (company,field,title,description, start_date,end_date,supervisor,status) values ('"
                + i.getCompany() + "','"
                + i.getField() + "','"
                + i.getStatus() + "','"
                + i.getDescription() + "','"
                + i.getStartDate() + "','"
                + i.getEndDate() + "','"
                + i.getSupervisor() + "','"
                + i.getStatus() + "');";

        Statement ste = cnx.createStatement();
        ste.executeUpdate(req);

        System.out.println("Values Inserted");
    }

    public void deleteInternship(int id) {
        String sql = "UPDATE internship SET status = 'HEXP' WHERE id= " + id;

    }

    public List<Internships> retrieveInternships() throws SQLException {
        List<Internships> internships = new ArrayList<>();

        try {
            String sql = "SELECT * FROM INTERNSHIPS; ";
            Statement ste = cnx.createStatement();
            ResultSet rs = ste.executeQuery(sql);
            while (rs.next()) {

                int id = rs.getInt("id");
                String company = rs.getString("company");
                String field = rs.getString("field");
                String title = rs.getString("title");
                String description = rs.getString("description");
                Date startDate = rs.getDate("start_date");
                Date endDate = rs.getDate("endDate");
                String supervisor = rs.getString("supervisor");
                String status = rs.getString("status");

                Internships i = new Internships(id, company, field, title, 
                        description, startDate, endDate, supervisor, status);

                internships.add(i);

            }
        } catch (SQLException e) {
            System.out.println("Problem while Selecting from Internship");

        }

        return internships;
    }

}
