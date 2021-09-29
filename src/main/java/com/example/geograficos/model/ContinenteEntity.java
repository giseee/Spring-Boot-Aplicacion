package com.example.geograficos.model;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="continentes")
public class Continente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_continente")
    private Long idContinente;
    @Column
    private String imagen;
    @Column
    private String denominacion;
    @OneToMany(mappedBy = "continente")
    private  List<PaisEntity> ciudades;

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Long getIdContinente() {
        return idContinente;
    }

    public void setIdContinente(Long idContinente) {
        this.idContinente = idContinente;
    }
}
