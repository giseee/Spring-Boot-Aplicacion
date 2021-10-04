package com.example.geograficos.model;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name="continentes")
public class ContinenteEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_continente")
    private Long idContinente;
    @Column
    private String imagen;
    @Column
    private String denominacion;
    @OneToMany(mappedBy = "continente")
    private  List<PaisEntity> paises;


}
