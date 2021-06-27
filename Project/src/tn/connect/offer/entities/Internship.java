package tn.connect.offer.entities;
import java.text.SimpleDateFormat;
/**
*
* @author Thinkpad
*/

public class Internship {
    private int id;
    private String company;
    private SimpleDateFormat startDate = new SimpleDateFormat("yyyy-MM-dd");
    private SimpleDateFormat endDate = new SimpleDateFormat("yyyy-MM-dd");
    private String theme;
    private String title;
    private String description;
    private String candidat;
    // the type of the candidat attribute should be changed to student
    
    
    public Stages(int id, String company, String theme, String title
            , String description, String candidat) {
        this.id = id;
        this.company = company;
        this.theme = theme;
        this.title = title;
        this.description = description;
        this.candidat = candidat;
    }

    public int getId() {
        return id;
    }

    public String getCompany() {
        return company;
    }

    public SimpleDateFormat getStartDate() {
        return startDate;
    }

    public SimpleDateFormat getEndDate() {
        return endDate;
    }

    public String getTheme() {
        return theme;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getCandidat() {
        return candidat;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setStartDate(SimpleDateFormat startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(SimpleDateFormat endDate) {
        this.endDate = endDate;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCandidat(String candidat) {
        this.candidat = candidat;
    }

    @Override
    public String toString() {
        return "Stages{" + "id=" + id + ", company=" + company + ", startDate=" 
                + startDate + ", endDate=" + endDate + ", theme=" + theme + ", "
                + "title=" + title + ", description=" + description + 
                ", candidat=" + candidat + '}';
    }

}
