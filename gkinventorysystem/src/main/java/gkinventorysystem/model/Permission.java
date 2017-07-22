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
public class Permission {
	private String permission;

	public Permission(String permission) {
		super();
		this.permission = permission;
	}

	/**
	 * @return the permission
	 */
	public String getPermission() {
		return permission;
	}

	/**
	 * @param permission the permission to set
	 */
	public void setPermission(String permission) {
		this.permission = permission;
	}
	
	
}
