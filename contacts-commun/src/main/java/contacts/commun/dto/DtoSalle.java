package contacts.commun.dto;

import java.io.Serializable;
import java.time.LocalTime;

@SuppressWarnings("serial")
public class DtoSalle implements Serializable {

	  private int         id;
	    private String      num_salle;
	    private int	nb_place;
		
		
		// Constructeurs
	    
	    public DtoSalle() {
			super();
		}
	    
	    public DtoSalle(int id, String num_salle, int nb_place) {
			super();
			this.id = id;
			this.num_salle = num_salle;
			this.nb_place=nb_place;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getNum_salle() {
			return num_salle;
		}

		public void setNum_salle(String num_salle) {
			this.num_salle = num_salle;
		}

		public int getNb_place() {
			return nb_place;
		}

		public void setNb_place(int nb_place) {
			this.nb_place = nb_place;
		}
	    
	    
}
