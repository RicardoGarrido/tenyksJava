package test31.model;

import javax.persistence.*;

/**
 * Created by Ingrid on 08/06/2017.
 */
@Entity
public class Ciudad {
    private Integer id;
    private String nombre;
    private String codigo;
    private Pais paisByPaisId;

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
    @Column(name = "codigo", nullable = false, length = 3)
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ciudad ciudad = (Ciudad) o;

        if (id != null ? !id.equals(ciudad.id) : ciudad.id != null) return false;
        if (nombre != null ? !nombre.equals(ciudad.nombre) : ciudad.nombre != null) return false;
        if (codigo != null ? !codigo.equals(ciudad.codigo) : ciudad.codigo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (codigo != null ? codigo.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "pais_id", referencedColumnName = "id", nullable = false)
    public Pais getPaisByPaisId() {
        return paisByPaisId;
    }

    public void setPaisByPaisId(Pais paisByPaisId) {
        this.paisByPaisId = paisByPaisId;
    }
}
