package eu.ensup.compteservice.repositories;

import eu.ensup.compteservice.entities.User;
import eu.ensup.compteservice.enums.TypeUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<User,Long> {
        @RestResource(path = "/byType")
        List<User> findByRole(@PathVariable(value="role") TypeUser typeUser);

        public User getUsersByName(String name);

        public User findByName(String name);
}
