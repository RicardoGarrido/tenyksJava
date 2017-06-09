package test31.model;

import javax.persistence.*;

/**
 * Created by Ingrid on 08/06/2017.
 */
@Entity
public class Pais {
    private Integer id;
    private String nombre;
    private Continente continenteByContinenteId;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pais pais = (Pais) o;

        if (id != null ? !id.equals(pais.id) : pais.id != null) return false;
        if (nombre != null ? !nombre.equals(pais.nombre) : pais.nombre != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "continente_id", referencedColumnName = "id", nullable = false)
    public Continente getContinenteByContinenteId() {
        return continenteByContinenteId;
    }

    public void setContinenteByContinenteId(Continente continenteByContinenteId) {
        this.continenteByContinenteId = continenteByContinenteId;
    }
}
