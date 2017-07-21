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
			int hardDriveSize, String operatingSystem, String laptop_status,String defectDescription) {
		
		super(serialNumber,gkId,"LAPTOP",model,manufacturer,laptop_status,defectDescription);
		this.cpu = cpu;
		this.ramSize = ramSize;
		this.hardDriveSize = hardDriveSize;
		this.operatingSystem = operatingSystem;
	}
	
	
	/**
	 * 
	 * @param newDevice New device from the add new device form
	 */
	@Autowired
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
	public Laptop(String serialNumber, String gkId, String model, String manufacturer, String laptop_status) {
		
		super(serialNumber,gkId,model,manufacturer,laptop_status);
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




	@Override
	public String toString() {
		return "Laptop [cpu=" + cpu + ", ramSize=" + ramSize + ", hardDriveSize=" + hardDriveSize + ", operatingSystem="
				+ operatingSystem + ", toString()=" + super.toString() + "]";
	}




	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof Laptop)) {
			return false;
		}
		Laptop other = (Laptop) obj;
		if (cpu == null) {
			if (other.cpu != null) {
				return false;
			}
		} else if (!cpu.equals(other.cpu)) {
			return false;
		}
		if (hardDriveSize != other.hardDriveSize) {
			return false;
		}
		if (operatingSystem == null) {
			if (other.operatingSystem != null) {
				return false;
			}
		} else if (!operatingSystem.equals(other.operatingSystem)) {
			return false;
		}
		if (ramSize != other.ramSize) {
			return false;
		}
		return true;
	}
	
	
}
