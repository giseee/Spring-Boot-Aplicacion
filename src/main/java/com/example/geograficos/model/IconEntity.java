package com.example.geograficos.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "iconos")
public class IconEntity  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_icono")
    private long idIcono;

    private String imagen;

    @Column(name= "fecha_de_creacion")
    @DateTimeFormat(pattern ="yyyy/mm/dd")
    private LocalTime fecha;

    private String denominacion;

    private float altura;

    private String historia;

    @Column(name="ciudad_ubicacion")
    @ManyToMany(mappedBy = "icons", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<PaisEntity> paises= new ArrayList<>();

}
