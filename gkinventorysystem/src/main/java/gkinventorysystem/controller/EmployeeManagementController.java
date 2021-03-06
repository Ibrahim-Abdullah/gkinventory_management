package gkinventorysystem.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import gkinventorysystem.converter.DepartmentStringConverter;
import gkinventorysystem.converter.PermissionStringConverter;
import gkinventorysystem.forms.EmployeeForm;
import gkinventorysystem.forms.LoginForm;
import gkinventorysystem.model.Department;
import gkinventorysystem.model.Employee;
import gkinventorysystem.model.Permission;
import gkinventorysystem.service.DepartmentService;
import gkinventorysystem.service.DepartmentServiceImp;
import gkinventorysystem.service.EmployeeManagementService;
import gkinventorysystem.service.EmployeeManagementServiceImp;

@Controller
@RequestMapping("/employee")
public class EmployeeManagementController {

	@Autowired
	private EmployeeManagementServiceImp employeeService;

	@Autowired
	private DepartmentServiceImp departmentService;

	/**
	 * Get the list of all employees
	 * 
	 * @param model
	 * @return the name of the view to present the list of the employees
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Department.class, new DepartmentStringConverter());
		binder.registerCustomEditor(Permission.class, new PermissionStringConverter());
	}

	@RequestMapping(method = RequestMethod.GET)
	public String getAllEmployees(Model model) {

		List<Employee> allEmployees = employeeService.getAllEmployees();
		model.addAttribute("allEmployees", employeeService.getAllEmployees());

		return "employeemanagement";
	}

	/**
	 * This method get the details of the employee with the specified ID. The
	 * details of the employee is displayed in the viewEmployee.html view
	 * 
	 * @param employeeId
	 *            The employee id
	 * @param model
	 *            The model to store
	 * @return the name of the view to display the employee details
	 */
	@RequestMapping(value = "/view/{employeeId}", method = RequestMethod.GET)
	public String view(@PathVariable("employeeId") String employeeId, Model model) {

		Employee employee = employeeService.getEmployeeById(employeeId);
		if (employee == null) {
			// Notification about the absence of the specified employee and
			// redirect

			// return "redirect:/employee";
			return "redirect:/login";

		}
		model.addAttribute("employee", employee);
		return "viewemployee";
	}

	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public String showAddNewEmployeeForm(Model model) {

		model.addAttribute("newEmployee", new EmployeeForm());
		model.addAttribute("departmentList", getAllDepartment());
		model.addAttribute("permissionList", getAllPermission());
		return "addnewemployee";
	}

	/**
	 * Process the values of the add new employee form
	 * 
	 * @param employee
	 *            The employee to be added
	 * @return Redirect to the employee management page
	 */
	@RequestMapping(value = "/new", method = RequestMethod.POST)
	public String saveNewEmployee(@Valid EmployeeForm employeeForm, BindingResult bindingResult, Model model) {

		if (bindingResult.hasErrors()) {
			return "addnewemployee";
		}

		boolean isEmployeeAdded = employeeService.addNewEmployee(employeeForm);
		if (!isEmployeeAdded) {

			// Show notification of employee successfully added
			model.addAttribute("newEmployee", employeeForm);
			return "addnewemployee";
		}

		// Show notification of error in adding the employee to the database and
		// show form again
		return "redirect:/employee";
	}

	/**
	 * This method get employee details to be edited. The details are displayed
	 * in the editEmployee.html view
	 * 
	 * @param employeeId
	 * @param model
	 * @return the name of the view to display the employee details
	 */
	@RequestMapping(value = "/edit/{employeeId}", method = RequestMethod.GET)
	public String showEditEmployeeForm(@PathVariable("employeeId") String employeeId, Model model) {

		Employee employee = employeeService.getEmployeeById(employeeId);

		if (employee == null) {
			// Display notification and redirect to another page

			return "redirect:/employee";
		}
		model.addAttribute("employeeForm", new EmployeeForm(employee));
		return "editemployee";
	}

	/**
	 * Process editEmployee form data
	 * 
	 * @param employee
	 *            Employee with the edited properties
	 * @return Redirect to employee management page
	 */
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String processEditEmployeeForm(EmployeeForm employeeForm, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {

			return "editemployee";
		}

		// boolean isEmployeeEditSaved = employeeService.editEmployeeProfile(new
		// Employee(employeeForm));
		// Display notification of edit status
		return "redirect:/employee";
	}

	/**
	 * This method get employee details to be edited. The details are displayed
	 * in the editEmployee.html view
	 * 
	 * @param employeeId
	 * @param model
	 * @return the name of the view to display the employee details
	 */
	@RequestMapping(value = "/delete/{employeeId}", method = RequestMethod.GET)
	public String delete(@PathVariable("employeeId") String employeeId, Model model) {

		boolean isEmployeeDeleted = employeeService.deleteEmployeeById(employeeId);

		if (isEmployeeDeleted) {
			// Display notification and redirect to another page and redirect to
			// to the employee management page
			return "redirect:/employee";
		}
		// Show notification that the item has not been deleted and redirect to
		// the employee management page

		return "redirect:/employee";

	}

	@RequestMapping(value = "/userprofile", method = RequestMethod.GET)
	public String showUserProfile(Model model) {

		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "userprofile";
	}

	/**
	 * 
	 * @return List of all the department in the database
	 */
	private List<Department> getAllDepartment() {
		return departmentService.getAllDepartment();
	}
	
	private List<Permission> getAllPermission(){
		List<Permission> permits = new ArrayList<Permission>();
		permits.add(new Permission("Select Role", -1));
		permits.add(new Permission("User", 1));
		permits.add(new Permission("Not a User", 2));
		
		return permits;
		
	}
}
