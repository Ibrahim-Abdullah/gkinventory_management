/**
 * 
 */
package gkinventorysystem.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import gkinventorysystem.model.DeviceGeneral;
import gkinventorysystem.model.Laptop;
import gkinventorysystem.service.DeviceManagementServiceImp;
/**
 * @author Ibrahim-Abdullah
 *
 */

@Component
public class LaptopManagementServiceImp implements LaptopManagementService {
	
	List<DeviceGeneral> allLaptops = new ArrayList<DeviceGeneral>();
	
	
	public LaptopManagementServiceImp() {
		super();
		Iterator<DeviceGeneral> iter = DeviceManagementServiceImp.devices.iterator();
		
		if(iter.hasNext()){
			if(iter.next().getDeviceType().getType().equalsIgnoreCase("laptop")){
				allLaptops.add(iter.next());
			}
		}
	}

	@Override
	public List<DeviceGeneral> getAllLaptops() {
		if(allLaptops.isEmpty()){
			return null;
		}
		return this.allLaptops;
	}

	@Override
	public DeviceGeneral getLaptopBySerialNumber(String laptopSerialNumber) {
		
		if(allLaptops.isEmpty()){
			return null;
		}
		for(DeviceGeneral device: allLaptops){
			if(device.getSerialNumber().equalsIgnoreCase(laptopSerialNumber)){
				return device;
			}
		}
		return null;
	}

	@Override
	public boolean addNewLaptop(Laptop newLaptop) {
		return DeviceManagementServiceImp.devices.add(newLaptop);
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
