/**
 * 
 */
package gkinventorysystem.model;

/**
 * @author Ibrahim-Abdullah
 *
 */
public class DeviceTypes {
	private String typeName;
	private int key;
	
	
	public DeviceTypes(String typeName, int key) {
		super();
		this.typeName = typeName;
		this.key = key;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	
	
}
