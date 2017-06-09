package test31.model;

import javax.persistence.*;

/**
 * Created by Ingrid on 08/06/2017.
 */
@Entity
@Table(name = "tipo_vuelo", schema = "tenyksbbdd", catalog = "")
public class TipoVuelo {
    private Integer id;
    private String nombre;
    private String descripcion;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nombre", nullable = false, length = 30)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "descripcion", nullable = false, length = 500)
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TipoVuelo tipoVuelo = (TipoVuelo) o;

        if (id != null ? !id.equals(tipoVuelo.id) : tipoVuelo.id != null) return false;
        if (nombre != null ? !nombre.equals(tipoVuelo.nombre) : tipoVuelo.nombre != null) return false;
        if (descripcion != null ? !descripcion.equals(tipoVuelo.descripcion) : tipoVuelo.descripcion != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        return result;
    }
}
