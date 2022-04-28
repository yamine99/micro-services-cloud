package eu.ensup.compteservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import eu.ensup.compteservice.enums.TypeUser;

import javax.persistence.*;
import java.util.Date;


@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String name;
    private String password;
    private String email;

    private Date dateCreation;
    @Enumerated(EnumType.STRING)
    private TypeUser role;
}
