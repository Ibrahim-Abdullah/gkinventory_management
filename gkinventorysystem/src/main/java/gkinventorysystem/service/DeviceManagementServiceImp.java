/**
 * 
 */
package gkinventorysystem.service;

import java.util.List;

import org.springframework.stereotype.Component;

import gkinventorysystem.model.DeviceGeneral;
import gkinventorysystem.model.Laptop;

/**
 * @author Ibrahim-Abdullah
 *
 */

@Component
public class DeviceManagementServiceImp implements DeviceManagementService {

	/* (non-Javadoc)
	 * @see gkinventorysystem.service.DeviceManagementService#getAllDevice()
	 */
	@Override
	public List<DeviceGeneral> getAllDevice() {
		// TODO Auto-generated method stub
		return null;
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
