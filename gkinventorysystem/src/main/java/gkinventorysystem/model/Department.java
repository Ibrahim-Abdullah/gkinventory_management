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
public class Department {
	private String name;
	
	public Department(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	
	public void setName(String name){
		this.name = name;
	}
}
