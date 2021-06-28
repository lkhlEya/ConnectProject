package tn.connect.offer.entities;

import java.text.SimpleDateFormat;

/**
 *
 * @author Thinkpad
 */
public class Internships extends Offer {

    private SimpleDateFormat startDate = new SimpleDateFormat("yyyy-MM-dd");
    private SimpleDateFormat endDate = new SimpleDateFormat("yyyy-MM-dd");
    private String supervisor;

    public Internships() {

    }

    public Internships(String supervisor, int id, String company, String field, String description, String title, String status) {
        super(id, company, field, description, title, status);
        this.supervisor = supervisor;
        this.endDate = endDate;
        this.startDate = startDate; 
        
    }

    public void setStartDate(SimpleDateFormat startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(SimpleDateFormat endDate) {
        this.endDate = endDate;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public SimpleDateFormat getStartDate() {
        return startDate;
    }

    public SimpleDateFormat getEndDate() {
        return endDate;
    }

    public String getSupervisor() {
        return supervisor;
    }

}
