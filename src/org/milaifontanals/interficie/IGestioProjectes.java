/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.milaifontanals.interficie;

import java.util.List;
import org.milaifontanals.model.Projecte;
import org.milaifontanals.model.Usuari;

/**
 *
 * @author anna9
 */
public interface IGestioProjectes {
    
    public void closeCapa() throws GestioProjectesException;
    public void commit() throws GestioProjectesException;
    public void rollback() throws GestioProjectesException;
    
}
