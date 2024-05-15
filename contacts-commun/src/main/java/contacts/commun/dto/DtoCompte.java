package contacts.commun.dto;

import java.io.Serializable;


@SuppressWarnings("serial")
public class DtoCompte implements Serializable  {

	
	// Champs
	
	private int			id;
	
	private String		pseudo;
	
	private String		motDePasse;
	
	private String		email;
	
	private boolean		flagGestionnaire;
	
	private boolean flagParent;
	
	
	// Constructeurs
	
	public DtoCompte() {
	}

	public DtoCompte(int id, String pseudo, String motDePasse, String email, boolean flagGestionnaire, boolean flagParent ) {
		this.id = id;
		this.pseudo = pseudo;
		this.motDePasse = motDePasse;
		this.email = email;
		this.flagGestionnaire = flagGestionnaire;
		this.flagParent = flagParent;
		
	}
	
	
	// Getters & setters

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isFlagParent() {
		return flagParent;
	}
	
	public void setFlagParent(boolean flagParent) {
		this.flagParent = flagParent;
	}

	public boolean isFlagGestionnaire() {
		return flagGestionnaire;
	}

	public void setFlagGestionnaire(boolean flagGestionnaire) {
		this.flagGestionnaire = flagGestionnaire;
	}
	
	

}
