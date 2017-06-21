/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entity.Consultation;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Taleb
 */
@Stateless
public class ConsultationFacade extends AbstractFacade<Consultation> implements ConsultationFacadeLocal {

    @PersistenceContext(unitName = "DEFAULT_PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ConsultationFacade() {
        super(Consultation.class);
    }
    
}
