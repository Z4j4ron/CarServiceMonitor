package pl.llasso.carservicemonitor.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.llasso.carservicemonitor.entities.Vehicle;
import pl.llasso.carservicemonitor.service.VehicleService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class VehicleController {
    private final VehicleService vehicleService;

    @GetMapping(path = "/vehicle/form")
    String showAddVehicleForm(@ModelAttribute("vehicle") Vehicle vehicle){
        return "vehicle/add";
    }

    @PostMapping(path = "/vehicle/form")
    String processAddVehicleForm(Vehicle vehicle, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "vehicle/add";
        }

        vehicleService.save(vehicle);

        return "redirect:/vehicle/list";
    }
    @GetMapping(path = "/vehicle/list")
    String showVehicleList(Model model){
        List<Vehicle> vehicles = vehicleService.findAll();
        model.addAttribute("vehicles", vehicles);

        return "vehicle/list";
    }

    @GetMapping(path = "/vehicle/edit")
    String showVehicleEditForm(@RequestParam Long id, Model model){
        Vehicle vehicle = vehicleService.findById(id);
        model.addAttribute("vehicle", vehicle);

        return "vehicle/edit";
    }

    @PostMapping(path = "/vehicle/edit")
    String processVehicleEditForm(Vehicle vehicle){
        vehicleService.save(vehicle);
        return "redirect:/vehicle/list";
    }

    @GetMapping(path = "/vehicle/remove")
    String deleteById(@RequestParam Long id){
        vehicleService.deleteById(id);
        return "redirect:/vehicle/list";
    }
}
