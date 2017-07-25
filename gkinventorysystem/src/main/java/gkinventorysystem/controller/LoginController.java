/**
 * 
 */
package gkinventorysystem.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import gkinventorysystem.forms.LoginForm;
import gkinventorysystem.service.UserManagementService;
import gkinventorysystem.service.UserManagementServiceImp;

/**
 * @author Ibrahim-Abdullah
 *
 */

@Controller
public class LoginController {
	
	@Autowired
	private UserManagementServiceImp userManagementService;
	
	
	@RequestMapping(value={"/","/login"}, method=RequestMethod.GET)
	public String showLoginPage(Model model){
		model.addAttribute("loginForm", new LoginForm());
		return "login";
	}
	
	/**
	 * Process user login 
	 * @param loginForm an object of the login form
	 * @param bindingResult 
	 * @return Page to show
	 */
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(@Valid LoginForm loginForm, BindingResult bindingResult,Model model){
		
		if(bindingResult.hasErrors()){
			//Show notification of invalid login
		}
		
		if(!userManagementService.authenticate(loginForm.getEmail(), loginForm.getPassword())){
			//Show notification of invalid login credentials
			return "/login";
		}
		
		//Notify user of successful login and redirect to item management page
		return "redirect:/item";
	}
}
