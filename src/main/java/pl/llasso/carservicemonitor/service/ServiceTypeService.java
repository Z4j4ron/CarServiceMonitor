package pl.llasso.carservicemonitor.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.llasso.carservicemonitor.entities.ServiceType;
import pl.llasso.carservicemonitor.repository.ServiceTypeRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ServiceTypeService {
    private final ServiceTypeRepository serviceTypeRepository;

    public void save(ServiceType serviceType){
        serviceTypeRepository.save(serviceType);
    }

    public ServiceType findById(Long id){
        return serviceTypeRepository.findById(id).get();
    }

    public List<ServiceType> findAll(){
        return serviceTypeRepository.findAll();
    }

    public void deleteById(Long id){
        serviceTypeRepository.deleteById(id);
    }
}
