package com.gestool.models;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
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
@Table(name = "usuarios")
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "uuid")
    private String uuid;
    @Column(name = "codigo")
    private String codigoUsuario;
    @Column(name = "nombre")
    private String nombreUsuario;
    @Column(name = "email")
    private String emailUsuario;
    @Column(name = "password")
    private String passwordUsuario;
    @Column(name = "remember_token")
    private String remember_token;
    @Column(name = "super_user")
    private int super_user;
    
    
    @OneToOne
    @JoinColumn(name = "uuid", insertable = false, updatable = false)
    private Roles rol;
    
    
    @Column(name = "created_at")
    private Date created_at;
    @Column(name = "updated_at")
    private Date updated_at;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * @param uuid the uuid to set
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * @return the super_user
     */
    public int getSuper_user() {
        return super_user;
    }

    /**
     * @param super_user the super_user to set
     */
    public void setSuper_user(int super_user) {
        this.super_user = super_user;
    }

    public Roles getRol() {
        return rol;
    }

    public void setRol(Roles rol) {
        this.rol = rol;
    }

    

    /**
     * @return the created_at
     */
    public Date getCreated_at() {
        return created_at;
    }

    /**
     * @param created_at the created_at to set
     */
    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    /**
     * @return the updated_at
     */
    public Date getUpdated_at() {
        return updated_at;
    }

    /**
     * @param updated_at the updated_at to set
     */
    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    /**
     * @return the codigoUsuario
     */
    public String getCodigoUsuario() {
        return codigoUsuario;
    }

    /**
     * @param codigoUsuario the codigoUsuario to set
     */
    public void setCodigoUsuario(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    /**
     * @return the nombreUsuario
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * @param nombreUsuario the nombreUsuario to set
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * @return the emailUsuario
     */
    public String getEmailUsuario() {
        return emailUsuario;
    }

    /**
     * @param emailUsuario the emailUsuario to set
     */
    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    /**
     * @return the passwordUsuario
     */
    public String getPasswordUsuario() {
        return passwordUsuario;
    }

    /**
     * @param passwordUsuario the passwordUsuario to set
     */
    public void setPasswordUsuario(String passwordUsuario) {
        this.passwordUsuario = passwordUsuario;
    }

    /**
     * @return the remember_token
     */
    public String getRemember_token() {
        return remember_token;
    }

    /**
     * @param remember_token the remember_token to set
     */
    public void setRemember_token(String remember_token) {
        this.remember_token = remember_token;
    }
   

    public Usuario() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + this.id;
        hash = 13 * hash + Objects.hashCode(this.uuid);
        hash = 13 * hash + Objects.hashCode(this.codigoUsuario);
        hash = 13 * hash + Objects.hashCode(this.nombreUsuario);
        hash = 13 * hash + Objects.hashCode(this.emailUsuario);
        hash = 13 * hash + Objects.hashCode(this.passwordUsuario);
        hash = 13 * hash + Objects.hashCode(this.remember_token);
        hash = 13 * hash + this.super_user;
        hash = 13 * hash + Objects.hashCode(this.rol);
        hash = 13 * hash + Objects.hashCode(this.created_at);
        hash = 13 * hash + Objects.hashCode(this.updated_at);
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
        final Usuario other = (Usuario) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.super_user != other.super_user) {
            return false;
        }
        if (!Objects.equals(this.uuid, other.uuid)) {
            return false;
        }
        if (!Objects.equals(this.codigoUsuario, other.codigoUsuario)) {
            return false;
        }
        if (!Objects.equals(this.nombreUsuario, other.nombreUsuario)) {
            return false;
        }
        if (!Objects.equals(this.emailUsuario, other.emailUsuario)) {
            return false;
        }
        if (!Objects.equals(this.passwordUsuario, other.passwordUsuario)) {
            return false;
        }
        if (!Objects.equals(this.remember_token, other.remember_token)) {
            return false;
        }
        if (!Objects.equals(this.rol, other.rol)) {
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
        return "Usuario{" + "id=" + id + ", uuid=" + uuid + ", codigoUsuario=" + codigoUsuario + ", nombreUsuario=" + nombreUsuario + ", emailUsuario=" + emailUsuario + ", passwordUsuario=" + passwordUsuario + ", remember_token=" + remember_token + ", super_user=" + super_user + ", rol=" + rol + ", created_at=" + created_at + ", updated_at=" + updated_at + '}';
    }

    

    

   

   

    
    
    
    
    
   
    
    
}
