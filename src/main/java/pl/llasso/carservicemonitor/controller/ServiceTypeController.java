package pl.llasso.carservicemonitor.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.llasso.carservicemonitor.entities.ServiceType;
import pl.llasso.carservicemonitor.service.ServiceTypeService;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ServiceTypeController {
    private final ServiceTypeService serviceTypeService;

    @GetMapping(path = "/service/form")
    String showAddServiceTypeForm(@ModelAttribute("service")ServiceType serviceType){
        return "service/add";
    }

    @RequestMapping(path = "/service/form")
    String processAddServiceTypeForm(ServiceType serviceType, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "service/add";
        }

        serviceTypeService.save(serviceType);

        return "redirect:/service/list";
    }

    @GetMapping(path = "/service/list")
    String showServiceTypeList(Model model){
        List<ServiceType> services = serviceTypeService.findAll();
        model.addAttribute("services", services);

        return "service/list";
    }
    @GetMapping(path = "/service/remove")
    String deleteById(@RequestParam Long id){serviceTypeService.deleteById(id); return "redirect:/service/list";}
}
