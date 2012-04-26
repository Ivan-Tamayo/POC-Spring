package fr.gipmds.arpej.services.auth;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.gipmds.arpej.model.Utilisateur;
import fr.gipmds.arpej.repository.UtilisateurRepository;

@Service("userDetailsService")
@Transactional(readOnly=true)
public class CustomUserDetailsService implements UserDetailsService {

	@Resource
	private UtilisateurRepository utilisateurRepository;
	
	@Autowired
	private Assembler assembler;
	
	@Override
	public UserDetails loadUserByUsername(String input)
			throws UsernameNotFoundException {
		String[] split = input.split(":");
	    if(split.length < 3)
	    {
	        System.out.println("User did not enter nom + prenom + siret");
	        throw new UsernameNotFoundException("Must specify nom, prenom et siret");
	    }

	    String nom 		= split[0];
	    String prenom 	= split[1];
	    String siret	= split [2];

	    System.out.println("Nom = " + nom);
	    System.out.println("Prenom = " + prenom);
	    System.out.println("Siret = " + siret);

	    Utilisateur user = utilisateurRepository.findByNomAndPrenomAndSiret(nom, prenom, siret);
	    if(user == null)
	    {
	        System.out.println("User could not be found, must be an invalid username/domain combo.");
	        throw new UsernameNotFoundException("Invalid nom, prenom or siret");
	    }

	    System.out.println("Returning user: " + user);
	    return assembler.buildUserFromUserEntity(user);
	}

}
