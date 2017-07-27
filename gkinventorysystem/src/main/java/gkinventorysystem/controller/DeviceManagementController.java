/**
 * 
 */
package gkinventorysystem.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import gkinventorysystem.converter.DepartmentStringConverter;
import gkinventorysystem.converter.DeviceSatusStringConverter;
import gkinventorysystem.converter.DeviceTypeStringConverter;
import gkinventorysystem.converter.PermissionStringConverter;
import gkinventorysystem.forms.NewDeviceForm;
import gkinventorysystem.model.Department;
import gkinventorysystem.model.DeviceGeneral;
import gkinventorysystem.model.DeviceStatus;
import gkinventorysystem.model.DeviceType;
import gkinventorysystem.model.Laptop;
import gkinventorysystem.model.Permission;
import gkinventorysystem.service.DeviceManagementService;
import gkinventorysystem.service.DeviceManagementServiceImp;
import gkinventorysystem.service.LaptopManagementService;
import gkinventorysystem.service.LaptopManagementServiceImp;

/**
 * @author Ibrahim-Abdullah
 *
 */

@Controller
@RequestMapping(value = "/device")
public class DeviceManagementController {

	@Autowired
	private DeviceManagementServiceImp deviceManagementService;
	@Autowired
	private LaptopManagementServiceImp laptopManagementService;

	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(DeviceType.class, new DeviceTypeStringConverter());
		binder.registerCustomEditor(DeviceStatus.class, new DeviceSatusStringConverter());
	}
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
		//model.addAttribute("deviceTypeList", this.getDeviceTypes());
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
	public String getAllDevice(@PathVariable("deviceType") String deviceType,
			@PathVariable("deviceSerialNumber") String deviceSerialNumber, Model model) {

		if (deviceType.equalsIgnoreCase("laptop")) {
			Laptop laptop = laptopManagementService.getLaptopBySerialNumber(deviceSerialNumber);
			
			if(laptop == null){
				//Show notification that device does not exist
				
				return "redirect:/device";
			}
			model.addAttribute("device", laptop);
			return "viewdevice";
		}

		DeviceGeneral device = deviceManagementService.getDeviceBySerialNumber(deviceSerialNumber);
		
		if(device == null){
			//Show notification that device does not exist
			
			return "redirect:/device";			
		}
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

		model.addAttribute("newDeviceForm", new NewDeviceForm());
		model.addAttribute("deviceTypeList", this.getDeviceTypes());
		model.addAttribute("deviceStatusList",this.getDeviceStatus());
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
			//model.addAttribute("newDeviceForm", newDeviceForm);
			return "addnewdevice";
		}

		if (newDeviceForm.getType().getType().equalsIgnoreCase("laptop")) {

			Laptop newLaptop = new Laptop(newDeviceForm);
			boolean isLaptopAdded = laptopManagementService.addNewLaptop(newLaptop);

			if (isLaptopAdded) {
				// Show notification of device added

				return "redirect:/device";
			}
			// Show notification of device not added
			//model.addAttribute("newDeviceForm", newDeviceForm);
			return "addnewdevice";
		}

		DeviceGeneral otherDeviceType = new DeviceGeneral(newDeviceForm);
		boolean isDeviceAdded = deviceManagementService.addNewDevice(otherDeviceType);

		if (isDeviceAdded) {
			// Show notification of successful addition of item
			return "redirect:/device";
		}

		// Show notification unsuccessful addition of device
		//model.addAttribute("newDeviceForm", newDeviceForm);
		return "addnewdevice";
	}

	/**
	 * Display the edit device form with the details of the device pre-filled
	 * 
	 * @return
	 */
	@RequestMapping(value = "/edit/{deviceType}/{deviceSerialNumber}", method = RequestMethod.GET)
	public String showEditDeviceForm(@PathVariable("deviceType") String deviceType,
			@PathVariable("deviceSerialNumber") String deviceSerialNumber, Model model) {

		if (deviceType.equalsIgnoreCase("laptop")) {
			Laptop laptop = laptopManagementService.getLaptopBySerialNumber(deviceSerialNumber);
			model.addAttribute("newDeviceForm", new NewDeviceForm(laptop));

			return "editdevice";
		}

		DeviceGeneral device = deviceManagementService.getDeviceBySerialNumber(deviceSerialNumber);

		model.addAttribute("device", new NewDeviceForm(device));
		return "editdevice";
	}

	
	
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String editDevice(@Valid NewDeviceForm editedDevice, BindingResult bindingResult, Model model) {

		if (editedDevice.getType().getType().equalsIgnoreCase("laptop")) {

			Laptop editedLaptop = new Laptop(editedDevice);
			boolean isLaptopEdited = laptopManagementService.editLaptop(editedLaptop);

			if (isLaptopEdited) {

				// Show notification that Laptop has been added successfully
				return "redirect:/device";
			}

			model.addAttribute("editedDevice", editedDevice);
			return "editdevice";
		}
		// Process form input
		DeviceGeneral device = new DeviceGeneral(editedDevice);

		boolean isEditedDeviceSaved = deviceManagementService.editDevice(device);

		if (isEditedDeviceSaved) {
			// Show notification of successful edit of item
			return "redirect:/device";
		}

		// Show notification unsuccessful edit of device
		model.addAttribute("editedDevice", device);
		return "editdevice";
	}
	
	


	@RequestMapping(value = "/delete/{deviceType}/{deviceSerialNumber}", method = RequestMethod.POST)
	public String deleteDevice(@PathVariable("deviceType") String deviceType,
			@PathVariable("deviceSerialNumber") String deviceSerialNumber, Model model) {

		if (deviceType.equalsIgnoreCase("laptop")) {
			boolean isLaptopDeleted = laptopManagementService.deleteLaptopBySerialNumber(deviceSerialNumber);

			if (isLaptopDeleted) {
				// Show notification of item deleted
				return "redirect:/device";
			}

			// Show notification of item not deleted
			return "redirect:/device";
		}

		boolean isDeviceDeleted = deviceManagementService.deleteDeviceBySerialNumber(deviceSerialNumber);

		if (isDeviceDeleted) {
			// Show notification of successful delete of item
			return "redirect:/device";
		}

		// Show notification unsuccessful deletion of device
		return "redirect:/device";
	}


	
	@RequestMapping(value = "/assign/{deviceType}/{deviceSerialNumber}", method = RequestMethod.GET)
	public String assignDevice(@PathVariable("deviceType") String deviceType,
			@PathVariable("deviceSerialNumber") String deviceSerialNumber, Model model) {

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
	
	@RequestMapping(value="/unassign/{deviceType}/{devicegkId}", method = RequestMethod.GET)
	public String unassignDevice(@PathVariable("deviceTye")String deviceType, @PathVariable("devicegkId")String devicegkId){
		
		return "";
	}
	
	private List<DeviceType> getDeviceTypes() {
		List<DeviceType> deviceTypes = new ArrayList<DeviceType>();
		deviceTypes.add(new DeviceType("Select Device Type", -1));
		deviceTypes.add(new DeviceType("Laptop", 1));
		deviceTypes.add(new DeviceType("Desktop", 2));
		deviceTypes.add(new DeviceType("Keyboard and Mouse", 3));
		deviceTypes.add(new DeviceType("Only Keyboard", 4));
		deviceTypes.add(new DeviceType("Only Mouse", 5));
		deviceTypes.add(new DeviceType("Mobile Phone", 6));

		return deviceTypes;
	}
	
	private List<DeviceStatus> getDeviceStatus() {
		List<DeviceStatus> status = new ArrayList<DeviceStatus>();
		status.add(new DeviceStatus("Select Device Status", -1));
		status.add(new DeviceStatus("Working", 1));
		status.add(new DeviceStatus("Defective", 2));
		return status;
	}
}
