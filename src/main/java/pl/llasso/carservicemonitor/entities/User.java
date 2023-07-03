package pl.llasso.carservicemonitor.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    @Id
//    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
//    @Setter(AccessLevel.NONE)
    private String password;
    private String email;
    @ManyToMany
    private List<Vehicle> vehicles = new ArrayList<>();


}
