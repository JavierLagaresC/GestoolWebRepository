package com.gestool.controller;

import com.gestool.ejb.EmpresasFacadeLocal;
import com.gestool.models.Empresas;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.Default;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;
import javax.faces.context.FacesContext;
import javax.faces.flow.FlowScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named
@ViewScoped
public class EmpresasController implements Serializable{
    
    @EJB
    private EmpresasFacadeLocal empresaEJB;   
    @Inject
    private Empresas empresa;
 
    private List<Empresas> listaEmpresas;
    
    
    @PostConstruct
    public void init(){
        //empresa = new Empresas();
        listaEmpresas = empresaEJB.findAll();
    }

    public Empresas getEmpresa() {
        return empresa;
    }

    public void setEmpresas(Empresas empresas) {
        this.empresa = empresas;
    }

    public List<Empresas> getListaEmpresas() {
        return listaEmpresas;
    }

    public void setListaEmpresas(List<Empresas> listaEmpresas) {
        this.listaEmpresas = listaEmpresas;
    }

    public EmpresasFacadeLocal getEmpresaEJB() {
        return empresaEJB;
    }

    public void setEmpresaEJB(EmpresasFacadeLocal empresaEJB) {
        this.empresaEJB = empresaEJB;
    }
    
    public void nuevaEmpresa(){
        try{
            empresaEJB.create(empresa);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso", "Empresa registrada con exito"));
        }catch(Exception e){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Aviso", "Error al crear una empresa"));        }
    }
    
}
