/**
 * 
 */
package gkinventorysystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import gkinventorysystem.model.DeviceGeneral;
import gkinventorysystem.service.DeviceManagementService;

/**
 * @author Ibrahim-Abdullah
 *
 */

@Controller
@RequestMapping(value="/device")
public class DeviceManagementController {
	
	@Autowired
	private DeviceManagementService deviceManagementService;
	
	
	/**
	 * Process the display of list of all devices
	 * @param model
	 * @return device Management view
	 */
	@RequestMapping(method=RequestMethod.GET)
	public String getAllDevice(Model model){
		
		List<DeviceGeneral> listOfAllDevice = deviceManagementService.getAllDevice();
		
		model.addAttribute("allDevices",listOfAllDevice);
		return "deviceManagement";
	}
	
	
	/**
	 * Process the display if the details of the a device given the serial number
	 * @param deviceSerialNumber The serial number of the device to be deleted
	 * @param model Store the device to view
	 * @return The view to show afterwards
	 */
	@RequestMapping(value="/view/{deviceSerialNumber}", method=RequestMethod.GET)
	public String getAllDevice(@PathVariable("deviceSerialNumber") String deviceSerialNumber, Model model){
		
		DeviceGeneral device = deviceManagementService.getDeviceBySerialNumber(deviceSerialNumber);
		
		model.addAttribute("device",device);
		return "viewdevice";
	}
	
	
	/**
	 * Display add new device form 
	 * @return add new device form view
	 */
	@RequestMapping(value="/newdevice", method=RequestMethod.GET)
	public String showAddNewDeviceForm(){
		return "addnewdevice";
	}
	
	
	/**
	 * Process the addition of new device 
	 * @param device New device to be added
	 * @return 
	 */
	@RequestMapping(value="/newdevice", method=RequestMethod.POST)
	public String addNewDevice(DeviceGeneral device){
		
		//Process form input
		boolean isDeviceAdded = deviceManagementService.addNewDevice(device);
		
		if(isDeviceAdded){
			//Show notification of successful addition of item
			return "redirect:/device";
		}
		
		//Show notification unsuccessful addition of device
		return "addnewdevice";
	}
	
	/**
	 * Display the edit device form with the details of the device pre-filled
	 * @return
	 */
	@RequestMapping(value="/editDevice/{deviceSerialNumber}", method=RequestMethod.GET)
	public String showEditDeviceForm(@PathVariable("deviceSerialNumber") String deviceSerialNumber,Model model){
		
		DeviceGeneral device = deviceManagementService.getDeviceBySerialNumber(deviceSerialNumber);
		
		model.addAttribute("device",device);
		return "editDevice";
	}
	
	/**
	 * Process editing device properties
	 * @param editedDevice Device with edited properties
	 * @return View to show afterwards
	 */
	@RequestMapping(value="/editdevice", method=RequestMethod.POST)
	public String editDevice(DeviceGeneral editedDevice){
		
		//Process form input
		boolean isEditedDeviceSaved = deviceManagementService.editDevice(editedDevice);
		
		if(isEditedDeviceSaved){
			//Show notification of successful edit of item
			return "redirect:/device";
		}
		
		//Show notification unsuccessful edit of device
		return "editdevice";
	}
	
	/**
	 * Process the deletion of device
	 * @param deviceSerialNumber Serial number of the item to be deleted
	 * @param model
	 * @return View to show after the deletion
	 */
	@RequestMapping(value="/delete/{deviceSerialNumber}", method=RequestMethod.POST)
	public String editDevice(@PathVariable("deviceSerialNumber") String deviceSerialNumber, Model model){
		
		//Process form input
		boolean isEditedDeviceSaved = deviceManagementService.deleteDeviceBySerialNumber(deviceSerialNumber);
		
		if(isEditedDeviceSaved){
			//Show notification of successful delete of item
			return "redirect:/device";
		}
		
		//Show notification unsuccessful deletion  of device
		return "redirect:/device";
	}
}
