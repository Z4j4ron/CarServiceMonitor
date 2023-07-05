package pl.llasso.carservicemonitor.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private String version;
    private Integer productionYear;
    private Integer engineCapacity;

    private Long mileage;
    private String lastService;
    @ManyToMany(mappedBy = "vehicles")
    private List<User> users = new ArrayList<>();
}
