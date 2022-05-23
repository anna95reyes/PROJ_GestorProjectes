/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.milaifontanals.interficie;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anna9
 */
public class CPSingleton {
    
    private static IGestioProjectes cp;
    
    private CPSingleton(){
        
    }
    
    public static IGestioProjectes getGestorProjectes(String nomCapa) throws GestioProjectesException {
        if (cp != null) {
            return cp;
        }
        try {
            Class compo = Class.forName(nomCapa);
            cp = (IGestioProjectes) compo.newInstance();
            return cp;
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            throw new GestioProjectesException("Error en invocar getGestorEmpresa", ex);
        }
    }
    
    public static IGestioProjectes getGestorProjectes(String nomCapa, String nomFitxerPropietatsCapa) throws GestioProjectesException {
        if (cp != null) {
            return cp;     
        }
        try {
            Class classe = Class.forName(nomCapa);
            Constructor con = classe.getConstructor(String.class);
            cp = (IGestioProjectes) con.newInstance(nomFitxerPropietatsCapa);
            return cp;
        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            throw new GestioProjectesException("Error en invocar getGestorEmpresa", ex);
        }

    }
    
}
