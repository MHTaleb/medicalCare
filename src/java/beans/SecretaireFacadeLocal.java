/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entity.Secretaire;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Taleb
 */
@Local
public interface SecretaireFacadeLocal {

    void create(Secretaire secretaire);

    void edit(Secretaire secretaire);

    void remove(Secretaire secretaire);

    Secretaire find(Object id);

    List<Secretaire> findAll();

    List<Secretaire> findRange(int[] range);

    int count();

    public Secretaire findByUserNameAndPSW(String userName, String password);
    
}
