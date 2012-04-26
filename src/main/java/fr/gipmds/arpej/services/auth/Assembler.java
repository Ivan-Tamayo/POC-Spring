package fr.gipmds.arpej.services.auth;

import java.util.ArrayList;
import java.util.Collection;
import fr.gipmds.arpej.model.Utilisateur;

import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("assembler")
public class Assembler {
	
	private String delimiter = ":";

	@Transactional(readOnly = true)
	User buildUserFromUserEntity(Utilisateur userEntity) {

		String username = 	userEntity.getNom() + delimiter 
							+ userEntity.getPrenom() + delimiter
							+ userEntity.getSiret();

		String password = userEntity.getMotDePasseCrypte();

//		boolean enabled = userEntity.getActive();
		boolean enabled = true;
		
//		boolean accountNonExpired = userEntity.getActive();
		boolean accountNonExpired = true;
		
//		boolean credentialsNonExpired = userEntity.getActive();
		boolean credentialsNonExpired = true;
		
//		boolean accountNonLocked = userEntity.getActive();
		boolean accountNonLocked = true;
		
		Collection authorities = new ArrayList();

		/*
		for (SecurityRoleEntity role : userEntity.getSecurityRoleCollection()) {

			authorities.add(new GrantedAuthorityImpl(role.getName()));

		}
		*/

		User user = new User(username, password, enabled,

		accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);

		return user;

	}

	
	public String getDelimiter() {
		return delimiter;
	}

	public void setDelimiter(String delimiter) {
		this.delimiter = delimiter;
	}
}