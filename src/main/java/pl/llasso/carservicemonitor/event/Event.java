package pl.llasso.carservicemonitor.event;

import lombok.AllArgsConstructor;
import pl.llasso.carservicemonitor.entities.CheckVehicle;
import pl.llasso.carservicemonitor.repository.CheckVehicleRepository;
import pl.llasso.carservicemonitor.service.CheckVehicleService;

import java.util.Collection;
import java.util.List;

@AllArgsConstructor
public class Event {
    private final CheckVehicleService checkVehicleService;

    public Double sumAllCosts(Long id){
        List<CheckVehicle> checks = checkVehicleService.findCheckVehicleByVehicleId(id);
        Double sum = 0.;
        for (CheckVehicle p: checks) {
            sum = sum + p.getPrice();
        }
        return sum;
    }


}
