/**
 * 
 */
package com.gkinventory.controller;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import com.gkinventory.controller.LoginController;;
/**
 * @author Ibrahim-Abdullah
 *
 */
public class LoginControllerTest {

	/**
	 * Test method for {@link com.gkinventory.controller.LoginController#loadLoginpage()}.
	 */
	@Test
	public void testLoadLoginpage() throws Exception{
		LoginController loginController = new LoginController();
		MockMvc mockMvc = standaloneSetup(loginController).build();
		mockMvc.perform(get("/")).andExpect(status().isOk()).andExpect(view().name("login"));
		
	}

}
