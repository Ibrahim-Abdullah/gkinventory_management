package com.gkinventory.service;

import com.gkinventory.model.Employee;
import com.gkinventory.model.DeviceGeneral;

/**
 * @author Ibrahim Abdullah
 *
 */
public interface ItemAllocationService 
{
	public boolean allocateItemToEmployee(DeviceGeneral item, Employee employee);
	public boolean deallocateItemToEmployee(DeviceGeneral item, Employee employee);
}
