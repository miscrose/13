package com.example.tp13.ws;
import com.example.tp13.entities.Compte;
import com.example.tp13.repositories.CompteRepository;
import jakarta.jws.WebMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.tp13.enums.TypeCompte;


import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Component
@WebService(serviceName = "BanqueWS")
public class CompteSoapService {

    @Autowired
    private CompteRepository compteRepository;

    @WebMethod
    public List<Compte> getComptes() {
        return compteRepository.findAll();
    }
    @WebMethod
    public Compte createCompte(@WebParam(name = "solde") double solde,
                               @WebParam(name = "type") TypeCompte type) {
        Compte compte = new Compte(null, solde, LocalDate.now(), type);
        return compteRepository.save(compte);
    }

    @WebMethod
    public Compte getCompteById(@WebParam(name = "id") Long id) {
        return compteRepository.findById(id).orElse(null);
    }



    @WebMethod
    public boolean deleteCompte(@WebParam(name = "id") Long id) {
        if (compteRepository.existsById(id)) {
            compteRepository.deleteById(id);
            return true;
        }
        return false;
    }
}