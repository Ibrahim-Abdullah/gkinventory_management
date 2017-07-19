/**
 * 
 */
package gkinventorysyatem.model;

import gkinventorysyatem.model.DeviceGeneral;
/**
 * @author Ibrahim-Abdullah
 *
 */
public class Laptop {

	private String serialNumber;
	private String gkId;
	private String model;
	private String manufacturer;
	private String cpu;
	private int ramSize;
	private int hardDriveSize;
	private String operatingSystem;
	private Status laptop_status;


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
			int hardDriveSize, String operatingSystem, Status laptop_status) {
		this.serialNumber = serialNumber;
		this.gkId = gkId;
		this.model = model;
		this.manufacturer = manufacturer;
		this.cpu = cpu;
		this.ramSize = ramSize;
		this.hardDriveSize = hardDriveSize;
		this.operatingSystem = operatingSystem;
		this.laptop_status = laptop_status;
	}


	/**
	 * @param serialNumber
	 * @param gkId
	 * @param model
	 * @param manufacturer
	 * @param laptop_status
	 */
	public Laptop(String serialNumber, String gkId, String model, String manufacturer, Status laptop_status) {
		this.serialNumber = serialNumber;
		this.gkId = gkId;
		this.model = model;
		this.manufacturer = manufacturer;
		this.laptop_status = laptop_status;
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


	/**
	 * @return the laptop_status
	 */
	public Status getLaptop_status() {
		return laptop_status;
	}


	/**
	 * @param laptop_status the laptop_status to set
	 */
	public void setLaptop_status(String laptop_status) {
		this.laptop_status = Status.valueOf(laptop_status);
	}

	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Laptop [serialNumber=" + serialNumber + ", gkId=" + gkId + ", model=" + model + ", manufacturer="
				+ manufacturer + ", cpu=" + cpu + ", ramSize=" + ramSize + ", hardDriveSize=" + hardDriveSize
				+ ", operatingSystem=" + operatingSystem + ", laptop_status=" + laptop_status + "]";
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
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
		if (gkId == null) {
			if (other.gkId != null) {
				return false;
			}
		} else if (!gkId.equals(other.gkId)) {
			return false;
		}
		if (hardDriveSize != other.hardDriveSize) {
			return false;
		}
		if (laptop_status != other.laptop_status) {
			return false;
		}
		if (manufacturer == null) {
			if (other.manufacturer != null) {
				return false;
			}
		} else if (!manufacturer.equals(other.manufacturer)) {
			return false;
		}
		if (model == null) {
			if (other.model != null) {
				return false;
			}
		} else if (!model.equals(other.model)) {
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
		if (serialNumber == null) {
			if (other.serialNumber != null) {
				return false;
			}
		} else if (!serialNumber.equals(other.serialNumber)) {
			return false;
		}
		return true;
	}



	public enum Status{
		WORKING,NOT_WORKING
	}
}
