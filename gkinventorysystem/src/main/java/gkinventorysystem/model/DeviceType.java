/**
 * 
 */
package gkinventorysystem.model;

import org.springframework.stereotype.Component;

/**
 * @author Ibrahim-Abdullah
 *
 */

@Component
public class DeviceType {
	private String type;
	private int key;
	
	public DeviceType(String type, int key){
		this.type = type;
		this.key = key;
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
	 * @return the key
	 */
	public int getKey() {
		return key;
	}

	/**
	 * @param key the key to set
	 */
	public void setKey(int key) {
		this.key = key;
	}
	
	
}

