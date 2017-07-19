/**
 * 
 */
package com.gkinventory.service;

import java.util.List;

import com.gkinventory.model.DeviceGeneral;

/**
 * @author Ibrahim Abdullah
 *
 */
public interface Itemservice 
{
	public List<DeviceGeneral> getAllItems();
	public DeviceGeneral getItemById(String itemId);
	public List<DeviceGeneral> getItemByCateggory(String Category);
	public boolean addNewItem(DeviceGeneral newItem);
	public boolean editItem(DeviceGeneral itemToEdit);
	public boolean deleteItem(DeviceGeneral itemToDelete);
}
