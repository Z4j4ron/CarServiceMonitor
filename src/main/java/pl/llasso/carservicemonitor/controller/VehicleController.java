package pl.llasso.carservicemonitor.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.llasso.carservicemonitor.entities.Vehicle;
import pl.llasso.carservicemonitor.service.VehicleService;

import java.time.LocalDateTime;

@RestController
@RequiredArgsConstructor
public class VehicleController {
    private final VehicleService vehicleService;

    @PostMapping(path = "/vehicle")
    void showVehicle(@RequestParam String brand, @RequestParam String version,
                       @RequestParam String productionYear, @RequestParam String engineCapacity, @RequestParam String mileage,
                       @RequestParam String lastService){
        Vehicle vehicle = new Vehicle();
        vehicle.setBrand(brand);
        vehicle.setVersion(version);
        vehicle.setProductionYear(Integer.parseInt(productionYear));
        vehicle.setEngineCapacity(Integer.parseInt(engineCapacity));
        vehicle.setMileage(Long.parseLong(mileage));
        vehicle.setLastService(LocalDateTime.parse(lastService));

        vehicleService.save(vehicle);
    }
}
