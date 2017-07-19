/**
 * 
 */
package gkinventorysystem.service;


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
	
	public void addNewEmployee(Employee newEmployee);
	
	public void editEmployeeProfile(Employee employeeToEditProfile);
	
	public void deleteEmployee(Employee employeeToEdit);
	
	public boolean deleteEmployeeById(String employeeId);
	
	public void makeEmployeeAdmin(Employee employee);
}
 