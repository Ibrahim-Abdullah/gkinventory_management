/**
 * 
 */
package gkinventorysystem.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import gkinventorysystem.forms.NewDeviceForm;

/**
 * @author Ibrahim Abdullah
 *
 */

@Component
public class DeviceGeneral 
{
	private String serialNumber;
	private String gkId;
	private Type itemType;
	private String model;
	private String manufacturer;
	private Status deviceStatus;
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
	public DeviceGeneral(String serialNumber, String gkId, String type, String model, String manufacturer,String status,String defectDescription) {
		this.serialNumber = serialNumber;
		this.gkId = gkId;
		this.model = model;
		this.manufacturer = manufacturer;
		this.setItemType(type);
		this.setDeviceStatus(status);
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
	public DeviceGeneral(String serialNumber, String gkLabel, String type, String model, String brand) {
		super();
		this.serialNumber = serialNumber;
		this.gkId = gkLabel;
		this.setItemType(type);
		this.model = model;
		this.manufacturer = brand;
		this.user =  null;
	}
	
	/**
	 * 
	 * @param newDevice New Device object created from the add new device form
	 */
	public DeviceGeneral(NewDeviceForm newDevice){
		this.serialNumber = newDevice.getSerialNumber();
		this.gkId = newDevice.getGkId();
		this.setItemType(newDevice.getType());
		this.model = newDevice.getModel();
		this.manufacturer = newDevice.getManufacturer();
		this.user = null;
	}
	
	public String getSerialNumber() {
		return serialNumber;
	}
	
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public String getGkLabel() {
		return gkId;
	}
	
	public void setGkLabel(String gkLabel) {
		this.gkId = gkLabel;
	}
	
	public String getDeviceType() {
		return itemType.toString();
	}
	
	public void setItemType(String itemType) {
		this.itemType = Type.valueOf(itemType);
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return manufacturer;
	}
	
	public void setBrand(String brand) {
		this.manufacturer = brand;
	}
	
	/**
	 * @return the deviceStatus
	 */
	public Status getDeviceStatus() {
		return deviceStatus;
	}

	/**
	 * @param deviceStatus the deviceStatus to set
	 */
	public void setDeviceStatus(String deviceStatus) {
		this.deviceStatus = Status.valueOf(deviceStatus);
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
	
	public enum Type
	{
		DESKTOP,MOBILE_PHONE,KEYBOARD_MOUSE,MOUSE,KEYBOARD,LAPTOP
	}
	public enum Status
	{
		WORKING,NOT_WORKING
	}
}

