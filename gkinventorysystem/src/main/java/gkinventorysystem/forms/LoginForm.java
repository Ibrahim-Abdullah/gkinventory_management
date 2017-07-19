/**
 * 
 */
package gkinventorysystem.forms;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author Ibrahim-Abdullah
 *
 */
public class LoginForm {
	
	@NotNull
	@Email
	private String email;
	
	@NotNull
	@Size(min=5,max=50,message="Password should contain at least 6 characters")
	private String password;

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
}
