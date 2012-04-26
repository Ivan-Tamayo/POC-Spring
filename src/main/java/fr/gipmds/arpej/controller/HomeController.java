package fr.gipmds.arpej.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.gipmds.arpej.model.Utilisateur;
import fr.gipmds.arpej.repository.UtilisateurRepository;

/**
 * @author itamayo
 */
@Controller
public class HomeController {

	@Resource
	private UtilisateurRepository utilisateurRepository;
    protected static final String HOME_VIEW = "home";

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showPage(ModelMap model) {
    	model.addAttribute("users", utilisateurRepository.findAll());
    	model.addAttribute("userFound", utilisateurRepository.findByNomAndPrenomAndSiret("TEST-diane", "ARPEJ", "123456789"));
        return HOME_VIEW;
    }
}
