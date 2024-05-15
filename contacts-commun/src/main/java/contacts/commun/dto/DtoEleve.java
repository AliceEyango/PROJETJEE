package contacts.commun.dto;

import java.io.Serializable;
import java.time.LocalDate;


@SuppressWarnings("serial")
public class DtoEleve implements Serializable {
    
    // Champs
    
    private int         id;
    private String      nom;
    private String       prenom;
    private LocalDate	datenaiss;
	private String etablissement;
	private DtoCour	cour; 
	
	// Constructeurs
    
    public DtoEleve() {
		super();
	}
    
    public DtoEleve(int id, String nom, String prenom, LocalDate datenaiss, String etablissement, DtoCour cour) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom=prenom;
		this.datenaiss=datenaiss;
		this.etablissement=etablissement;
		this.cour=cour;
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

	public LocalDate getDatenaiss() {
		return datenaiss;
	}

	public void setDatenaiss(LocalDate datenaiss) {
		this.datenaiss = datenaiss;
	}

	public String getEtablissement() {
		return etablissement;
	}

	public void setEtablissement(String etablissement) {
		this.etablissement = etablissement;
	}

	public DtoCour getCour() {
		return cour;
	}

	public void setCour(DtoCour cour) {
		this.cour = cour;
	}

   
}
