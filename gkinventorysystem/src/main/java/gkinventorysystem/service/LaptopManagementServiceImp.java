/**
 * 
 */
package gkinventorysystem.service;

import java.util.List;

import org.springframework.stereotype.Component;

import gkinventorysystem.model.Laptop;

/**
 * @author Ibrahim-Abdullah
 *
 */

@Component
public class LaptopManagementServiceImp implements LaptopManagementService {

	/* (non-Javadoc)
	 * @see gkinventorysystem.service.LaptopManagementService#getAllLaptops()
	 */
	@Override
	public List<Laptop> getAllLaptops() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see gkinventorysystem.service.LaptopManagementService#getLaptopBySerialNumber(java.lang.String)
	 */
	@Override
	public Laptop getLaptopBySerialNumber(String laptopSerialNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see gkinventorysystem.service.LaptopManagementService#addNewLaptop(gkinventorysystem.model.Laptop)
	 */
	@Override
	public boolean addNewLaptop(Laptop newLaptop) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see gkinventorysystem.service.LaptopManagementService#editLaptop(gkinventorysystem.model.Laptop)
	 */
	@Override
	public boolean editLaptop(Laptop laptopToEdit) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see gkinventorysystem.service.LaptopManagementService#deleteLaptop(gkinventorysystem.model.Laptop)
	 */
	@Override
	public boolean deleteLaptop(Laptop laptopToDelete) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see gkinventorysystem.service.LaptopManagementService#deleteLaptopBySerialNumber(java.lang.String)
	 */
	@Override
	public boolean deleteLaptopBySerialNumber(String deviceSerialNumber) {
		// TODO Auto-generated method stub
		return false;
	}

}
