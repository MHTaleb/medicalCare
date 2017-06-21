/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entity.Medecin;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Taleb
 */
@Stateless
public class MedecinFacade extends AbstractFacade<Medecin> implements MedecinFacadeLocal {

    @PersistenceContext(unitName = "DEFAULT_PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MedecinFacade() {
        super(Medecin.class);
    }

    @Override
    public Medecin findByUserNameAndPasswort(String userName, String password) {
       return  em.createNamedQuery("Medecin.FindByUserNameAndPassword",Medecin.class)
                .setParameter("email", userName)
                .setParameter("username", userName)
                .setParameter("psw", password)
                .getResultList().get(0);
    }
    
}
