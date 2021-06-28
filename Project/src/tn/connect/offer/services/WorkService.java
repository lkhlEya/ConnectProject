package tn.connect.offer.services;

public class WorkService {
    public ServiceStage() {
        cnx DBConnection.getInstance().getCnx();
        
    }
    public void addWork (Work w)throws SQLException{
        String req = "INSERT INTO WORK (company,field,title,description, start_date,agreementType,position,status) values ('"
        		+w.getCompany()+"','"
        		+w.getField()+"','"
        		+w.getTitle()+"','"
        		+w.getDescription+"','"
        		+w.getStartDate+"','"
        		+w.getAgreementType+"','"
        		+w.getPosition+"','"
        		+w.getStatus+"');"
        		
            Statement ste = cnx.createStatement();
         ste.executeUpdate(req);
         System.out.println("Valeurs Insérré");
        }

}
