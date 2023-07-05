package pl.llasso.carservicemonitor.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.*;

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

//    @OneToMany
//    private List<ServiceType> serviceType;
//    @ManyToMany
//    private List<Vehicle> vehicle;
    @ManyToOne
    private ServiceType serviceType;
    @ManyToOne
    private Vehicle vehicle;
    @NotNull
    @Min(value = 1)
    private Long mileage;
    @NotNull
//    @Past(message = "Podana data musi być datą przeszłą")
    private String serviceDate;
    @NotNull
    @Min(value = 0)
    private Double price;
}
