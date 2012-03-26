package fr.gipmds.arpej.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import fr.gipmds.arpej.model.Utilisateur;


/**
 * Repository/DAO Utilisateur
 * Implemented by Spring Data JPA
 * @author itamayo
 *
 */
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

}
