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
public interface DeviceManagementService {
	
	public List<DeviceGeneral> getAllDevice();
	
	public DeviceGeneral getDeviceBySerialNumber(String serialNumber);
	
	public List<DeviceGeneral> geteviceByType(String Category);
	
	public boolean addNewDevice(DeviceGeneral newDevice);
	
	public boolean editDevice(DeviceGeneral itemToEdit);
	
	public boolean deleteDevice(DeviceGeneral itemToDelete);
	
	public boolean deleteDeviceBySerialNumber(String deviceSerialNumber);
	
	public Laptop getLaptopBySerialNumber(String serialNumber);
}
