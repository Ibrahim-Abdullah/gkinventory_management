/**
 * 
 */
package gkinventorysystem.forms;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import gkinventorysystem.model.Department;
import gkinventorysystem.model.Employee;

/**
 * @author Ibrahim-Abdullah
 *
 */

@Component
public class EmployeeForm {
	
	@NotNull
	@Size(min=2,max=30)
	private String firstName;
	
	@NotNull
	@Size(min=2,max=30)
	private String lastName;
	
	@NotNull
	@Size(min=2,max=30)
	private String gkEmployeeId;
	
	@NotNull
	private Department department;
	
	@NotNull
	private String permission;
	
	@NotNull
	@Email
	private String emailAdress;

	
	public EmployeeForm(){
		
	}
	
	public EmployeeForm(Employee employee){
		this.firstName = employee.getFirstName();
		this.lastName = employee.getLastName();
		this.gkEmployeeId = employee.getGkEmployeeId();
		this.department = employee.getDepartment();
		this.permission = String.valueOf(employee.getPermission());
		this.emailAdress = employee.getEmailAdress();
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the gkEmployeeId
	 */
	public String getGkEmployeeId() {
		return gkEmployeeId;
	}

	/**
	 * @param gkEmployeeId the gkEmployeeId to set
	 */
	public void setGkEmployeeId(String gkEmployeeId) {
		this.gkEmployeeId = gkEmployeeId;
	}

	/**
	 * @return the department
	 */
	public Department getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(Department department) {
		this.department = department;
	}

	/**
	 * @return the permission
	 */
	public String getPermission() {
		return permission;
	}

	/**
	 * @param permission the permission to set
	 */
	public void setPermission(String permission) {
		this.permission = permission;
	}

	/**
	 * @return the emailAdress
	 */
	public String getEmailAdress() {
		return emailAdress;
	}

	/**
	 * @param emailAdress the emailAdress to set
	 */
	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}
	
}
