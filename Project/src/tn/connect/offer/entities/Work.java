package tn.connect.offer.entities;

public class Work extends Offer {
    private String agreementType;
    private String position;
    SimpleDateFormat startDate = new SimpleDateFormat("yyyy-MM-dd");

    public Work(String agreementType, String position, int id, String company, String field, String description) {
        super(id, company, field, description);
        this.agreementType = agreementType;
        this.position = position;
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