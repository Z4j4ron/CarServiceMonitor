package pl.llasso.carservicemonitor.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CheckVehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    private List<ServiceType> serviceType;
    @ManyToMany
    private List<Vehicle> vehicle;
    private Long mileage;
    private Long price;
}
