package pl.llasso.carservicemonitor.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.llasso.carservicemonitor.entities.User;
import pl.llasso.carservicemonitor.entities.Vehicle;
import pl.llasso.carservicemonitor.service.VehicleService;

@Controller
@RequiredArgsConstructor
public class VehicleFormController {
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
}
