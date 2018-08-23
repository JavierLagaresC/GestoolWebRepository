/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gestool.ejb;

import com.gestool.models.Usuario;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Usuario
 */
@Stateless
public class UsuarioFacade extends AbstractFacade<Usuario> implements UsuarioFacadeLocal {

    @PersistenceContext(unitName = "GestoolPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioFacade() {
        super(Usuario.class);
    }
    
    @Override
    public Usuario login(Usuario us){
        Usuario usuario = null;
        String consulta;
        String clave = getMD5(us.getPasswordUsuario());
        try{
            consulta = "SELECT u FROM Usuario u WHERE u.nombreUsuario = ?1 and u.passwordUsuario = ?2";
            Query query = em.createQuery(consulta);
            query.setParameter(1, us.getNombreUsuario());
            query.setParameter(2, clave);
            System.out.println(clave);
            List<Usuario> lista = query.getResultList();
            if(!lista.isEmpty()){
                usuario = lista.get(0); 
            }
            System.out.println(query);

        }catch(Exception e){
         throw e;   
        }
        return usuario;
    }
    
    @Override
    public String getMD5(String input) {
            try {
                MessageDigest md = MessageDigest.getInstance("MD5");
                byte[] messageDigest = md.digest(input.getBytes());
                BigInteger number = new BigInteger(1, messageDigest);
                String hashtext = number.toString(16);

                while (hashtext.length() < 32) {
                    hashtext = "0" + hashtext;
                }
                 return hashtext;
                }
                catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(e);
                }
         }

    

    
    
    
    
}
