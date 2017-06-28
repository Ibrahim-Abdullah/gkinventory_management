package gkinventorymgt.service;

import gkinventorymgt.domain.Employee;
import gkinventorymgt.domain.Item;

/**
 * @author Ibrahim Abdullah
 *
 */
public interface ItemAllocationService 
{
	public boolean allocateItemToEmployee(Item item, Employee employee);
	public boolean deallocateItemToEmployee(Item item, Employee employee);
}
