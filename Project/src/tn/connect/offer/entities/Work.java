package tn.connect.offer.entities;

import java.text.SimpleDateFormat;

public class Work extends Offer {

    private String agreementType; 
    private String position;
    private SimpleDateFormat startDate = new SimpleDateFormat("yyyy-MM-dd");
    
    public Work(){
        
    }

    public Work(String agreementType, String position, int id, String company, String field, String description, String title, String status,SimpleDateFormat startDate) {
        super(id, company, field, description, title, status);
        this.agreementType = agreementType;
        this.position = position;
        this.startDate = startDate;
        
    }


    public String getAgreementType() {
        return agreementType;
    }

    public String getPosition() {
        return position;
    }

    public SimpleDateFormat getStartDate() {
        return startDate;
    }

    public void setAgreementType(String agreementType) {
        this.agreementType = agreementType;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setStartDate(SimpleDateFormat startDate) {
        this.startDate = startDate;
    }

}
