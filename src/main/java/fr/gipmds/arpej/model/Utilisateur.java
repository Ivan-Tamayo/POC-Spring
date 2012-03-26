package fr.gipmds.arpej.model;

import org.apache.commons.lang.builder.ToStringBuilder;
import javax.persistence.*;
import java.util.Date;


/**
 * Entity class which contains the information of an Utilisateur
 * @author itamayo
 *
 */
@Entity
public class Utilisateur {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	private String nom;
    private String prenom;
    private String siret;
    private String questionSecrete;
    private String reponseQuestionSecrete;
    private String raisonSociale;
    private boolean motDePassePersonnalise;
    private String motDePasseCrypte;
    private int nbSaisieMDPErrone;
    private Date dateSaisieMDP;
    private int nbConnexion;
    private Date dateDerniereConnexion;
    private int nbSaisieQuestionErrone;
    private Date dateInscription;
	
	
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
    
	
	public Long getId() {
		return id;
	}


	/**
     * This setter method should only be used in unit testing.
     */
    protected void setId(Long id) {
        this.id = id;
    }
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getSiret() {
		return siret;
	}
	public void setSiret(String siret) {
		this.siret = siret;
	}
	public String getQuestionSecrete() {
		return questionSecrete;
	}
	public void setQuestionSecrete(String questionSecrete) {
		this.questionSecrete = questionSecrete;
	}
	public String getReponseQuestionSecrete() {
		return reponseQuestionSecrete;
	}
	public void setReponseQuestionSecrete(String reponseQuestionSecrete) {
		this.reponseQuestionSecrete = reponseQuestionSecrete;
	}
	public String getRaisonSociale() {
		return raisonSociale;
	}
	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}
	public boolean isMotDePassePersonnalise() {
		return motDePassePersonnalise;
	}
	public void setMotDePassePersonnalise(boolean motDePassePersonnalise) {
		this.motDePassePersonnalise = motDePassePersonnalise;
	}
	public String getMotDePasseCrypte() {
		return motDePasseCrypte;
	}
	public void setMotDePasseCrypte(String motDePasseCrypte) {
		this.motDePasseCrypte = motDePasseCrypte;
	}
	public int getNbSaisieMDPErrone() {
		return nbSaisieMDPErrone;
	}
	public void setNbSaisieMDPErrone(int nbSaisieMDPErrone) {
		this.nbSaisieMDPErrone = nbSaisieMDPErrone;
	}
	public Date getDateSaisieMDP() {
		return dateSaisieMDP;
	}
	public void setDateSaisieMDP(Date dateSaisieMDP) {
		this.dateSaisieMDP = dateSaisieMDP;
	}
	public int getNbConnexion() {
		return nbConnexion;
	}
	public void setNbConnexion(int nbConnexion) {
		this.nbConnexion = nbConnexion;
	}
	public Date getDateDerniereConnexion() {
		return dateDerniereConnexion;
	}
	public void setDateDerniereConnexion(Date dateDerniereConnexion) {
		this.dateDerniereConnexion = dateDerniereConnexion;
	}
	public int getNbSaisieQuestionErrone() {
		return nbSaisieQuestionErrone;
	}
	public void setNbSaisieQuestionErrone(int nbSaisieQuestionErrone) {
		this.nbSaisieQuestionErrone = nbSaisieQuestionErrone;
	}
	public Date getDateInscription() {
		return dateInscription;
	}
	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}
	
}
