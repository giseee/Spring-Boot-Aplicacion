package com.example.geograficos.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.List;

@Entity
public class IconoGeografico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_icono")
    private long idIcono;
    @Column(name ="imagen")
    private String img;
    @Column
    private String denominacion;
    @Column
    private float altura;
    @Column(name= "fecha_de_creacion")
    @DateTimeFormat(pattern ="yyyy/mm/dd")
    private LocalTime fecha;
    @Column(name="ciudad_ubicacion")

    @ManyToMany
    @JoinColumn(name="id_CPais", insertable= false, updatable = false)
    private List<CiudadPais> ciudades;
    @Column
    private String historia;

    public long getIdcono() {
        return idIcono;
    }

    public void setIdcono(long idIcono) {
        this.idIcono = idIcono;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public LocalTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalTime fecha) {
        this.fecha = fecha;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public IconoGeografico(float altura) {
        this.altura = altura;
    }

}
