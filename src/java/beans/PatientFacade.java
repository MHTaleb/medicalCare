/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entity.Patient;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Taleb
 */
@Stateless
public class PatientFacade extends AbstractFacade<Patient> implements PatientFacadeLocal {

    @PersistenceContext(unitName = "DEFAULT_PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PatientFacade() {
        super(Patient.class);
    }

    @Override
    public Patient findByUserId(Object id) {
        try {
            Patient patient = (Patient) em.createNamedQuery("Personne.findByUtilisateur").setParameter("utilisateurID", id).getSingleResult();
            return patient;
            
        } catch (Exception e) {
            return null;
        }
    }

   
}
