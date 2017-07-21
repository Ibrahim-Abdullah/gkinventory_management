/**
 * 
 */
package gkinventorysystem.service;

import java.util.List;

import gkinventorysystem.model.DeviceGeneral;
import gkinventorysystem.model.Laptop;

/**
 * @author Ibrahim-Abdullah
 *
 */
public interface LaptopManagementService {

	public List<Laptop> getAllLaptops();
	
	public Laptop getLaptopBySerialNumber(String laptopSerialNumber);
	
	
	public boolean addNewLaptop(Laptop newLaptop);
	
	public boolean editLaptop(Laptop laptopToEdit);
	
	public boolean deleteLaptop(Laptop laptopToDelete);
	
	public boolean deleteLaptopBySerialNumber(String deviceSerialNumber);
	
}
