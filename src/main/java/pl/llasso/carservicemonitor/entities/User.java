package pl.llasso.carservicemonitor.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
    @NotNull
    @Size(min = 5, max = 30, message = "Nazwa musi zawierać przynajmniej 5 znaków.")
    private String name;
//    @Setter(AccessLevel.NONE)
    @NotNull
    @Size(min = 5, max = 60, message = "Hasło musi zawierać przynajmniej 5 znaków.")
    private String password;
    private String email;
    @ManyToMany
    private List<Vehicle> vehicles = new ArrayList<>();


}
