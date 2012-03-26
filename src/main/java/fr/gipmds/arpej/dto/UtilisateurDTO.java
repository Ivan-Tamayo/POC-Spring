package fr.gipmds.arpej.dto;

import org.apache.commons.lang.builder.ToStringBuilder;

public class UtilisateurDTO {

	private Long id;
	private String nom;
    private String prenom;
    private String siret;
    private String questionSecrete;
    private String reponseQuestionSecrete;
    private String raisonSociale;
    private boolean motDePassePersonnalise;
    private String motDePasseCrypte;
	
    
    
    
	public Long getId() {
		return id;
	}




	public void setId(Long id) {
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




	@Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
