package tn.connect.offer.entities;

public class Offer {

    private int id;
    private String company;
    private String field;
    private String description;

    public Offer(int id, String company, String field, String description) {
        this.id = id;
        this.company = company;
        this.field = field;
        this.description = description;
    }

    public Offer(int id2, String company2, String field2, String description2, String title, String status) {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
        return id;
    }

    public String getCompany() {
        return company;
    }

    public String getField() {
        return field;
    }

    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setField(String field) {
        this.field = field;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Offer{" + "id=" + id + ", company=" + company + ", field=" + field + ", description=" + description + '}';
    }
    
    
    
    
}