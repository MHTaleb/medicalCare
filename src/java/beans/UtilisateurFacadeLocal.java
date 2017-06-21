/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entity.Utilisateur;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Taleb
 */
@Local
public interface UtilisateurFacadeLocal {

    void create(Utilisateur utilisateur);

    void edit(Utilisateur utilisateur);

    void remove(Utilisateur utilisateur);

    Utilisateur find(Object id);

    List<Utilisateur> findAll();

    List<Utilisateur> findRange(int[] range);

    int count();

    public Long doLogin(String username, String password);
    
}
