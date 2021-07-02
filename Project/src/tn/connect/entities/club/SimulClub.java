package tn.connect.entities.club;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class SimulClub{

	
	private Long idSimulClub;
	private String name;
	private String university;
	private String institue;
	private String status;
    private Date creationDate;
	private String description;

	
	public SimulClub(Long idSimulClub,String name,String university,String institue,String status,String description,Date creationDate) 
	{
		this.idSimulClub = idSimulClub;
		this.institue = institue;
		this.name = name;
		this.status = status;
		this.university = university;
		this.description = description;
		this.creationDate = creationDate;
	}

	
	public Long getidSimulClub() {
		return idSimulClub;
	}
	public void idSimulClub(Long idSimulClub) {
		this.idSimulClub = idSimulClub;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getInstitue() {
		return institue;
	}
	public void setInstitue(String institue) {
		this.institue = institue;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
    
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	@Override
	public String toString() {
        return "SimulClub{" + "id=" + idSimulClub + ", name=" + name +", university=" + university +  ", institue=" +institue  + '}';
	}


	public Date getCreationDate() {
		return creationDate;
	}


	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
}
