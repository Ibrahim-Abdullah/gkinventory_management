/**
 * 
 */
package gkinventorysystem.forms;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import gkinventorysystem.model.DeviceGeneral;
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
	private String type;
	
	@NotNull
	private String status;
	
	@NotNull
	private String manufacturer;
	
	@NotNull
	private String model;
	
	//Laptop specific properties
	private String cpu;
	private int ram;
	private int hdd;
	private String os;
	
	//Defective device property

	private String defectDescription;

	
	
	public NewDeviceForm(){
		
	}
	
	@Autowired
	public NewDeviceForm(Laptop laptop){
		this.serialNumber = laptop.getSerialNumber();
		this.gkId = laptop.getGkLabel();
		this.type = laptop.getDeviceType();
		this.status = String.valueOf(laptop.getDeviceStatus());
		this.manufacturer = laptop.getBrand();
		this.model = laptop.getModel();
		this.cpu = laptop.getCpu();
		this.ram = laptop.getRamSize();
		this.os = laptop.getOperatingSystem();
		this.hdd = laptop.getHardDriveSize();
		
	}
	
	@Autowired
	public NewDeviceForm(DeviceGeneral device){
		this.serialNumber = device.getSerialNumber();
		this.gkId = device.getGkLabel();
		this.type = device.getDeviceType();
		this.status = String.valueOf(device.getDeviceStatus());
		this.manufacturer = device.getBrand();
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
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
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
	public int getRam() {
		return ram;
	}

	/**
	 * @param ram the ram to set
	 */
	public void setRam(int ram) {
		this.ram = ram;
	}

	/**
	 * @return the hdd
	 */
	public int getHdd() {
		return hdd;
	}

	/**
	 * @param hdd the hdd to set
	 */
	public void setHdd(int hdd) {
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
