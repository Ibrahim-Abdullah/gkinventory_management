/**
 * 
 */
package gkinventorysystem.service;

import java.util.List;

import org.springframework.stereotype.Component;

import gkinventorysystem.forms.EmployeeForm;
import gkinventorysystem.model.Employee;

/**
 * @author Ibrahim-Abdullah
 *
 */
@Component
public class EmployeeManagementServiceImp implements EmployeeManagementService {

	public List<Employee> getAllEmployees() {
		return null;
	}

	public List<Employee> getEmplyeesByDepartment(String department) {
		// TODO Auto-generated method stub
		return null;
	}

	public Employee getEmployeeById(String employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addNewEmployee(Employee newEmployee) {
		// TODO Auto-generated method stub
		
	}

	public boolean editEmployeeProfile(Employee employeeToEditProfile) {
		// TODO Auto-generated method stub
		return true;
	}

	public void deleteEmployee(Employee employeeToEdit) {
		// TODO Auto-generated method stub
		
	}

	public boolean deleteEmployeeById(String employeeId) {
		// TODO Auto-generated method stub
		return false;
	}

	public void makeEmployeeAdmin(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean addNewEmployee(EmployeeForm newEmployee) {
		// TODO Auto-generated method stub
		return false;
	}

}
