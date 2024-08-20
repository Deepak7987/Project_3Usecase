package in.co.rays.project_3.dto;

import java.util.Date;

public class PatientDTO extends BaseDTO{
	
	
	private String name;
	private Date  dateofvisit;
	private String mobile;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateofvisit() {
		return dateofvisit;
	}
	public void setDateofvisit(Date dateofvisit) {
		this.dateofvisit = dateofvisit;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getDecease() {
		return decease;
	}
	public void setDecease(String decease) {
		this.decease = decease;
	}
	private String decease;
	@Override
	public String getKey() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}
	

	
}
