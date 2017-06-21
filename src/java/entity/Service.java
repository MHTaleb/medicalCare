/**
 * This file was generated by the JPA Modeler
 */
package entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
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
public class Service implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Basic
    private String titre;

    @OneToOne(targetEntity = Medecin.class)
    private Medecin chef_service;

    @OneToMany(targetEntity = Medecin.class)
    private List<Medecin> medecins;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return this.titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Medecin getChef_service() {
        return this.chef_service;
    }

    public void setChef_service(Medecin chef_service) {
        this.chef_service = chef_service;
    }

    public List<Medecin> getMedecins() {
        return this.medecins;
    }

    public void setMedecins(List<Medecin> medecins) {
        this.medecins = medecins;
    }

}