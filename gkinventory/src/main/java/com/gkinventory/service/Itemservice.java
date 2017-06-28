/**
 * 
 */
package com.gkinventory.service;

import java.util.List;

import com.gkinventory.domain.Item;

/**
 * @author Ibrahim Abdullah
 *
 */
public interface Itemservice 
{
	public List<Item> getAllItems();
	public Item getItemById(String itemId);
	public List<Item> getItemByCateggory(String Category);
	public boolean addNewItem(Item newItem);
	public boolean editItem(Item itemToEdit);
	public boolean deleteItem(Item itemToDelete);
}
