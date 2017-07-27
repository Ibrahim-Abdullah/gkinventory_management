/**
 * 
 */
package gkinventorysystem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import gkinventorysystem.model.DeviceGeneral;
import gkinventorysystem.model.DeviceStatus;
import gkinventorysystem.model.DeviceType;
import gkinventorysystem.model.Laptop;

/**
 * @author Ibrahim-Abdullah
 *
 */

@Component
public class DeviceManagementServiceImp implements DeviceManagementService {

	List<DeviceGeneral> devices = new ArrayList<DeviceGeneral>();
	@Override
	public List<DeviceGeneral> getAllDevice() {
		
		devices.add(new Laptop("00001000","gk00001000","LATITUDE E7450","DELL","Corei7",8,500,"Windows",new DeviceStatus("working",1)));
		devices.add(new Laptop("00001001","gk00001001","LATITUDE E7450","DELL","Corei7",16,450,"Linux",new DeviceStatus("Defective",2),"Can't Boot"));
		devices.add(new Laptop("00001000","gk00001000","LATITUDE E7450","DELL","Corei7",8,500,"Operating System",new DeviceStatus("working",1)));
		devices.add(new DeviceGeneral("00001000","gk00001000",new DeviceType("laptop",1),"LATITUDE E7450","DELL",new DeviceStatus("working",1)));
		devices.add(new DeviceGeneral("00001000","gk00001000",new DeviceType("laptop",1),"LATITUDE E7450","DELL",new DeviceStatus("working",1)));
		devices.add(new DeviceGeneral("00001000","gk00001000",new DeviceType("laptop",1),"LATITUDE E7450","DELL",new DeviceStatus("working",1)));
		return devices;
	}

	/* (non-Javadoc)
	 * @see gkinventorysystem.service.DeviceManagementService#getDeviceBySerialNumber(java.lang.String)
	 */
	@Override
	public DeviceGeneral getDeviceBySerialNumber(String serialNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see gkinventorysystem.service.DeviceManagementService#geteviceByType(java.lang.String)
	 */
	@Override
	public List<DeviceGeneral> geteviceByType(String Category) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see gkinventorysystem.service.DeviceManagementService#addNewDevice(gkinventorysystem.model.DeviceGeneral)
	 */
	@Override
	public boolean addNewDevice(DeviceGeneral newDevice) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see gkinventorysystem.service.DeviceManagementService#editDevice(gkinventorysystem.model.DeviceGeneral)
	 */
	@Override
	public boolean editDevice(DeviceGeneral itemToEdit) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see gkinventorysystem.service.DeviceManagementService#deleteDevice(gkinventorysystem.model.DeviceGeneral)
	 */
	@Override
	public boolean deleteDevice(DeviceGeneral itemToDelete) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see gkinventorysystem.service.DeviceManagementService#deleteDeviceBySerialNumber(java.lang.String)
	 */
	@Override
	public boolean deleteDeviceBySerialNumber(String deviceSerialNumber) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see gkinventorysystem.service.DeviceManagementService#getLaptopBySerialNumber(java.lang.String)
	 */
	@Override
	public Laptop getLaptopBySerialNumber(String serialNumber) {
		// TODO Auto-generated method stub
		return null;
	}

}
