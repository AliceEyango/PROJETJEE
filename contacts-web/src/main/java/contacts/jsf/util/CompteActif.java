package contacts.jsf.util;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import contacts.jsf.data.Compte;

@SuppressWarnings("serial")
@SessionScoped
@Named
public class CompteActif extends Compte {
	
	public boolean isLoggedIn() {
		return getPseudo() != null;
	}	
	
	public boolean isAdmin() {
		return isLoggedIn() && isFlagAdmin();
	}

	public String disconnect() {
	    UtilJsf.sessionInvalidate();
        UtilJsf.messageInfo( "Vous avez été déconnecté" );
	    return "connexion";
	}

}
