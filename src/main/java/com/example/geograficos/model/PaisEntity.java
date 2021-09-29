package com.example.geograficos.model;


import javax.persistence.*;
import java.util.List;

@Entity
public class CiudadPais {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_CPais")
    private Long id_CPais;
    @Column
    private String imagen;
    @Column
    private String denominacion;
    @Column
    private Integer cantidadDeHabitantes;
    @Column
    private float superficieTotal;
    @Column(name = "iconos_asociados")
    @ManyToMany
    @JoinColumn(name="id_icono", insertable= false, updatable = false)
    private List<IconEntity> iconos;

    public Continente getContinente() {
        return continente;
    }

    public void setContinente(Continente continente) {
        this.continente = continente;
    }

    @ManyToOne
    @JoinColumn(name="id_Continente", insertable= false, updatable = false)
    private Continente continente;

    public void setId_CPais(Long id_CPais) {
        this.id_CPais = id_CPais;
    }


    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public Integer getCantidadDeHabitantes() {
        return cantidadDeHabitantes;
    }

    public void setCantidadDeHabitantes(Integer cantidadDeHabitantes) {
        this.cantidadDeHabitantes = cantidadDeHabitantes;
    }


    public Long getId_CPais() {
        return id_CPais;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public float getSuperficieTotal() {
        return superficieTotal;
    }

    public void setSuperficieTotal(float superficieTotal) {
        this.superficieTotal = superficieTotal;
    }
}
