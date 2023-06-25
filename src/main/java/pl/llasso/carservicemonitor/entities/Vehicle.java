package pl.llasso.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@RequiredArgsConstructor
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String brand;
    private String model;
    private LocalDateTime productionYear;
    private Integer engine;
    private Long mileage;
    private LocalDateTime lastService;
    @ManyToMany(mappedBy = "vehicles")
    private List<User> users = new ArrayList<>();


}
