package contacts.commun.service;

import java.util.List;

import contacts.commun.dto.DtoEleve;
import contacts.commun.exception.ExceptionValidation;


public interface IServiceCategorie {
	
	int		inserer( DtoEleve dtoCategorie ) throws ExceptionValidation;

	void	modifier( DtoEleve dtoCategorie ) throws ExceptionValidation;

	void	supprimer( int idCategorie ) throws ExceptionValidation;

	DtoEleve	retrouver( int idCategorie );

	List<DtoEleve>	listerTout();

}
