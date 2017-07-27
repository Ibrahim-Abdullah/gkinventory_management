/**
 * 
 */
package gkinventorysystem.converter;

import java.beans.PropertyEditorSupport;

import org.springframework.stereotype.Component;

import gkinventorysystem.model.Department;
import gkinventorysystem.model.Permission;

/**
 * @author Ibrahim-Abdullah
 *
 */
@Component
public class PermissionStringConverter extends PropertyEditorSupport{

	// This will be called when user HTTP Post to server a field bound to
	public void setAsText(String permissionId) {
		Permission permit;
		switch (Integer.parseInt(permissionId)) {
		case 1:
			permit = new Permission("User",1);
			break;
		case 2:
			permit = new Permission("Not User",2);
			break;
		default:
			permit = null;
		}

		this.setValue(permit);
	}

}
