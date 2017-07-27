/**
 * 
 */
package gkinventorysystem.converter;

import java.beans.PropertyEditorSupport;

import gkinventorysystem.model.Department;
import gkinventorysystem.model.DeviceType;

/**
 * @author Ibrahim-Abdullah
 *
 */
public class DeviceTypeStringConverter extends PropertyEditorSupport {
	
    //This will be called when user HTTP Post to server a field bound to DepartmentVO
    @Override
    public void setAsText(String departmentId) 
    {
        DeviceType deviceType;
        switch(Integer.parseInt(departmentId))
        {
            case 1: deviceType = new DeviceType("Laptop",1); break;
            case 2: deviceType = new DeviceType("Desktop",2); break;
            case 3: deviceType = new DeviceType("Keyboard and Mouse",3); break;
            case 4: deviceType = new DeviceType("Only Keyboard",4); 
            case 5: deviceType = new DeviceType("Only Mouse",5); 
            case 6: deviceType = new DeviceType("Mobile Phone",6); 
            default: deviceType = null;
        }
        
        this.setValue(deviceType);
    }
}
