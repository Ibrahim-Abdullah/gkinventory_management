/**
 * 
 */
package gkinventorysystem.model;

import org.springframework.stereotype.Component;

/**
 * @author Ibrahim-Abdullah
 *
 */

public class Department {
	private String name;
	private int key;
	
	public Department(int key, String name){
		this.name = name;
		this.key = key;
	}
	
	public String getName(){
		return this.name;
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

	public void setName(String name){
		this.name = name;
	}
}
