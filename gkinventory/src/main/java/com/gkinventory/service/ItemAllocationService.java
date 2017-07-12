package com.gkinventory.service;

import com.gkinventory.model.Employee;
import com.gkinventory.model.Item;

/**
 * @author Ibrahim Abdullah
 *
 */
public interface ItemAllocationService 
{
	public boolean allocateItemToEmployee(Item item, Employee employee);
	public boolean deallocateItemToEmployee(Item item, Employee employee);
}
