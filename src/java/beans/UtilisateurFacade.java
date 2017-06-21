/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entity.Utilisateur;
import java.util.Iterator;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Taleb
 */
@Stateless
public class UtilisateurFacade extends AbstractFacade<Utilisateur> implements UtilisateurFacadeLocal {

    @PersistenceContext(unitName = "DEFAULT_PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UtilisateurFacade() {
        super(Utilisateur.class);
    }

    @Override
    public Long doLogin(String username, String password) {
        List<Utilisateur> utilisateurs = findAll();
        for (Utilisateur utilisateur : utilisateurs) {
            if (    (utilisateur.getUsername().equals(username)
                    || utilisateur.getEmail().equals(username))
                        && utilisateur.getPassword().equals(password)) {
                return utilisateur.getId();
            }
        }
        return Long.valueOf(-1);
    }

}
