package contacts.commun.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@SuppressWarnings("serial")
public class DtoParent implements Serializable {
	
	
	// Champs
	
	private int				id;
	
	private String			nom;
	
	private String			prenom;
	
	private String         mode_de_paiement;
	
	private int         nombre_de_paiement;
	
	private Double         solde_restant_a_payer;
	
	//private DtoCategorie	categorie;
	
	//private List<DtoTelephone>	telephones = new ArrayList<>();
	
	
	// Constructeurs
	
	public DtoParent() {
	}

	public DtoParent(int id, String nom, String prenom, String  mode_de_paiement, int nombre_de_paiement, Double solde_restant_a_payer ) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.mode_de_paiement = mode_de_paiement;
		this.nombre_de_paiement = nombre_de_paiement;
		this.solde_restant_a_payer = solde_restant_a_payer;
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

	public String getMode_de_paiement() {
		return mode_de_paiement;
	}

	public void setMode_de_paiement(String mode_de_paiement) {
		this.mode_de_paiement = mode_de_paiement;
	}

	public int getNombre_de_paiement() {
		return nombre_de_paiement;
	}

	public void setNombre_de_paiement(int nombre_de_paiement) {
		this.nombre_de_paiement = nombre_de_paiement;
	}

	public Double getSolde_restant_a_payer() {
		return solde_restant_a_payer;
	}

	public void setSolde_restant_a_payer(Double solde_restant_a_payer) {
		this.solde_restant_a_payer = solde_restant_a_payer;
	}

	

}
