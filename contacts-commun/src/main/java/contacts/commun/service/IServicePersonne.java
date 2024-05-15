package contacts.commun.service;

import java.util.List;

import contacts.commun.dto.DtoParent;
import contacts.commun.exception.ExceptionValidation;


public interface IServicePersonne {
	
	int				inserer( DtoParent dtoPersonne ) throws ExceptionValidation;
	
	void			modifier( DtoParent dtoPersonne ) throws ExceptionValidation;
	
	void			supprimer( int idPersonne ) throws ExceptionValidation;
	
	DtoParent 	retrouver( int idPersonne );
	
	List<DtoParent> listerTout();
	

}
