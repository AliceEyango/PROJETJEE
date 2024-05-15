package contacts.jsf.data.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import contacts.commun.dto.DtoEleve;
import contacts.commun.dto.DtoCompte;
import contacts.commun.dto.DtoParent;
import contacts.commun.dto.DtoGestionnaire;
import contacts.jsf.data.Categorie;
import contacts.jsf.data.Compte;
import contacts.jsf.data.Personne;
import contacts.jsf.data.Telephone;


@Mapper( componentModel = "cdi" )
public interface IMapper {
  

	// Compte
	
	Compte    map( DtoCompte source );
	
	DtoCompte map( Compte source );
	
	Compte duplicate( Compte source );

	Compte update( @MappingTarget Compte target, Compte source );


	// Categorie
	
	Categorie    map( DtoEleve source );
	
	DtoEleve map( Categorie source );
	
	Categorie duplicate( Categorie source );

	
	// Personne
	
	Personne    map( DtoParent source );
	
	DtoParent map( Personne source );
	
    Personne duplicate( Personne source );

	
	// Telephone
	
	Telephone    map( DtoGestionnaire source );
	
	DtoGestionnaire map( Telephone source );

    // Méthodes nécessaire pour update( Personne )

	Telephone duplicate( Telephone source );

	List<Telephone> duplicate( List<Telephone> source );

}
