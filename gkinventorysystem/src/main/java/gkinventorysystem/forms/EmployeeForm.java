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
	private String firstname;
	
	@NotNull
	@Size(min=2,max=30)
	private String lastname;
	
	@NotNull
	@Size(min=2,max=30)
	private String gkEmployeeId;
	
	@NotNull
	private Department department;
	
	@NotNull
	private String permission;
	
	@NotNull
	@Email
	private String email;

	
	public EmployeeForm(){
		
	}
	
	public EmployeeForm(Employee employee){
		this.firstname = employee.getFirstName();
		this.lastname = employee.getLastName();
		this.gkEmployeeId = employee.getGkEmployeeId();
		this.department = employee.getDepartment();
		this.permission = String.valueOf(employee.getPermission());
		this.email = employee.getEmailAdress();
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
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

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
