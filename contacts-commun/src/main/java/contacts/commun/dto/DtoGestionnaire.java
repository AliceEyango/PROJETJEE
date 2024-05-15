package contacts.commun.dto;

import java.io.Serializable;


@SuppressWarnings("serial")
public class DtoGestionnaire implements Serializable {

	
	// Champs

	private int				id;

	private String			nom;

	private String			prenom;
	
	private String email;
	
	
	// Constructeurs
	
	public DtoGestionnaire() {
	}
	
	public DtoGestionnaire(int id, String nom, String prenom, String email) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this. email =  email;
		
	}


	// Getters & setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
    
  
}
