/**
 * 
 */
package gkinventorysystem.service;


import java.util.List;

import org.springframework.stereotype.Component;

import gkinventorysystem.forms.EmployeeForm;
import gkinventorysystem.model.Employee;
/**
 * @author Ibrahim Abdullah
 *
 */

public interface EmployeeManagementService 
{
	
	public List<Employee> getAllEmployees();
	
	public List<Employee> getEmplyeesByDepartment(String department);
	
	public Employee getEmployeeById(String employeeId);
	
	public boolean addNewEmployee(EmployeeForm newEmployee);
	
	public boolean editEmployeeProfile(Employee employee);
	
	public void deleteEmployee(Employee employeeToEdit);
	
	public boolean deleteEmployeeById(String employeeId);
	
	public void makeEmployeeAdmin(Employee employee);
}
 