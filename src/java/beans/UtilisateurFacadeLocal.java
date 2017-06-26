
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package beans;

import java.util.List;

import javax.ejb.Local;

import entity.Utilisateur;

/**
 *
 * @author Taleb
 */
@Local
public interface UtilisateurFacadeLocal {
    int count();

    void create(Utilisateur utilisateur);

    public Long doLogin(String username, String password);

    void edit(Utilisateur utilisateur);

    Utilisateur find(Object id);

    List<Utilisateur> findAll();

    List<Utilisateur> findRange(int[] range);

    void remove(Utilisateur utilisateur);
}


//~ Formatted by Jindent --- http://www.jindent.com
