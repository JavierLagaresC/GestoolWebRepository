package com.gestool.controller;

import com.gestool.models.Usuario;
import java.io.IOException;
import java.io.Serializable;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class PlantillaController implements Serializable{
    
    public void checkLogin(){
        try{
            
            Usuario us = (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");
            if(us == null){
                FacesContext.getCurrentInstance().getExternalContext().redirect("/GestoolEmpresa/index.xhtml");
            }
        }catch(IOException e){
            
        }
    }
    
    public void cerrarSesion(){
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
    }
    
}
