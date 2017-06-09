package test31.model;

import javax.persistence.*;

/**
 * Created by Ingrid on 08/06/2017.
 */
@Entity
@Table(name = "habitacion_hotel", schema = "tenyksbbdd", catalog = "")
public class HabitacionHotel {
    private Integer id;
    private Integer precio;
    private String descripcion;
    private Hotel hotelByHotelId;
    private TipoHabitacion tipoHabitacionByTipoHabitacionId;
    private Divisa divisaByDivisaId;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "precio", nullable = false)
    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
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

        HabitacionHotel that = (HabitacionHotel) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (precio != null ? !precio.equals(that.precio) : that.precio != null) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (precio != null ? precio.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "hotel_id", referencedColumnName = "id", nullable = false)
    public Hotel getHotelByHotelId() {
        return hotelByHotelId;
    }

    public void setHotelByHotelId(Hotel hotelByHotelId) {
        this.hotelByHotelId = hotelByHotelId;
    }

    @ManyToOne
    @JoinColumn(name = "tipo_habitacion_id", referencedColumnName = "id", nullable = false)
    public TipoHabitacion getTipoHabitacionByTipoHabitacionId() {
        return tipoHabitacionByTipoHabitacionId;
    }

    public void setTipoHabitacionByTipoHabitacionId(TipoHabitacion tipoHabitacionByTipoHabitacionId) {
        this.tipoHabitacionByTipoHabitacionId = tipoHabitacionByTipoHabitacionId;
    }

    @ManyToOne
    @JoinColumn(name = "divisa_id", referencedColumnName = "id", nullable = false)
    public Divisa getDivisaByDivisaId() {
        return divisaByDivisaId;
    }

    public void setDivisaByDivisaId(Divisa divisaByDivisaId) {
        this.divisaByDivisaId = divisaByDivisaId;
    }
}
