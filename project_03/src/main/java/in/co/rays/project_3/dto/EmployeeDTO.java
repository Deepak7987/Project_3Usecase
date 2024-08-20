package in.co.rays.project_3.dto;

import java.util.Date;

public class EmployeeDTO  extends BaseDTO {
	
	private String name;
	private String lastName;
	private String department;
	private Date dateOfJaining;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Date getDateOfJaining() {
		return dateOfJaining;
	}
	public void setDateOfJaining(Date dateOfJaining) {
		this.dateOfJaining = dateOfJaining;
	}
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
