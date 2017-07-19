package gkinventorysystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import gkinventorysystem.model.Employee;
import gkinventorysystem.service.EmployeeManagementService;

@Controller
@RequestMapping("employee/")
public class EmployeeManagementController {
	
	@Autowired
	private EmployeeManagementService employeeService;
	
	/**
	 * Get the list of all employees
	 * @param model
	 * @return the name of the view to present the list of the employees
	 */
	@RequestMapping(method=RequestMethod.GET)
	public String getAllEmployees(Model model){
		
		List<Employee> allEmployees = employeeService.getAllEmployees();
		
		model.addAttribute("allEmployees",allEmployees);
		
		return "employeeManagement";
	}
	
	/**
	 * This method get the details of the employee with the specified ID.
	 * The details of the employee is displayed in the viewEmployee.html view
	 * 
	 * @param employeeId The employee id
	 * @param model The model to store 
	 * @return the name of the view to display the employee details
	 */
	@RequestMapping(value="/view/{employeeId}",method=RequestMethod.GET)
	public String view(@PathVariable("employeeId") String employeeId, Model model){
		
		Employee employee = employeeService.getEmployeeById(employeeId);
		if(employee == null){
			//Notification about the absence of the specified employee and redirect
			
			return "redirect:/employee";
			
		}
		model.addAttribute("employee", employee);
		return "viewEmployee";
	}
	
	@RequestMapping(value="/newEmployee",method=RequestMethod.GET)
	public String showAddNewEmployeeForm(){
		return "addnewEmployee";
	}
	
	/**
	 * Process the values of the add new employee form
	 * @param employee The employee to be added 
	 * @return Redirect to the employee management page
	 */
	@RequestMapping(value="/newEmployee",method=RequestMethod.POST)
	public String saveNewEmployee(Employee employee){
		
		//Process the form input
		//Show notification of final work flow status
		return "redirect:/employee";
	}
	
	
	/**
	 * This method get employee details to be edited.
	 * The details are displayed in the editEmployee.html view
	 * @param employeeId
	 * @param model
	 * @return the name of the view to display the employee details
	 */
	@RequestMapping(value="/edit/{employeeId}",method=RequestMethod.GET)
	public String showEditEmployeeForm(@PathVariable("employeeId") String employeeId, Model model){
		
		Employee employee = employeeService.getEmployeeById(employeeId);
		
		if(employee == null){
			//Display notification and redirect to another page
			
			return "redirect:/employee";
		}
		model.addAttribute("employeeToEdit",employee);
		return "editEmployee";
	}
	
	/**
	 * Process editEmployee form data
	 * @param employee Employee with the edited properties
	 * @return Redirect to employee management page
	 */
	@RequestMapping(value="/edit",method=RequestMethod.POST)
	public String processEditEmployeeForm(Employee employee){
		
		
		//Display notification of edit status
		return "redirect:/employee";
	}
	
	
	/**
	 * This method get employee details to be edited.
	 * The details are displayed in the editEmployee.html view
	 * @param employeeId
	 * @param model
	 * @return the name of the view to display the employee details
	 */
	@RequestMapping(value="/delete/{employeeId}",method=RequestMethod.GET)
	public String delete(@PathVariable("employeeId") String employeeId, Model model){
		
		boolean isEmployeeDeleted = employeeService.deleteEmployeeById(employeeId);
		
		if(isEmployeeDeleted){
			//Display notification and redirect to another page and redirect to to the employee management page
			return "redirect:/employee";
		}
		//Show notification that the item has not been deleted and redirect to the employee management page
		
		return "redirect:/employee";
		
	}
}
