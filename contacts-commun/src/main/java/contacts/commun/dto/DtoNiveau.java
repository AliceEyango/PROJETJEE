package contacts.commun.dto;

import java.io.Serializable;
import java.time.LocalTime;

@SuppressWarnings("serial")
public class DtoNiveau implements Serializable {
	
	  private int         id;
	    private String      nom;
	    
		
		
		// Constructeurs
	    
	    public DtoNiveau() {
			super();
		}
	    
	    public DtoNiveau(int id, String nom) {
			super();
			this.id = id;
			this.nom = nom;
		
		}

}
