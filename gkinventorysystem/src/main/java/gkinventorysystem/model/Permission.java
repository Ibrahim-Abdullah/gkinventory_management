/**
 * 
 */
package gkinventorysystem.model;

import org.springframework.stereotype.Component;

/**
 * @author Ibrahim-Abdullah
 *
 */

public class Permission {
	private String permission;
	private int key;

	public Permission(String permission, int key) {
		super();
		this.permission = permission;
		this.key = key;
	}

	/**
	 * @return the permission
	 */
	public String getPermission() {
		return permission;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	/**
	 * @param permission the permission to set
	 */
	public void setPermission(String permission) {
		this.permission = permission;
	}
	
	
}
