
package com.gestool.models;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.enterprise.inject.Typed;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "roles")
public class Roles implements Serializable{
    
       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
       private int id;
       
       @OneToOne(mappedBy = "rol", cascade = CascadeType.ALL)
       @JoinColumn(name = "rol", insertable = false, updatable = false)
       private Usuario uuid;
       
       @Column(name = "nombre")
       private String nombre;
       
       
       @OneToOne
       @JoinColumn(name = "uuid", insertable = false, updatable = false)
       private Permisos permiso_uuid;
       
       @Column(name = "created_at")
       private Date created_at;
       @Column(name = "updated_at")
       private Date updated_at;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUuid() {
       return uuid;
    }

    public void setUuid(Usuario uuid) {
        this.uuid = uuid;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Permisos getPermiso_uuid() {
        return permiso_uuid;
    }

    public void setPermiso_uuid(Permisos permiso_uuid) {
        this.permiso_uuid = permiso_uuid;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + this.id;
        hash = 43 * hash + Objects.hashCode(this.uuid);
        hash = 43 * hash + Objects.hashCode(this.nombre);
        hash = 43 * hash + Objects.hashCode(this.permiso_uuid);
        hash = 43 * hash + Objects.hashCode(this.created_at);
        hash = 43 * hash + Objects.hashCode(this.updated_at);
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
        final Roles other = (Roles) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.uuid, other.uuid)) {
            return false;
        }
        if (!Objects.equals(this.permiso_uuid, other.permiso_uuid)) {
            return false;
        }
        if (!Objects.equals(this.created_at, other.created_at)) {
            return false;
        }
        if (!Objects.equals(this.updated_at, other.updated_at)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Roles{" + "id=" + id + ", uuid=" + uuid + ", nombre=" + nombre + ", permiso_uuid=" + permiso_uuid + ", created_at=" + created_at + ", updated_at=" + updated_at + '}';
    }

   

    

    
       
    
}
