package tn.connect.offer.services;

public class InternshipService {
    private Connection cnx;
    private Statement st;
    private PreparedStatement pre;

    public ServiceStage() {
        cnx DBConnection.getInstance().getCnx();
        
    }
    public void addInternship (Internships s)throws SQLException{
        String req = "INSERT INTO INTERNSHIP (company,field,title,description, start_date,end_date,supervisor,status) values ('"
        		+s.getCompany()+"','"
        		+s.getField()+"','"
        		+s.getTitle()+"','"
        		+s.getDescription+"','"
        		+s.getStartDate+"','"
        		+s.getEndDate+"','"
        		+s.getSupervisor+"','"
        		+s.getStatus+"');"
        		
            Statement ste = cnx.createStatement();
         ste.executeUpdate(req);
         System.out.println("Valeurs Insérré");
        }
    public List<Stages> displayStages(){
        String req= "SELECT * FROM STAGES";
        return Stages;
        
    }
}
