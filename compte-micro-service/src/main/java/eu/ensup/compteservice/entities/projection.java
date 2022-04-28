package eu.ensup.compteservice.entities;


import org.springframework.data.rest.core.config.Projection;

@Projection(name="p1", types=User.class )
public interface projection {
     String getRole();
     String getName();
}
