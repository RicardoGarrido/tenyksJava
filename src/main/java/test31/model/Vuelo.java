package test31.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * Clase modelo que para los vuelos que recogeremos de la base de datos gracias
 * a la persistencia de hibernate
 */
@Entity
public class Vuelo {
    private Integer id;
    private Date fechaSalida;
    private Date fechaVuelta;
    private BigDecimal precio;
    private Ciudad ciudadByOrigenId;
    private Ciudad ciudadByDestinoId;
    private TipoVuelo tipoVueloByTipoVueloId;
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
    @Column(name = "fecha_salida", nullable = false)
    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    @Basic
    @Column(name = "fecha_vuelta", nullable = false)
    public Date getFechaVuelta() {
        return fechaVuelta;
    }

    public void setFechaVuelta(Date fechaVuelta) {
        this.fechaVuelta = fechaVuelta;
    }

    @Basic
    @Column(name = "precio", nullable = false, precision = 2)
    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vuelo vuelo = (Vuelo) o;

        if (id != null ? !id.equals(vuelo.id) : vuelo.id != null) return false;
        if (fechaSalida != null ? !fechaSalida.equals(vuelo.fechaSalida) : vuelo.fechaSalida != null) return false;
        if (fechaVuelta != null ? !fechaVuelta.equals(vuelo.fechaVuelta) : vuelo.fechaVuelta != null) return false;
        if (precio != null ? !precio.equals(vuelo.precio) : vuelo.precio != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (fechaSalida != null ? fechaSalida.hashCode() : 0);
        result = 31 * result + (fechaVuelta != null ? fechaVuelta.hashCode() : 0);
        result = 31 * result + (precio != null ? precio.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "origen_id", referencedColumnName = "id", nullable = false)
    public Ciudad getCiudadByOrigenId() {
        return ciudadByOrigenId;
    }

    public void setCiudadByOrigenId(Ciudad ciudadByOrigenId) {
        this.ciudadByOrigenId = ciudadByOrigenId;
    }

    @ManyToOne
    @JoinColumn(name = "destino_id", referencedColumnName = "id", nullable = false)
    public Ciudad getCiudadByDestinoId() {
        return ciudadByDestinoId;
    }

    public void setCiudadByDestinoId(Ciudad ciudadByDestinoId) {
        this.ciudadByDestinoId = ciudadByDestinoId;
    }

    @ManyToOne
    @JoinColumn(name = "tipo_vuelo_id", referencedColumnName = "id", nullable = false)
    public TipoVuelo getTipoVueloByTipoVueloId() {
        return tipoVueloByTipoVueloId;
    }

    public void setTipoVueloByTipoVueloId(TipoVuelo tipoVueloByTipoVueloId) {
        this.tipoVueloByTipoVueloId = tipoVueloByTipoVueloId;
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
