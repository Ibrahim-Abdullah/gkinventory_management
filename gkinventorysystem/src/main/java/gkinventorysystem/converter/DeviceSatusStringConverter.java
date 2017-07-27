/**
 * 
 */
package gkinventorysystem.converter;

import java.beans.PropertyEditorSupport;

import gkinventorysystem.model.DeviceStatus;
import gkinventorysystem.model.DeviceType;

/**
 * @author Ibrahim-Abdullah
 *
 */
public class DeviceSatusStringConverter extends PropertyEditorSupport {
	
    //This will be called when user HTTP Post to server a field bound to DepartmentVO
    @Override
    public void setAsText(String statusId) 
    {
        DeviceStatus deviceStatus;
        switch(Integer.parseInt(statusId))
        {
            case 1: deviceStatus = new DeviceStatus("Working",1); break;
            case 2: deviceStatus = new DeviceStatus("Defective",2); break; 
            default: deviceStatus = null;
        }
        
        this.setValue(deviceStatus);
    }
}
