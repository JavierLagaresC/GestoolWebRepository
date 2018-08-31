/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gestool.controller;

import com.gestool.ejb.UsuarioFacadeLocal;
import com.gestool.models.Roles;
import com.gestool.models.Usuario;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("usuarioController")
@ViewScoped
public class UsuarioController implements Serializable{
    
    @EJB
    private UsuarioFacadeLocal usuarioEJB;
    //private List<Usuario> listaUsuarios;
    
    private Usuario usuario;

    private Roles rol;

    @PostConstruct
    public void Init(){
        usuario = new Usuario();
        //listaUsuarios = usuarioEJB.findAll();
    }

    public Roles getRol() {
        return rol;
    }

    public void setRol(Roles rol) {
        this.rol = rol;
    }

    /*public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }*/
    /**
     * @return the usuarioEJB
     */
    public UsuarioFacadeLocal getUsuarioEJB() {
        return usuarioEJB;
    }

    /**
     * @param usuarioEJB the usuarioEJB to set
     */
    public void setUsuarioEJB(UsuarioFacadeLocal usuarioEJB) {
        this.usuarioEJB = usuarioEJB;
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    /*public String convertirPassword(String clave){
        clave = usuario.getPasswordUsuario();
        getMD5(clave);
        
        return clave;
    }*/
    
    public String login(){
        String redirect = null;
        Usuario us;
        rol = new Roles();
        String administrador = "Administrador";
          try{ 
            /*if(rol.getNombre().equals(administrador)){*/
               us = usuarioEJB.login(usuario);
                if(us!=null){
                   FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", us);
                   redirect = "/protegidas/lista_usuarios?faces-redirect=true"; 

                }else{
                  FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Aviso", "Usuario incorrecto"));
                    }    
            /*}else{
            us =  usuarioEJB.login(usuario);
                if(us!=null){
                   FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", us);
                   redirect = "/protegidas/principal2?faces-redirect=true"; 

                }else{
                  FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Aviso", "Usuario incorrecto"));
                    }    
            }*/
        
        }catch(Exception e){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Aviso", "Usuario incorrecto"));
        }
        return redirect;
    }
    
    public void registrar(){
        String uuid = "dasdasdad";
        String clave = usuarioEJB.getMD5(usuario.getPasswordUsuario());
        try{
            this.usuario.setUuid(uuid);
            usuario.setPasswordUsuario(clave);
            usuarioEJB.create(usuario);
        }catch(Exception e){
            
        }
    }
    
    /*public void cerrarSesion(){
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
    }*/
    
    
    
}
