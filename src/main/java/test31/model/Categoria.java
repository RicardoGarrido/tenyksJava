package test31.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Ingrid on 08/06/2017.
 */
@Entity
public class Categoria {
    private Integer id;
    private String nombre;
    private Collection<Hotel> hotelsById;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Categoria categoria = (Categoria) o;

        if (id != null ? !id.equals(categoria.id) : categoria.id != null) return false;
        if (nombre != null ? !nombre.equals(categoria.nombre) : categoria.nombre != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "categoriaByCategoriaId")
    public Collection<Hotel> getHotelsById() {
        return hotelsById;
    }

    public void setHotelsById(Collection<Hotel> hotelsById) {
        this.hotelsById = hotelsById;
    }
}
