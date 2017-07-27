/**
 * 
 */
package gkinventorysystem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import gkinventorysystem.forms.EmployeeForm;
import gkinventorysystem.model.Department;
import gkinventorysystem.model.Employee;
import gkinventorysystem.model.Permission;

/**
 * @author Ibrahim-Abdullah
 *
 */
@Component
public class EmployeeManagementServiceImp implements EmployeeManagementService {
	
	List<Employee>employees = new ArrayList<Employee>();
	public EmployeeManagementServiceImp() {
		super();
		employees.add(new Employee("Ibrahim","Abdullah","001","ibrahim.abdullah@ashesi.edu.gh",new Department(1,"Products"),new Permission("user",1)));
		employees.add(new Employee("Diabene","Agire","002","Diabene.Agire@Genkey.com",new Department(1,"Products"),new Permission("Not User",2)));
		employees.add(new Employee("Kofi","Boateng","003","Kofi.Boateng@Genkey.com",new Department(1,"Finance and Administration"),new Permission("user",1)));
	}

	public List<Employee> getAllEmployees() {
		return this.employees;
	}

	public List<Employee> getEmplyeesByDepartment(String department) {
		// TODO Auto-generated method stub
		return null;
	}

	public Employee getEmployeeById(String employeeId) {
		for( Employee employee: employees){
			
			if(employee.getGkEmployeeId().equalsIgnoreCase(employeeId))
			return employee;
		}
		return null;
		
	}

	public void addNewEmployee(Employee newEmployee) {
		
		
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
		
		Employee employee = new Employee(newEmployee);
		boolean isAdded = this.employees.add(employee);
		if(isAdded){
			return true;
		}
		return false;
	}

}
