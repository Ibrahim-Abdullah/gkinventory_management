/**
 * 
 */
package gkinventorysystem.forms;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author Ibrahim-Abdullah
 *
 */
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
	private String department;
	
	@NotNull
	private String permission;
	
	@NotNull
	@Email
	private String emailAdress;

	
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
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmployeeForm [firstName=" + firstName + ", lastName=" + lastName + ", gkEmployeeId=" + gkEmployeeId
				+ ", department=" + department + ", permission=" + permission + ", emailAdress=" + emailAdress + "]";
	}
	
	
}
