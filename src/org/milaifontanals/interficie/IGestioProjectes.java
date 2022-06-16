/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.milaifontanals.interficie;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import org.milaifontanals.model.Entrada;
import org.milaifontanals.model.Estat;
import org.milaifontanals.model.Projecte;
import org.milaifontanals.model.Rol;
import org.milaifontanals.model.Tasca;
import org.milaifontanals.model.Usuari;

/**
 *
 * @author anna9
 */
public interface IGestioProjectes {
    
    public void closeCapa() throws GestioProjectesException;
    public void commit() throws GestioProjectesException;
    public void rollback() throws GestioProjectesException;
    public List<Usuari> getLlistaUsuaris() throws GestioProjectesException;
    public Usuari getUsuari(int id) throws GestioProjectesException;
    public void addUsuari(Usuari nouUsuari) throws GestioProjectesException;
    public void deleteUsuari(int id) throws GestioProjectesException;
    public void modificarUsuari(Usuari usuari) throws GestioProjectesException;
    public List<Projecte> getLlistaProjectes() throws GestioProjectesException;
    public Projecte getProjecte(int id) throws GestioProjectesException;
    public List<Projecte> getLlistaProjectesAssignats(Usuari usuari) throws GestioProjectesException;
    public List<Projecte> getLlistaProjectesNoAssignats(Usuari usuari) throws GestioProjectesException;
    public void assignarProjecte(Usuari usuari, Projecte projecte, Rol rol) throws GestioProjectesException;
    public void desassignarProjecte(Usuari usuari, Projecte projecte) throws GestioProjectesException;
    public List<Rol> getLlistaRols() throws GestioProjectesException;
    public Rol getRol(int id) throws GestioProjectesException;
    public Rol getRolAssignat (Usuari usuari, Projecte projecte) throws GestioProjectesException;
    public boolean existeixUsuari(int id) throws GestioProjectesException;
    public boolean existeixProjecte(int id) throws GestioProjectesException;
    public String hashMD5(String input) throws GestioProjectesException;
    public String Login(String login, String password) throws GestioProjectesException;
    public List<Projecte> getLlistaProjectes(String sessionId) throws GestioProjectesException;
    public List<Tasca> getLlistaTasquesAssignades (String sessionId, Integer idEstat, Integer idProjecte) throws GestioProjectesException;
    public Estat getEstat(int id) throws GestioProjectesException;
    public List<Estat> getLlistaEstats (String sessionId) throws GestioProjectesException;
    public Tasca getTasca (int id) throws GestioProjectesException;
    public List<Entrada> getLlistaEntrades (String sessionId, Integer idTasca) throws GestioProjectesException;
    public List<Usuari> getLlistaUsuaris(String sessionId) throws GestioProjectesException;
    public Entrada getEntrada (int idTasca, int idEntrada) throws GestioProjectesException;
    public Usuari getUsuari(String sessionId) throws GestioProjectesException;
    public void afegirEntrada(int idTasca, Entrada entrada) throws GestioProjectesException;
    public void modificarEntrada(int idTasca, Entrada entrada) throws GestioProjectesException;
    public Integer nextNumeracioEntrada(Integer idTasca) throws GestioProjectesException;
}
