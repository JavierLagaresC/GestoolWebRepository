/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gestool.models;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.enterprise.inject.Model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Usuario
 */
@Model
@Entity
@Table(name = "empresas")
public class Empresas implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "uuid")
    private String uuid;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "pagina_web")
    private String pagina_web;
    @Column(name = "nif")
    private String nif;
    @Column(name = "codigo")
    private String codigo;
    @Column(name = "administrador")
    private String administrador;
    @Column(name = "registro_mercantil")
    private String registro_mercantil;
    @Column(name = "inicio_operaciones")
    private Date inicio_operaciones;
    @Column(name = "fin_operaciones")
    private Date fin_operaciones;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPagina_web() {
        return pagina_web;
    }

    public void setPagina_web(String pagina_web) {
        this.pagina_web = pagina_web;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getAdministrador() {
        return administrador;
    }

    public void setAdministrador(String administrador) {
        this.administrador = administrador;
    }

    public String getRegistro_mercantil() {
        return registro_mercantil;
    }

    public void setRegistro_mercantil(String registro_mercantil) {
        this.registro_mercantil = registro_mercantil;
    }

    public Date getInicio_operaciones() {
        return inicio_operaciones;
    }

    public void setInicio_operaciones(Date inicio_operaciones) {
        this.inicio_operaciones = inicio_operaciones;
    }

    public Date getFin_operaciones() {
        return fin_operaciones;
    }

    public void setFin_operaciones(Date fin_operaciones) {
        this.fin_operaciones = fin_operaciones;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.id;
        hash = 47 * hash + Objects.hashCode(this.uuid);
        hash = 47 * hash + Objects.hashCode(this.nombre);
        hash = 47 * hash + Objects.hashCode(this.pagina_web);
        hash = 47 * hash + Objects.hashCode(this.nif);
        hash = 47 * hash + Objects.hashCode(this.codigo);
        hash = 47 * hash + Objects.hashCode(this.administrador);
        hash = 47 * hash + Objects.hashCode(this.registro_mercantil);
        hash = 47 * hash + Objects.hashCode(this.inicio_operaciones);
        hash = 47 * hash + Objects.hashCode(this.fin_operaciones);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empresas other = (Empresas) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.uuid, other.uuid)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.pagina_web, other.pagina_web)) {
            return false;
        }
        if (!Objects.equals(this.nif, other.nif)) {
            return false;
        }
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        if (!Objects.equals(this.administrador, other.administrador)) {
            return false;
        }
        if (!Objects.equals(this.registro_mercantil, other.registro_mercantil)) {
            return false;
        }
        if (!Objects.equals(this.inicio_operaciones, other.inicio_operaciones)) {
            return false;
        }
        if (!Objects.equals(this.fin_operaciones, other.fin_operaciones)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Empresas{" + "Id=" + id + ", uuid=" + uuid + ", nombre=" + nombre + ", pagina_web=" + pagina_web + ", nif=" + nif + ", codigo=" + codigo + ", administrador=" + administrador + ", registro_mercantil=" + registro_mercantil + ", inicio_operaciones=" + inicio_operaciones + ", fin_operaciones=" + fin_operaciones + '}';
    }
    
    
    
    
    
    
}
