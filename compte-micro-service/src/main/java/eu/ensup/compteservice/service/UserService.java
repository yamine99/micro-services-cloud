package eu.ensup.compteservice.service;

public interface UserService {
    void virement(Long codeSource,Long codeDestination, double montant);


}
