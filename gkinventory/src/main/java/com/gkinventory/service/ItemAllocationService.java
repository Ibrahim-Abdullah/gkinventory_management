package com.gkinventory.service;

import com.gkinventory.domain.Employee;
import com.gkinventory.domain.Item;

/**
 * @author Ibrahim Abdullah
 *
 */
public interface ItemAllocationService 
{
	public boolean allocateItemToEmployee(Item item, Employee employee);
	public boolean deallocateItemToEmployee(Item item, Employee employee);
}
