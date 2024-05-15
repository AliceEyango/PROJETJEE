package contacts.ejb.service.standard;

import static javax.ejb.TransactionAttributeType.NOT_SUPPORTED;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.inject.Inject;

import contacts.commun.dto.DtoEleve;
import contacts.commun.exception.ExceptionValidation;
import contacts.commun.service.IServiceCategorie;
import contacts.ejb.dao.IDaoCategorie;
import contacts.ejb.dao.IDaoPersonne;
import contacts.ejb.data.Categorie;
import contacts.ejb.data.mapper.IMapperEjb;

@Stateless
@Remote
public class ServiceCategorie implements IServiceCategorie {

	// Champs
	@Inject
	private IMapperEjb mapper;
	@Inject
	private IDaoCategorie daoCategorie;
	@Inject
	private IDaoPersonne daoPersonne;

	// Actions

	@Override
	public int inserer(DtoEleve dtoCategorie) throws ExceptionValidation {
		verifierValiditeDonnees(dtoCategorie);
		int id = daoCategorie.inserer(mapper.map(dtoCategorie));
		return id;
	}

	@Override
	public void modifier(DtoEleve dtoCategorie) throws ExceptionValidation {
		verifierValiditeDonnees(dtoCategorie);
		daoCategorie.modifier(mapper.map(dtoCategorie));
	}

	@Override
	public void supprimer(int idCategorie) throws ExceptionValidation {
		if (daoPersonne.compterPourCategorie(idCategorie) != 0) {
			throw new ExceptionValidation("La catégorie n'est pas vide");
		}
		daoCategorie.supprimer(idCategorie);
	}

	@Override
	@TransactionAttribute(NOT_SUPPORTED)
	public DtoEleve retrouver(int idCategorie) {
		return mapper.map(daoCategorie.retrouver(idCategorie));
	}

	@Override
	@TransactionAttribute(NOT_SUPPORTED)
	public List<DtoEleve> listerTout() {
		List<DtoEleve> liste = new ArrayList<>();
		for (Categorie categorie : daoCategorie.listerTout()) {
			liste.add(mapper.map(categorie));
		}
		return liste;
	}

	// Méthodes auxiliaires

	private void verifierValiditeDonnees(DtoEleve dtoCategorie) throws ExceptionValidation {

		StringBuilder message = new StringBuilder();

		if (dtoCategorie.getLibelle() == null || dtoCategorie.getLibelle().isEmpty()) {
			message.append("\nLe libellé est absent.");
		} else if (dtoCategorie.getLibelle().length() < 3) {
			message.append("\nLe libellé est trop court.");
		} else if (dtoCategorie.getLibelle().length() > 25) {
			message.append("\nLe libellé est trop long.");
		}

		if (message.length() > 0) {
			throw new ExceptionValidation(message.toString().substring(1));
		}
	}

}
