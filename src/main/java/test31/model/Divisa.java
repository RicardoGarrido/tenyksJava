package test31.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Ingrid on 08/06/2017.
 */
@Entity
public class Divisa {
    private Integer id;
    private String nombre;
    private String simbolo;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nombre", nullable = false, length = 20)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "simbolo", nullable = false, length = 10)
    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Divisa divisa = (Divisa) o;

        if (id != null ? !id.equals(divisa.id) : divisa.id != null) return false;
        if (nombre != null ? !nombre.equals(divisa.nombre) : divisa.nombre != null) return false;
        if (simbolo != null ? !simbolo.equals(divisa.simbolo) : divisa.simbolo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (simbolo != null ? simbolo.hashCode() : 0);
        return result;
    }
}
