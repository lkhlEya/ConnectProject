package tn.connect.club.entities;

public class Club {
	
	private Long idClub;
	private String name;
	private String university;
	private String institue;
	private String status;
	private String description;

	

	
	public Club(Long idClub,String name,String university,String institue,String status,String description ) 
	{
		this.idClub = idClub;
		this.institue = institue;
		this.name = name;
		this.status = status;
		this.university = university;
		this.description = description;
	}

	
	public Long getIdClub() {
		return idClub;
	}
	public void setIdClub(Long idClub) {
		this.idClub = idClub;
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
		// TODO Auto-generated method stub
		return super.toString();
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
}
