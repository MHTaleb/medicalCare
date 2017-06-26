
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package beans;

import javax.ejb.Stateless;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entity.Investigation;

/**
 *
 * @author Taleb
 */
@Stateless
public class InvestigationFacade extends AbstractFacade<Investigation> implements InvestigationFacadeLocal {
    @PersistenceContext(unitName = "DEFAULT_PU")
    private EntityManager em;

    public InvestigationFacade() {
        super(Investigation.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
