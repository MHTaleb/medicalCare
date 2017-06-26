
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package beans;

import java.util.Iterator;
import java.util.List;

import javax.ejb.Stateless;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entity.Utilisateur;

/**
 *
 * @author Taleb
 */
@Stateless
public class UtilisateurFacade extends AbstractFacade<Utilisateur> implements UtilisateurFacadeLocal {
    @PersistenceContext(unitName = "DEFAULT_PU")
    private EntityManager em;

    public UtilisateurFacade() {
        super(Utilisateur.class);
    }

    @Override
    public Long doLogin(String username, String password) {
        List<Utilisateur> utilisateurs = findAll();

        for (Utilisateur utilisateur : utilisateurs) {
            if ((utilisateur.getUsername().equals(username) || utilisateur.getEmail().equals(username))
                    && utilisateur.getPassword().equals(password)) {
                return utilisateur.getId();
            }
        }

        return Long.valueOf(-1);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
