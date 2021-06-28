package tn.connect.offer.services;



import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import Entities.Stages.Internship;


public class InternshipService {

    private Connection cnx;
    private Statement st;
    private PreparedStatement pre;

    public InternshipService() {
        
    }

    public void addInternship(Internship i) throws SQLException {
        String req = "INSERT INTO INTERNSHIP (company,field,title,description, start_date,end_date,supervisor,status) values ('"
                + i.getCompany() + "','"
                + i.getField() + "','"
                + i.getTitle() + "','"
                + i.getDescription() + "','"
                + i.getStartDate() + "','"
                + i.getEndDate() + "','"
                + i.getSupervisor() + "','"
                + i.getStatus() + "');";
        		
        Statement ste = (Statement) DBConnection.getInstance().getConnection().createStatement();
        ste.executeUpdate(req);
        System.out.println("Valeurs Insérré");
    }

}
