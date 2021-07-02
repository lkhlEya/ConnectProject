package tn.connect.services.offers;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import tn.connect.entities.offers.Work;
import tn.connect.utils.commun.DBConnection;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;

public class WorkService {

    private Connection cnx;
    private Statement st;
    private PreparedStatement pre;

    public WorkService() {
        cnx = DBConnection.getInstance().getCnx();

    }

    public void addWork(Work w) throws SQLException {
        String req = "INSERT INTO WORK (company,field,title,description, "
                + "start_date,agreementType,position,status) values ('"
                + w.getCompany() + "','"
                + w.getField() + "','"
                + w.getTitle() + "','"
                + w.getDescription() + "','"
                + w.getStartDate() + "','"
                + w.getAgreementType() + "','"
                + w.getPosition() + "','"
                + w.getStatus() + "');";

        Statement ste = cnx.createStatement();
        ste.executeUpdate(req);

        System.out.println("Values Inserted");
    }

    public void updateWork(Work w) {

    }

    public void deleteWork(int id) {
        String sql = "UPDATE work SET status = 'HEXP' WHERE id= " + id;

    }

    public List<Work> retrieveWorks() throws SQLException {
        List<Work> works = new ArrayList<>();

        try {
            String sql = "SELECT * FROM work; ";
            Statement ste = cnx.createStatement();
            ResultSet rs = ste.executeQuery(sql);
            while (rs.next()) {

                int id = rs.getInt("id");
                String company = rs.getString("company");
                String field = rs.getString("field");
                String title = rs.getString("title");
                String description = rs.getString("description");
                Date startDate = rs.getDate("start_date");
                String agreementType = rs.getString("agreementType");
                String position = rs.getString("position");
                String status = rs.getString("status");

                Work w = new Work(id, company, field, title, description, startDate, agreementType, position, status);

                works.add(w);

            }
        } catch (SQLException e) {
            System.out.println("Problem while Selecting from Work");

        }

        return works;
    }
}
