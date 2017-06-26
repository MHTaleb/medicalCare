
/**
 * This file was generated by the JPA Modeler
 */
package entity;

import java.io.Serializable;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * @author Taleb
 */
@Entity
public class Consultation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long              id;
    @Embedded
    private ExamenPreClinique examenPreClinique;
    @OneToOne(targetEntity = Medecin.class)
    private Medecin           medecin;
    @OneToOne(targetEntity = Patient.class)
    private Patient           patient;
    @OneToOne(targetEntity = Service.class)
    private Service           service;
    @OneToOne(targetEntity = Facture.class)
    private Facture           facture;
    @OneToMany(targetEntity = Ordonnance.class)
    private List<Ordonnance>  ordonnances;

    public ExamenPreClinique getExamenPreClinique() {
        return this.examenPreClinique;
    }

    public void setExamenPreClinique(ExamenPreClinique examenPreClinique) {
        this.examenPreClinique = examenPreClinique;
    }

    public Facture getFacture() {
        return this.facture;
    }

    public void setFacture(Facture facture) {
        this.facture = facture;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Medecin getMedecin() {
        return this.medecin;
    }

    public void setMedecin(Medecin medecin) {
        this.medecin = medecin;
    }

    public List<Ordonnance> getOrdonnances() {
        return this.ordonnances;
    }

    public void setOrdonnances(List<Ordonnance> ordonnances) {
        this.ordonnances = ordonnances;
    }

    public Patient getPatient() {
        return this.patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
