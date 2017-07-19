/**
 * 
 */
package gkinventorysyatem.model;

/**
 * @author Ibrahim Abdullah
 *
 */
public class DeviceGeneral 
{
	private String serialNumber;
	private String gkId;
	private Type itemType;
	private String model;
	private String manufacturer;
	private String comment;
	private Status deviceStatus;
	
	/**
	 * @param serialNumber
	 * @param gkLabel
	 * @param itemType
	 * @param model
	 * @param brand
	 * @param comment
	 */
	public DeviceGeneral(String serialNumber, String gkLabel, Type itemType, String model, String brand,
			String comment,String status) {
		this.serialNumber = serialNumber;
		this.gkId = gkLabel;
		this.itemType = itemType;
		this.model = model;
		this.manufacturer = brand;
		this.comment = comment;
		this.setDeviceStatus(status);
	}
	

	/**
	 * @param serialNumber
	 * @param gkLabel
	 * @param itemType
	 * @param model
	 * @param brand
	 */
	public DeviceGeneral(String serialNumber, String gkLabel, Type itemType, String model, String brand) {
		super();
		this.serialNumber = serialNumber;
		this.gkId = gkLabel;
		this.itemType = itemType;
		this.model = model;
		this.manufacturer = brand;
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
	
	public Type getItemType() {
		return itemType;
	}
	
	public void setItemType(Type itemType) {
		this.itemType = itemType;
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
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
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
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DeviceGeneral [serialNumber=" + serialNumber + ", gkId=" + gkId + ", itemType=" + itemType + ", model="
				+ model + ", manufacturer=" + manufacturer + ", comment=" + comment + "]";
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
		if (!(obj instanceof DeviceGeneral)) {
			return false;
		}
		DeviceGeneral other = (DeviceGeneral) obj;
		if (comment == null) {
			if (other.comment != null) {
				return false;
			}
		} else if (!comment.equals(other.comment)) {
			return false;
		}
		if (gkId == null) {
			if (other.gkId != null) {
				return false;
			}
		} else if (!gkId.equals(other.gkId)) {
			return false;
		}
		if (itemType != other.itemType) {
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
		if (serialNumber == null) {
			if (other.serialNumber != null) {
				return false;
			}
		} else if (!serialNumber.equals(other.serialNumber)) {
			return false;
		}
		return true;
	}

	public enum Type
	{
		DESKTOP,MOBILE_PHONE,KEYBOARD_MOUSE,MOUSE,KEYBOARD
	}
	public enum Status
	{
		WORKING,NOT_WORKING
	}
}

