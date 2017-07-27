/**
 * 
 */
package gkinventorysystem.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import gkinventorysystem.forms.NewDeviceForm;
import gkinventorysystem.model.DeviceGeneral;
/**
 * @author Ibrahim-Abdullah
 *
 */

@Component
public class Laptop extends DeviceGeneral{

	private String cpu;
	private int ramSize;
	private int hardDriveSize;
	private String operatingSystem;


	/**
	 * @param serialNumber
	 * @param gkId
	 * @param model
	 * @param manufacturer
	 * @param cpu
	 * @param ramSize
	 * @param hardDriveSize
	 * @param operatingSystem
	 * @param laptop_status
	 */
	public Laptop(String serialNumber, String gkId, String model, String manufacturer, String cpu, int ramSize,
			int hardDriveSize, String operatingSystem, DeviceStatus laptop_status,String defectDescription) {
		
		super(serialNumber,gkId,new DeviceType("laptop",1),model,manufacturer,laptop_status,defectDescription);
		this.cpu = cpu;
		this.ramSize = ramSize;
		this.hardDriveSize = hardDriveSize;
		this.operatingSystem = operatingSystem;
	}
	
	public Laptop(String serialNumber, String gkId, String model, String manufacturer, String cpu, int ramSize,
			int hardDriveSize, String operatingSystem, DeviceStatus laptop_status) {
		
		super(serialNumber,gkId,new DeviceType("laptop",1),model,manufacturer,laptop_status);
		this.cpu = cpu;
		this.ramSize = ramSize;
		this.hardDriveSize = hardDriveSize;
		this.operatingSystem = operatingSystem;
	}
	/**
	 * 
	 * @param newDevice New device from the add new device form
	 */
	public Laptop(NewDeviceForm newDevice){
		super(newDevice.getSerialNumber(),newDevice.getGkId(),newDevice.getType(),newDevice.getModel(),newDevice.getManufacturer(),newDevice.getStatus(),newDevice.getDefectDescription());
		
		this.cpu = newDevice.getCpu();
		this.ramSize = newDevice.getRam();
		this.hardDriveSize = newDevice.getHdd();
		this.operatingSystem = newDevice.getOs();
	}


	/**
	 * @param serialNumber
	 * @param gkId
	 * @param model
	 * @param manufacturer
	 * @param laptop_status
	 */
	public Laptop(String serialNumber, String gkId, String model, String manufacturer, DeviceStatus laptop_status) {
		
		super(serialNumber,gkId,new DeviceType("laptop",1),model,manufacturer,laptop_status);
	}
	public Laptop(){
		
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
	 * @return the ramSize
	 */
	public int getRamSize() {
		return ramSize;
	}


	/**
	 * @param ramSize the ramSize to set
	 */
	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}


	/**
	 * @return the hardDriveSize
	 */
	public int getHardDriveSize() {
		return hardDriveSize;
	}


	/**
	 * @param hardDriveSize the hardDriveSize to set
	 */
	public void setHardDriveSize(int hardDriveSize) {
		this.hardDriveSize = hardDriveSize;
	}


	/**
	 * @return the operatingSystem
	 */
	public String getOperatingSystem() {
		return operatingSystem;
	}


	/**
	 * @param operatingSystem the operatingSystem to set
	 */
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	
}
