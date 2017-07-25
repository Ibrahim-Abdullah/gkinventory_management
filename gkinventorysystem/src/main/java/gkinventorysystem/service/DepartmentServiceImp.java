/**
 * 
 */
package gkinventorysystem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import gkinventorysystem.model.Department;

/**
 * @author Ibrahim-Abdullah
 *
 */

@Component
public class DepartmentServiceImp implements DepartmentService {
	
	
	private Department department;
	
	@Override
	public List<Department> getAllDepartment() {
		// TODO Auto-generated method stub
		
		List<Department> allDepartment = new ArrayList<Department>();
		
		allDepartment.add(new Department(-1,  "Select Department"));
		allDepartment.add(new Department(1,  "Products"));
		allDepartment.add(new Department(2,  "Support"));
		allDepartment.add(new Department(3,  "Finance and Administration"));
		allDepartment.add(new Department(4,  "Sales"));
		
        return allDepartment;
	}

}
