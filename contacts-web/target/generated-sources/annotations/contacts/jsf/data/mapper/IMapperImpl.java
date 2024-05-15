package contacts.jsf.data.mapper;

import contacts.commun.dto.DtoCompte;
import contacts.commun.dto.DtoEleve;
import contacts.commun.dto.DtoGestionnaire;
import contacts.commun.dto.DtoParent;
import contacts.jsf.data.Categorie;
import contacts.jsf.data.Compte;
import contacts.jsf.data.Personne;
import contacts.jsf.data.Telephone;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.enterprise.context.ApplicationScoped;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-14T00:11:31+0200",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 1.4.100.v20220318-0906, environment: Java 17.0.8 (Eclipse Adoptium)"
)
@ApplicationScoped
public class IMapperImpl implements IMapper {

    @Override
    public Compte map(DtoCompte source) {
        if ( source == null ) {
            return null;
        }

        Compte compte = new Compte();

        compte.setEmail( source.getEmail() );
        compte.setId( source.getId() );
        compte.setMotDePasse( source.getMotDePasse() );
        compte.setPseudo( source.getPseudo() );

        return compte;
    }

    @Override
    public DtoCompte map(Compte source) {
        if ( source == null ) {
            return null;
        }

        DtoCompte dtoCompte = new DtoCompte();

        dtoCompte.setEmail( source.getEmail() );
        if ( source.getId() != null ) {
            dtoCompte.setId( source.getId() );
        }
        dtoCompte.setMotDePasse( source.getMotDePasse() );
        dtoCompte.setPseudo( source.getPseudo() );

        return dtoCompte;
    }

    @Override
    public Compte duplicate(Compte source) {
        if ( source == null ) {
            return null;
        }

        Compte compte = new Compte();

        compte.setEmail( source.getEmail() );
        compte.setFlagAdmin( source.isFlagAdmin() );
        compte.setId( source.getId() );
        compte.setMotDePasse( source.getMotDePasse() );
        compte.setPseudo( source.getPseudo() );

        return compte;
    }

    @Override
    public Compte update(Compte target, Compte source) {
        if ( source == null ) {
            return target;
        }

        target.setEmail( source.getEmail() );
        target.setFlagAdmin( source.isFlagAdmin() );
        target.setId( source.getId() );
        target.setMotDePasse( source.getMotDePasse() );
        target.setPseudo( source.getPseudo() );

        return target;
    }

    @Override
    public Categorie map(DtoEleve source) {
        if ( source == null ) {
            return null;
        }

        Categorie categorie = new Categorie();

        categorie.setId( source.getId() );

        return categorie;
    }

    @Override
    public DtoEleve map(Categorie source) {
        if ( source == null ) {
            return null;
        }

        DtoEleve dtoEleve = new DtoEleve();

        if ( source.getId() != null ) {
            dtoEleve.setId( source.getId() );
        }

        return dtoEleve;
    }

    @Override
    public Categorie duplicate(Categorie source) {
        if ( source == null ) {
            return null;
        }

        Categorie categorie = new Categorie();

        categorie.setDebut( source.getDebut() );
        categorie.setId( source.getId() );
        categorie.setLibelle( source.getLibelle() );

        return categorie;
    }

    @Override
    public Personne map(DtoParent source) {
        if ( source == null ) {
            return null;
        }

        Personne personne = new Personne();

        personne.setId( source.getId() );
        personne.setNom( source.getNom() );
        personne.setPrenom( source.getPrenom() );

        return personne;
    }

    @Override
    public DtoParent map(Personne source) {
        if ( source == null ) {
            return null;
        }

        DtoParent dtoParent = new DtoParent();

        if ( source.getId() != null ) {
            dtoParent.setId( source.getId() );
        }
        dtoParent.setNom( source.getNom() );
        dtoParent.setPrenom( source.getPrenom() );

        return dtoParent;
    }

    @Override
    public Personne duplicate(Personne source) {
        if ( source == null ) {
            return null;
        }

        Personne personne = new Personne();

        personne.setCategorie( duplicate( source.getCategorie() ) );
        personne.setId( source.getId() );
        personne.setNom( source.getNom() );
        personne.setPrenom( source.getPrenom() );
        personne.setTelephones( duplicate( source.getTelephones() ) );

        return personne;
    }

    @Override
    public Telephone map(DtoGestionnaire source) {
        if ( source == null ) {
            return null;
        }

        Telephone telephone = new Telephone();

        telephone.setId( source.getId() );

        return telephone;
    }

    @Override
    public DtoGestionnaire map(Telephone source) {
        if ( source == null ) {
            return null;
        }

        DtoGestionnaire dtoGestionnaire = new DtoGestionnaire();

        if ( source.getId() != null ) {
            dtoGestionnaire.setId( source.getId() );
        }

        return dtoGestionnaire;
    }

    @Override
    public Telephone duplicate(Telephone source) {
        if ( source == null ) {
            return null;
        }

        Telephone telephone = new Telephone();

        telephone.setId( source.getId() );
        telephone.setLibelle( source.getLibelle() );
        telephone.setNumero( source.getNumero() );

        return telephone;
    }

    @Override
    public List<Telephone> duplicate(List<Telephone> source) {
        if ( source == null ) {
            return null;
        }

        List<Telephone> list = new ArrayList<Telephone>( source.size() );
        for ( Telephone telephone : source ) {
            list.add( duplicate( telephone ) );
        }

        return list;
    }
}
