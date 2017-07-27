/**
 * 
 */
package gkinventorysystem.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import gkinventorysystem.forms.NewDeviceForm;
import gkinventorysystem.model.DeviceStatus;

/**
 * @author Ibrahim Abdullah
 *
 */

@Component
public class DeviceGeneral 
{
	private String serialNumber;
	private String gkId;
	private DeviceType deviceType;
	private String model;
	private String manufacturer;
	private DeviceStatus deviceStatus;
	private String defectDescription;
	private Employee user;
	
	
	public DeviceGeneral(){
		
	}
	/**
	 * @param serialNumber
	 * @param gkLabel
	 * @param itemType
	 * @param model
	 * @param brand
	 * @param comment
	 * @param defectDescription
	 */
	public DeviceGeneral(String serialNumber, String gkId, DeviceType type, String model, String manufacturer,DeviceStatus status,String defectDescription) {
		this.serialNumber = serialNumber;
		this.gkId = gkId;
		this.model = model;
		this.manufacturer = manufacturer;
		this.deviceType = type;
		this.deviceStatus = status;
		this.defectDescription = defectDescription;
		this.user = null;
	}
	

	/**
	 * @param serialNumber
	 * @param gkLabel
	 * @param itemType
	 * @param model
	 * @param brand
	 */
	public DeviceGeneral(String serialNumber, String gkLabel, DeviceType type, String model, String manufacturer,DeviceStatus status) {
		super();
		this.serialNumber = serialNumber;
		this.gkId = gkLabel;
		this.deviceType = type;
		this.model = model;
		this.manufacturer = manufacturer;
		this.deviceStatus = status;
		this.user =  null;
	}
	
	/**
	 * 
	 * @param newDevice New Device object created from the add new device form
	 */
	public DeviceGeneral(NewDeviceForm newDevice){
		this.serialNumber = newDevice.getSerialNumber();
		this.gkId = newDevice.getGkId();
		this.deviceType = newDevice.getType();
		this.model = newDevice.getModel();
		this.deviceStatus = newDevice.getStatus();
		this.manufacturer = newDevice.getManufacturer();
		this.user = null;
	}
	
	public String getSerialNumber() {
		return serialNumber;
	}
	
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	/**
	 * @return the deviceStatus
	 */
	public DeviceStatus getDeviceStatus() {
		return deviceStatus;
	}

	/**
	 * @param deviceStatus the deviceStatus to set
	 */
	public void setDeviceStatus(DeviceStatus deviceStatus) {
		this.deviceStatus = deviceStatus;
	}
	
	
	
	public String getGkId() {
		return gkId;
	}
	public void setGkId(String gkId) {
		this.gkId = gkId;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getDefectDescription() {
		return defectDescription;
	}
	public void setDefectDescription(String defectDescription) {
		this.defectDescription = defectDescription;
	}
	public void setDeviceType(DeviceType deviceType) {
		this.deviceType = deviceType;
	}
	
	
	public DeviceType getDeviceType() {
		return deviceType;
	}
	/**
	 * @return the user
	 */
	public Employee getUser() {
		return user;
	}


	/**
	 * @param user the user to set
	 */
	public void setUser(Employee user) {
		this.user = user;
	}
	
}

