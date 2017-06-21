/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entity.Secretaire;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Taleb
 */
@Stateless
public class SecretaireFacade extends AbstractFacade<Secretaire> implements SecretaireFacadeLocal {

    @PersistenceContext(unitName = "DEFAULT_PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SecretaireFacade() {
        super(Secretaire.class);
    }

    @Override
    public Secretaire findByUserNameAndPSW(String userName, String password) {
        List resultList = em.createNamedQuery("Secretaire.Connect")
                .setParameter("email", userName)
                .setParameter("username", userName)
                .setParameter("psw", password)
                .getResultList();
        if (resultList == null) {
            return null;
        }
        if(resultList.size()>0) return (Secretaire) resultList.get(0);
         return null;
    }
    
}
