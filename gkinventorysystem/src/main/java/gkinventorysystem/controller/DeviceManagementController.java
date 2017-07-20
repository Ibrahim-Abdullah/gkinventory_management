/**
 * 
 */
package gkinventorysystem.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import gkinventorysystem.forms.NewDeviceForm;
import gkinventorysystem.model.DeviceGeneral;
import gkinventorysystem.model.Laptop;
import gkinventorysystem.service.DeviceManagementService;
import gkinventorysystem.service.LaptopManagementService;

/**
 * @author Ibrahim-Abdullah
 *
 */

@Controller
@RequestMapping(value = "/device")
public class DeviceManagementController {

	@Autowired
	private DeviceManagementService deviceManagementService;
	@Autowired
	private LaptopManagementService laptopManagementService;

	/**
	 * Process the display of list of all devices
	 * 
	 * @param model
	 * @return device Management view
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String getAllDevice(Model model) {

		List<DeviceGeneral> listOfAllDevice = deviceManagementService.getAllDevice();

		model.addAttribute("allDevices", listOfAllDevice);
		return "devicemanagement";
	}

	/**
	 * Process the display if the details of the a device given the serial
	 * number
	 * 
	 * @param deviceSerialNumber
	 *            The serial number of the device to be deleted
	 * @param model
	 *            Store the device to view
	 * @return The view to show afterwards
	 */
	@RequestMapping(value = "/view/{deviceType}/{deviceSerialNumber}", method = RequestMethod.GET)
	public String getAllDevice(@PathVariable("deviceType") String deviceType,@PathVariable("deviceSerialNumber") String deviceSerialNumber, Model model) {

		
		if(deviceType.equalsIgnoreCase("laptop")){
			Laptop laptop = laptopManagementService.getLaptopBySerialNumber(deviceSerialNumber);
			
			model.addAttribute("device",laptop);
			return "viewdevice";
		}
		
		DeviceGeneral device = deviceManagementService.getDeviceBySerialNumber(deviceSerialNumber);
		model.addAttribute("device", device);
		return "viewdevice";
	}

	/**
	 * Display add new device form
	 * 
	 * @return add new device form view
	 */
	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public String showAddNewDeviceForm(Model model) {
		
		model.addAttribute("newDeviceForm",new NewDeviceForm());
		return "addnewdevice";
	}

	/**
	 * Process the addition of new device
	 * 
	 * @param device
	 *            New device to be added
	 * @return
	 */
	@RequestMapping(value = "/new", method = RequestMethod.POST)
	public String addNewDevice(@Valid NewDeviceForm newDeviceForm, BindingResult bindingResult, Model model) {

		// Process form input
		if (bindingResult.hasErrors()) {

			// Show notification that device could not be add
			model.addAttribute("newDeviceForm",newDeviceForm);
			return "addnewdevice";
		}
		
		if (newDeviceForm.getType().equalsIgnoreCase("laptop")) {
			
			Laptop newLaptop = new Laptop(newDeviceForm);
			boolean isLaptopAdded = laptopManagementService.addNewLaptop(newLaptop);

			if (isLaptopAdded) {
				// Show notification of device added

				return "redirect:/device";
			}
			// Show notification of device not added
			model.addAttribute("newDeviceForm", newDeviceForm);
			return "addnewdevice";
		}
		
		DeviceGeneral otherDeviceType = new DeviceGeneral(newDeviceForm);
		boolean isDeviceAdded = deviceManagementService.addNewDevice(otherDeviceType);

		if (isDeviceAdded) {
			// Show notification of successful addition of item
			return "redirect:/device";
		}

		// Show notification unsuccessful addition of device
		model.addAttribute("newDeviceForm", newDeviceForm);
		return "addnewdevice";
	}

	/**
	 * Display the edit device form with the details of the device pre-filled
	 * 
	 * @return
	 */
	@RequestMapping(value = "/edit/{deviceType}/{deviceSerialNumber}", method = RequestMethod.GET)
	public String showEditDeviceForm(@PathVariable("deviceSerialNumber") String deviceSerialNumber, Model model) {

		DeviceGeneral device = deviceManagementService.getDeviceBySerialNumber(deviceSerialNumber);

		model.addAttribute("device", device);
		return "editdevice";
	}

	/**
	 * Process editing device properties
	 * 
	 * @param editedDevice
	 *            Device with edited properties
	 * @return View to show afterwards
	 */
	@RequestMapping(value = "/edit/{deviceType}", method = RequestMethod.POST)
	public String editDevice(DeviceGeneral editedDevice) {

		// Process form input
		boolean isEditedDeviceSaved = deviceManagementService.editDevice(editedDevice);

		if (isEditedDeviceSaved) {
			// Show notification of successful edit of item
			return "redirect:/device";
		}

		// Show notification unsuccessful edit of device
		return "editdevice";
	}

	/**
	 * Process the deletion of device
	 * 
	 * @param deviceSerialNumber
	 *            Serial number of the item to be deleted
	 * @param model
	 * @return View to show after the deletion
	 */
	@RequestMapping(value = "/delete/{deviceSerialNumber}", method = RequestMethod.POST)
	public String editDevice(@PathVariable("deviceSerialNumber") String deviceSerialNumber, Model model) {

		// Process form input
		boolean isEditedDeviceSaved = deviceManagementService.deleteDeviceBySerialNumber(deviceSerialNumber);

		if (isEditedDeviceSaved) {
			// Show notification of successful delete of item
			return "redirect:/device";
		}

		// Show notification unsuccessful deletion of device
		return "redirect:/device";
	}

	/**
	 * Process the assignment of a device to an emplyee
	 * 
	 * @param deviceSerialNumber
	 *            device serial number
	 * @param model
	 *            model to hold the device properties
	 * @return
	 */
	@RequestMapping(value = "/assign/{deviceSerialNumber}", method = RequestMethod.GET)
	public String assignDevice(@PathVariable("deviceSerialNumber") String deviceSerialNumber, Model model) {

		// boolean isDeviceAssignedToEmployee =
		// deviceManagementService.assginDeviceToEmployee(deviceSerialNumber);

		/**
		 * if(!isDeviceAssignedToEmployee){ //Show notification that device
		 * could not be assigned to the employee return "redirect:/device"; }
		 * 
		 * //Show notification that device has been assigned to employee return
		 * "redirect:/device";
		 **/
		return "";
	}
}
