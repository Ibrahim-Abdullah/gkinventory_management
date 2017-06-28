/**
 * 
 */
package gkinventorymgt.service;

import java.util.List;

import gkinventorymgt.domain.Employee;

/**
 * @author Ibrahim Abdullah
 *
 */
public interface Employeeservice 
{
	public List<Employee> getAllEmployees();
	public List<Employee> getEmplyeesByDepartment(String department);
	public List<Employee> getEmployeeByFirstName(String employeeFirstname);
	public boolean addNewEmployee(Employee newEmployee);
	public boolean editEmployeeProfile(Employee employeeToEditProfile);
	public boolean deleteEmployee(Employee employeeToEdit);
	public void makeEmployeeAdmin(Employee employee);
}
