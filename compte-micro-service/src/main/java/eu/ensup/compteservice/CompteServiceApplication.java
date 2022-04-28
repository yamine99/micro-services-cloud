package eu.ensup.compteservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CompteServiceApplication {

    public static void main(String[] args) {

        System.out.println(System.getProperty("user.home"));
        SpringApplication.run(CompteServiceApplication.class, args);
    }
/*
    @Bean
    CommandLineRunner start(UserRepository userRepository, RepositoryRestConfiguration restConfiguration){
        return args -> {
            restConfiguration.exposeIdsFor(User.class);
          userRepository.save(new User(null,"Eric",new Date(), TypeUser.Directeur));
            userRepository.save(new User(null,"Dany",new Date(), TypeUser.Responsable));
            userRepository.save(new User(null,"Bobo",new Date(), TypeUser.Responsable));
             userRepository.findAll().forEach(cp->{
                System.out.println(cp.getRole());
                System.out.println(cp.getRole());
            });
        };
    }
*/
}
