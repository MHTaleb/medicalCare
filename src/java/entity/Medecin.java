/**
 * This file was generated by the JPA Modeler
 */
package entity;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

/**
 * @author Taleb
 */
@NamedQueries(
        {
            @NamedQuery(name = "Medecin.FindByUserNameAndPassword",
                    query = " SELECT s FROM Medecin s"
                    + " WHERE (s.utilisateur.email = :email OR s.utilisateur.username = :username)"
                    + " AND s.utilisateur.password = :psw"
            )
        }
)
@Entity
public class Medecin extends Personne implements Serializable {

    @OneToOne(cascade = {CascadeType.ALL}, targetEntity = Specialite.class)
    private Specialite specialite;

    public Specialite getSpecialite() {
        return this.specialite;
    }

    public void setSpecialite(Specialite specialite) {
        this.specialite = specialite;
    }

}