package contacts.commun.dto;

import java.io.Serializable;
import java.time.LocalTime;

@SuppressWarnings("serial")
public class DtoCour implements Serializable {
	
    private int         id;
    private String      nom;
    private LocalTime	horaire;
	
	
	// Constructeurs
    
    public DtoCour() {
		super();
	}
    
    public DtoCour(int id, String nom, LocalTime horaire) {
		super();
		this.id = id;
		this.nom = nom;
		this.horaire=horaire;
	}

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

	public LocalTime getHoraire() {
		return horaire;
	}

	public void setHoraire(LocalTime horaire) {
		this.horaire = horaire;
	}
    
    
    

}
