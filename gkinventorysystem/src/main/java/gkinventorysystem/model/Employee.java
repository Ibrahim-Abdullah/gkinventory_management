/**
 * 
 */
package gkinventorysystem.model;

import java.util.List;

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
	private List<DeviceGeneral> assignedDevices;
	
	
	public Employee(String fname, String lname,String employeeId,String email,String department){
		 this.firstName = fname;
		 this.lastName = lname;
		 this.gkEmployeeId = employeeId;
		 this.emailAdress = email;
		 this.setDepartment(department);
		 this.setPermission(Permission.NOT_ADMIN);
		 this.assignedDevices = null;
	}
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
	
	public void setDepartment(String department) {
		this.department = Department.valueOf(department);
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
	
	
	/**
	 * @return the assignedDevices
	 */
	public List<DeviceGeneral> getAssignedDevices() {
		return assignedDevices;
	}
	/**
	 * @param assignedDevices the assignedDevices to set
	 */
	public void setAssignedDevices(List<DeviceGeneral> assignedDevices) {
		this.assignedDevices = assignedDevices;
	}
	
	public boolean addAsignedDevice(DeviceGeneral device){
		
		return this.assignedDevices.add(device);
	}
	
	/**
	 * @param department the department to set
	 */
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", gkEmployeeId=" + gkEmployeeId
				+ ", department=" + department + ", permission=" + permission + ", emailAdress=" + emailAdress + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Employee)) {
			return false;
		}
		Employee other = (Employee) obj;
		if (department != other.department) {
			return false;
		}
		if (emailAdress == null) {
			if (other.emailAdress != null) {
				return false;
			}
		} else if (!emailAdress.equals(other.emailAdress)) {
			return false;
		}
		if (firstName == null) {
			if (other.firstName != null) {
				return false;
			}
		} else if (!firstName.equals(other.firstName)) {
			return false;
		}
		if (gkEmployeeId == null) {
			if (other.gkEmployeeId != null) {
				return false;
			}
		} else if (!gkEmployeeId.equals(other.gkEmployeeId)) {
			return false;
		}
		if (lastName == null) {
			if (other.lastName != null) {
				return false;
			}
		} else if (!lastName.equals(other.lastName)) {
			return false;
		}
		if (permission != other.permission) {
			return false;
		}
		return true;
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
