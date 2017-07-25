/**
 * 
 */
package gkinventorysystem.converter;

import java.beans.PropertyEditorSupport;

import org.springframework.stereotype.Component;

import gkinventorysystem.model.Department;

/**
 * @author Ibrahim-Abdullah
 *
 */

@Component
public class DepartmentStringConverter extends PropertyEditorSupport {
	
    //This will be called when user HTTP Post to server a field bound to DepartmentVO
    @Override
    public void setAsText(String departmentId) 
    {
        Department department;
        switch(Integer.parseInt(departmentId))
        {
            case 1: department = new Department(1,  "Products"); break;
            case 2: department = new Department(2,  "Support"); break;
            case 3: department = new Department(3,  "Finance and Administration"); break;
            case 4: department = new Department(4,"Sales"); 
            default: department = null;
        }
        
        this.setValue(department);
    }
}
