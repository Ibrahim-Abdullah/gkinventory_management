/**
 * 
 */
package gkinventorymgt.domain;

/**
 * @author Ibrahim Abdullah
 *
 */
public class Employee 
{
	private String firstName;
	private String lastName;
	private String gkEmployeeId;
	private Department department;
	private Permission permission;
	private String emailAdress;
	
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getGkEmployeeId() {
		return gkEmployeeId;
	}
	
	public void setGkEmployeeId(String gkEmployeeId) {
		this.gkEmployeeId = gkEmployeeId;
	}
	
	public Department getDepartment() {
		return department;
	}
	
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public Permission getPermission() {
		return permission;
	}
	
	public void setPermission(Permission permission) {
		this.permission = permission;
	}
	
	public String getEmailAdress() {
		return emailAdress;
	}
	
	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}
	
 
	
	public enum Department
	{
		ADMINISTRATION,OPERATIONS_SUPPORT,DEVELOPERS,QA,SALES,TRANSORT_LOGISTICS
	}
	public enum Permission
	{
		ADMIN,NOT_ADMIN
	}
}
