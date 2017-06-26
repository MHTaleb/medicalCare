
/**
 * This file was generated by the JPA Modeler
 */
package entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * @author Taleb
 */
@Entity
public class Utilisateur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long      id;
    @Column(unique = true)
    @Basic
    private String    username;
    @Basic
    private String    password;
    @Column(unique = true)
    @Basic
    private String    email;
    @OneToOne(targetEntity = Categorie.class)
    private Categorie categorie;
    @OneToOne(
        targetEntity = Personne.class,
        mappedBy     = "utilisateur"
    )
    private Personne  personne;

    public Categorie getCategorie() {
        return this.categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Personne getPersonne() {
        return this.personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
