package pl.llasso.carservicemonitor.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.llasso.carservicemonitor.entities.CheckVehicle;
import pl.llasso.carservicemonitor.entities.ServiceType;
import pl.llasso.carservicemonitor.entities.Vehicle;
import pl.llasso.carservicemonitor.service.CheckVehicleService;
import pl.llasso.carservicemonitor.service.ServiceTypeService;
import pl.llasso.carservicemonitor.service.VehicleService;

import java.util.Collection;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class CheckVehicleController {
    private final CheckVehicleService checkVehicleService;
    private final VehicleService vehicleService;
    private final ServiceTypeService serviceTypeService;

    @GetMapping(path = "/check/form")
    String showAddCheckVehicleForm(@ModelAttribute("check") ServiceType serviceType){
        return "check/add";
    }

    @RequestMapping(path = "/check/form")
    String processAddCheckVehicleForm(CheckVehicle checkVehicle, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "check/add";
        }
        checkVehicleService.save(checkVehicle);

        return "redirect:/check/list";
    }

    @GetMapping(path = "/check/list")
    String showCheckVehicleList(Model model){
        List<CheckVehicle> checks = checkVehicleService.findAll();
        model.addAttribute("checks", checks);

        return "check/list";
    }

    @ModelAttribute("services")
    Collection<ServiceType> services(){
        return serviceTypeService.findAll();
    }

    @ModelAttribute("vehicles")
    Collection<Vehicle> vehicles(){
        return vehicleService.findAll();
    }
}
