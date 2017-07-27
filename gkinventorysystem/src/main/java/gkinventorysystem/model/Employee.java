/**
 * 
 */
package gkinventorysystem.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import gkinventorysystem.forms.EmployeeForm;
import gkinventorysystem.model.Department;
import gkinventorysystem.model.Permission;
/**
 * @author Ibrahim Abdullah
 *
 */

@Component
public class Employee 
{
	private String firstName;
	private String lastName;
	private String gkEmployeeId;
	private Department department;
	private Permission permission;
	private String emailAdress;
	
	//NB: A LAPTOP IS ALSO A DEVICE
	private List<DeviceGeneral> assignedDevices;
	
	
	public Employee(){
		
	}
	
	/**
	 * 
	 * @param fname
	 * @param lname
	 * @param employeeId
	 * @param email
	 * @param department
	 */
	public Employee(String fname, String lname,String employeeId,String email,Department department,Permission permission){
		 this.firstName = fname;
		 this.lastName = lname;
		 this.gkEmployeeId = employeeId;
		 this.emailAdress = email;
		 this.department = department;
		 this.permission = permission;
		// this.permission = 
		 //this.setPermission(Permission.NOT_ADMIN);
		 this.assignedDevices = null;
	}
	
	/**
	 * 
	 * @param fname
	 * @param lname
	 * @param employeeId
	 * @param email
	 * @param department
	 * @param assignedDevice
	 */
	public Employee(String fname, String lname,String employeeId,String email,Department department,List<DeviceGeneral> assignedDevice){
		 this.firstName = fname;
		 this.lastName = lname;
		 this.gkEmployeeId = employeeId;
		 this.emailAdress = email;
		 this.setDepartment(department);
		 //this.setPermission(Permission.NOT_ADMIN);
		 this.assignedDevices = assignedDevice;
	}
	
	/**
	 * 
	 * @param employee
	 **/
	public Employee(EmployeeForm employee){
		this.firstName = employee.getFirstname();
		this.lastName = employee.getLastname();
		this.gkEmployeeId = employee.getGkEmployeeId();
		this.department = employee.getDepartment();
		this.permission = employee.getPermission();
		this.emailAdress = employee.getEmail();
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
	
	public Department getDepartment(){
		return this.department;
	}
}
