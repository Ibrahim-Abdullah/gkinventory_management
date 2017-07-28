/**
 * 
 */
package gkinventorysystem.forms;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
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
public class NewDeviceForm {
	
	@NotNull
	private String serialNumber;
	
	@NotNull
	private String gkId;
	
	@NotNull
	private DeviceType type;
	
	@NotNull
	private DeviceStatus status;
	
	@NotNull
	private String manufacturer;
	
	@NotNull
	private String model;
	
	//Laptop specific properties
	@NotNull
	private String cpu;
	
	@NotNull
	private String ram;
	
	@NotNull
	private String hdd;
	
	@NotNull
	private String os;
	
	//Defective device property

	private String defectDescription;

	
	
	public NewDeviceForm(){
		
	}
	
	public NewDeviceForm(Laptop laptop){
		this.serialNumber = laptop.getSerialNumber();
		this.gkId = laptop.getGkId();
		this.type = laptop.getDeviceType();
		this.status = laptop.getDeviceStatus();
		this.manufacturer = laptop.getManufacturer();
		this.model = laptop.getModel();
		this.cpu = laptop.getCpu();
		this.ram = String.valueOf(laptop.getRamSize());
		this.os = laptop.getOperatingSystem();
		this.hdd = String.valueOf(laptop.getHardDriveSize());
	}
	

	public NewDeviceForm(DeviceGeneral device){
		this.serialNumber = device.getSerialNumber();
		this.gkId = device.getGkId();
		this.type = device.getDeviceType();
		this.status = device.getDeviceStatus();
		this.manufacturer = device.getManufacturer();
		this.model = device.getModel();
		
	}
	/**
	 * @return the serialNumber
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * @param serialNumber the serialNumber to set
	 */
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	/**
	 * @return the gkId
	 */
	public String getGkId() {
		return gkId;
	}

	/**
	 * @param gkId the gkId to set
	 */
	public void setGkId(String gkId) {
		this.gkId = gkId;
	}

	/**
	 * @return the type
	 */
	public DeviceType getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(DeviceType type) {
		this.type = type;
	}

	/**
	 * @return the status
	 */
	public DeviceStatus getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(DeviceStatus status) {
		this.status = status;
	}

	/**
	 * @return the manufacturer
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * @param manufacturer the manufacturer to set
	 */
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the cpu
	 */
	public String getCpu() {
		return cpu;
	}

	/**
	 * @param cpu the cpu to set
	 */
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	/**
	 * @return the ram
	 */
	public String getRam() {
		return ram;
	}

	/**
	 * @param ram the ram to set
	 */
	public void setRam(String ram) {
		this.ram = ram;
	}

	/**
	 * @return the hdd
	 */
	public String getHdd() {
		return hdd;
	}

	/**
	 * @param hdd the hdd to set
	 */
	public void setHdd(String hdd) {
		this.hdd = hdd;
	}

	/**
	 * @return the os
	 */
	public String getOs() {
		return os;
	}

	/**
	 * @param os the os to set
	 */
	public void setOs(String os) {
		this.os = os;
	}

	/**
	 * @return the defectDescription
	 */
	public String getDefectDescription() {
		return defectDescription;
	}

	/**
	 * @param defectDescription the defectDescription to set
	 */
	public void setDefectDescription(String defectDescription) {
		this.defectDescription = defectDescription;
	}
	
	
}
