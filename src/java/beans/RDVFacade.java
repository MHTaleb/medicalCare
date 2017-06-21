/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entity.Patient;
import entity.RDV;
import java.time.LocalDate;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Taleb
 */
@Stateless
public class RDVFacade extends AbstractFacade<RDV> implements RDVFacadeLocal {

    @PersistenceContext(unitName = "DEFAULT_PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RDVFacade() {
        super(RDV.class);
    }

    @Override
    public List<RDV> findByDate(LocalDate date) {
        return em.createNamedQuery("RDV.findByDate")
                 .setParameter("dateRDV", date)
                 .getResultList();
    }

    @Override
    public List<RDV> findByDateAndPatient(LocalDate date, Patient patient) {
         return em.createNamedQuery("RDV.findByPatientAndDate")
                 .setParameter("patientID",patient.getId())
                 .setParameter("dateRDV", date)
                 .getResultList();
    }

    @Override
    public Integer getRDVCountByPatient(Patient p) {
       return  Integer.parseInt(""+ em.createNamedQuery("RVD.findCountByPatient")
               .setParameter("patientId", p.getId())
               .getSingleResult());
    }

    @Override
    public List<RDV> findByValidation(boolean isValid) {
         return  em.createNamedQuery("RVD.findByValidation")
                 .setParameter("isValid", isValid)
                 .getResultList();
    }

    
    
}
