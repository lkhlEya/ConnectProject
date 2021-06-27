package tn.connect.offer.services;

public class OfferService {
    private Connection cnx;
    private Statement st;
    private PreparedStatement pre;

    public ServiceStage() {
        cnx DBConnection.getInstance().getCnx();
        
    }
    public void addStage(Stages s)throws SQLException{
        String req = "INSERT INTO STAGES (company,"
                + "startDate"
                + ",endDate"
                + ",theme,"
                + "title,"
                + "description"
                + ",candidat)values ('"
                +s.getCompany()+"','"
                +s.getStartDate()+"','"
                +s.getEndDate()+"','"
                +s.getTheme()+"','"
                +s.getTitle()+"','"
                +s.getDescription()+"','"+s.getCandidat()+"');";  
            Statement ste = cnx.createStatement();
         ste.executeUpdate(req);
         System.out.println("Valeurs Insérré");
        }
    public List<Stages> displayStages(){
        String req= "SELECT * FROM STAGES";
        return Stages;
        
    }
	
}
