package eu.ensup.compteservice.web;

import eu.ensup.compteservice.entities.User;
import eu.ensup.compteservice.repositories.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserRestController {

    private UserRepository userRepository;

    public UserRestController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @GetMapping(path = "/users")
    public List<User> listUsers(){
        return userRepository.findAll();
    }

    @GetMapping(path = "/users/{id}")
    public User getUser(@PathVariable Long id){
        return userRepository.findById(id).get();
    }
    @PostMapping(path="/users")
    public User save(@RequestBody User user){
        return  userRepository.save(user);
    }
    @PutMapping(path="/users/{id}")
    public User upadte(@PathVariable Long id,@RequestBody User user){
       User userOld=  userRepository.findById(id).get();
        userOld.setName(user.getName());
        userOld.setRole(user.getRole());

        return  userRepository.save(userOld);
    }
    @DeleteMapping(path="/users/{code}")
    public void dalete(@PathVariable Long code){
        userRepository.deleteById(code);
    }
}
