package tn.connect.entities.offers;

import java.sql.Date;

/**
 *
 * @author Thinkpad
 */
public class Internships extends Offer {

    private Date startDate;
    private Date endDate;
    private String supervisor;



    public Internships(int id,
            String company,
            String field,
            String title,
            String description,
            Date startDate,
            Date endDate,
            String supervisor,
            String status) {
        super(id, company, field, description, title, status);
        this.supervisor = supervisor;
        this.endDate = endDate;
        this.startDate = startDate;

    }
    public Internships(String company,
            String field,
            String title,
            String description,
            Date startDate,
            Date endDate,
            String supervisor,
            String status) {
        super(company, field, description, title, status);
        this.supervisor = supervisor;
        this.endDate = endDate;
        this.startDate = startDate;

    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public String getSupervisor() {
        return supervisor;
    }

}
