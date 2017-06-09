package test31.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Ingrid on 08/06/2017.
 */
@Entity
public class Hotel {
    private Integer id;
    private String nombre;
    private String direccion;
    private String descripcion;
    private Collection<HabitacionHotel> habitacionHotelsById;
    private Ciudad ciudadByCiudadId;
    private Categoria categoriaByCategoriaId;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nombre", nullable = false, length = 50)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "direccion", nullable = false, length = 200)
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

        Hotel hotel = (Hotel) o;

        if (id != null ? !id.equals(hotel.id) : hotel.id != null) return false;
        if (nombre != null ? !nombre.equals(hotel.nombre) : hotel.nombre != null) return false;
        if (direccion != null ? !direccion.equals(hotel.direccion) : hotel.direccion != null) return false;
        if (descripcion != null ? !descripcion.equals(hotel.descripcion) : hotel.descripcion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (direccion != null ? direccion.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "hotelByHotelId")
    public Collection<HabitacionHotel> getHabitacionHotelsById() {
        return habitacionHotelsById;
    }

    public void setHabitacionHotelsById(Collection<HabitacionHotel> habitacionHotelsById) {
        this.habitacionHotelsById = habitacionHotelsById;
    }

    @ManyToOne
    @JoinColumn(name = "ciudad_id", referencedColumnName = "id", nullable = false)
    public Ciudad getCiudadByCiudadId() {
        return ciudadByCiudadId;
    }

    public void setCiudadByCiudadId(Ciudad ciudadByCiudadId) {
        this.ciudadByCiudadId = ciudadByCiudadId;
    }

    @ManyToOne
    @JoinColumn(name = "categoria_id", referencedColumnName = "id", nullable = false)
    public Categoria getCategoriaByCategoriaId() {
        return categoriaByCategoriaId;
    }

    public void setCategoriaByCategoriaId(Categoria categoriaByCategoriaId) {
        this.categoriaByCategoriaId = categoriaByCategoriaId;
    }
}
