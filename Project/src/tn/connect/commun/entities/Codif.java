package tn.connect.commun.entities;

public class Codif {
	
	private String type;
	private String internal_code;
	private String external_code	;
	private String label;
	private String text;
	private String staus;
	private Long idCodif;
	
	public Codif(Long idCodif,String internal_code,String external_code,String label,String text, String staus) 
	{
		this.external_code = external_code;
		this.internal_code = internal_code;
		this.staus = staus;
		this.label = label;
		this.type = type;
		this.idCodif = idCodif;


	}
	public String getExternal_code() {
		return external_code;
	}
	
	public String getInternal_code() {
		return internal_code;
	}
	public String getLabel() {
		return label;
	}
	public String getStaus() {
		return staus;
	} 
	public String getText() {
		return text;
	}
	public String getType() {
		return type;
	}
	public void setExternal_code(String external_code) {
		this.external_code = external_code;
	}
	public void setInternal_code(String internal_code) {
		this.internal_code = internal_code;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public void setStaus(String staus) {
		this.staus = staus;
	}
	public void setText(String text) {
		this.text = text;
	}
	public void setType(String type) {
		this.type = type;
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
	public Long getIdCodif() {
		return idCodif;
	}
	public void setIdCodif(Long idCodif) {
		this.idCodif = idCodif;
	}
}
