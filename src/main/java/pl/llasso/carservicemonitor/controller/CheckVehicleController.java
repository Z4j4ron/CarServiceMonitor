package pl.llasso.carservicemonitor.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.llasso.carservicemonitor.entities.CheckVehicle;
import pl.llasso.carservicemonitor.entities.ServiceType;
import pl.llasso.carservicemonitor.entities.Vehicle;
import pl.llasso.carservicemonitor.event.Event;
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
    private final Event event;

    @GetMapping(path = "/check/form")
    String showAddCheckVehicleForm(@ModelAttribute("check") CheckVehicle checkVehicle){
        return "check/add";
    }

    @PostMapping(path = "/check/form")
    String processAddCheckVehicleForm(@Valid CheckVehicle checkVehicle, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "check/add";
        }
        checkVehicleService.save(checkVehicle);

        return "redirect:http://localhost:8080/vehicle/list";
    }

    @GetMapping(path = "/check/list")
    String showCheckVehicleList(Model model, @RequestParam Long id){
        Vehicle vehicle = vehicleService.findById(id);
        model.addAttribute("vehicle", vehicle);
        List<CheckVehicle> checks = checkVehicleService.findCheckVehicleByVehicleId(id);
        model.addAttribute("checks", checks);
        Double sum = event.sumAllCosts(id);
        model.addAttribute("sum",sum);

        return "check/list";
    }

    @GetMapping(path = "/check/remove")
    String deleteById(@RequestParam Long id){checkVehicleService.deleteById(id); return "redirect:/check/list";}

    @ModelAttribute("services")
    Collection<ServiceType> services(){
        return serviceTypeService.findAll();
    }

    @ModelAttribute("vehicles")
    Collection<Vehicle> vehicles(){
        return vehicleService.findAll();
    }
}
