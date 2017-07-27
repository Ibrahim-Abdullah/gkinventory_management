/**
 * 
 */
package gkinventorysystem.model;

/**
 * @author Ibrahim-Abdullah
 *
 */
public class DeviceStatus {
	private String status;
	private int key;
	
	public DeviceStatus(String status, int key){
		this.status = status;
		this.key = key;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}
	
}
