package com.Web;

import com.entities.Compte;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.repositories.CompteRepository;

import java.util.Date;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com")
@EntityScan(basePackages = "com/entities") // Active la recherche des entités JPA

public class Tp6Application {

    public static void main(String[] args) {
        SpringApplication.run(Tp6Application.class, args);
    }

    @Bean
    public CommandLineRunner initData(CompteRepository compteRepository) {
        return args -> {
            // Ajout de données de compte initiales
            Compte compte1 = new Compte();
            compte1.setSolde(1500.0);
            compte1.setDateCreation(new Date());
            compte1.setType(Compte.typeCompte.EPARGNE);
            compte1.setEtat(Compte.etatCompte.BLOQUE);

            Compte compte2 = new Compte();
            compte2.setSolde(2000.0);
            compte2.setDateCreation(new Date());
            compte2.setType(Compte.typeCompte.EPARGNE);
            compte2.setEtat(Compte.etatCompte.ACTIVE);

            Compte compte3 = new Compte();
            compte3.setSolde(3000.0);
            compte3.setDateCreation(new Date());
            compte3.setType(Compte.typeCompte.COURANT);
            compte3.setEtat(Compte.etatCompte.SUSPENDU);
            Compte compte4 = new Compte();
            compte4.setSolde(60000.0);
            compte4.setDateCreation(new Date());
            compte4.setType(Compte.typeCompte.EPARGNE);
            compte4.setEtat(Compte.etatCompte.ACTIVE);

            // Sauvegarde des comptes dans le référentiel
            compteRepository.save(compte1);
            compteRepository.save(compte2);
            compteRepository.save(compte3);

            // Affichage des soldes des comptes enregistrés dans la console
            compteRepository.findAll().forEach(compte -> System.out.println(" compte #" + compte.getId() + ": " +
                    "  Type de compte:  " + compte.getType() + "  Etat de compte:  " + compte.getEtat() +
                    "  Solde du compte :" + compte.getSolde()));
        };
    }
}
