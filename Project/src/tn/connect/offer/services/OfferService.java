package tn.connect.offer.services;

public class OfferService {
    private Connection cnx;
    private Statement st;
    private PreparedStatement pre;

    public ServiceStage() {
        cnx DBConnection.getInstance().getCnx();
        
    }
    public void (Stages s)throws SQLException{
        String req = "INSERT INTO INTERNSHIP (company,field,title,description, start_date,end_date,supervisor,status) values ('"
        		+s.getCompany()+"','"
        		+s.getField()+"','"
        		+s.getTitle()+"','"
        		+s.getDescription+"','"
        		+s.getStartDate
            Statement ste = cnx.createStatement();
         ste.executeUpdate(req);
         System.out.println("Valeurs Ins�rr�");
        }
    public List<Internships> displayInternships(){
        String req= "SELECT * FROM STAGES;";
        return Stages;
        
    }
	
}
