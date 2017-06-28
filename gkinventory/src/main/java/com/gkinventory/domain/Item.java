/**
 * 
 */
package com.gkinventory.domain;

/**
 * @author Ibrahim Abdullah
 *
 */
public class Item 
{
	private String serialNumber;
	private String gkLabel;
	private typeCategory itemType;
	private String model;
	private String brand;
	private String comment;
	
	public String getSerialNumber() {
		return serialNumber;
	}
	
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public String getGkLabel() {
		return gkLabel;
	}
	
	public void setGkLabel(String gkLabel) {
		this.gkLabel = gkLabel;
	}
	
	public typeCategory getItemType() {
		return itemType;
	}
	
	public void setItemType(typeCategory itemType) {
		this.itemType = itemType;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
	
	public enum typeCategory
	{
		LAPTOP,DESKTOP,MOBILE_PHONE,KEYBOARD
	}
	public enum status
	{
		WORKING,NOT_WORKING
	}
}

