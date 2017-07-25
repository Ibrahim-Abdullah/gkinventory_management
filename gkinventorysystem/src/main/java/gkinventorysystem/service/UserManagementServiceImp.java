/**
 * 
 */
package gkinventorysystem.service;

import org.springframework.stereotype.Component;

/**
 * @author Ibrahim-Abdullah
 *
 */

@Component
public class UserManagementServiceImp implements UserManagementService {

	/* (non-Javadoc)
	 * @see gkinventorysystem.service.UserService#authenticate(java.lang.String, java.lang.String)
	 */
	public boolean authenticate(String userEmail, String password) {
		return false;
	}

}
