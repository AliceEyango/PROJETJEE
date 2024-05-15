package contacts.ejb.data.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import contacts.commun.dto.DtoEleve;
import contacts.commun.dto.DtoCompte;
import contacts.commun.dto.DtoParent;
import contacts.commun.dto.DtoGestionnaire;
import contacts.ejb.data.Categorie;
import contacts.ejb.data.Compte;
import contacts.ejb.data.Personne;
import contacts.ejb.data.Telephone;

 
@Mapper( componentModel = "cdi" )
public interface IMapperEjb {  
	
	static final IMapperEjb INSTANCE = Mappers.getMapper( IMapperEjb.class );
	
	
	// Compte
	
	Compte map( DtoCompte source );
	
	DtoCompte map( Compte source );

	
	// Categorie
	
	Categorie map( DtoEleve source );
	
	DtoEleve map( Categorie source );

	
	// Personne
	
	Personne map( DtoParent source );
	
	DtoParent map( Personne source );

	@Mapping( target="categorie", ignore = true )
	@Mapping( target="telephones", ignore = true )
	DtoParent mapMinimal( Personne source );
	
	
	// Telephone
	
	@Mapping( target="personne", ignore=true )
	Telephone map( DtoGestionnaire source );
	
	DtoGestionnaire map( Telephone source );
	

	// Méthodes auxiliaires
	
    @AfterMapping
    public default void addBackReference(@MappingTarget Personne target) {
        for (Telephone telephone : target.getTelephones() ) {
        	telephone.setPersonne( target );
        }
    }	
	
}
