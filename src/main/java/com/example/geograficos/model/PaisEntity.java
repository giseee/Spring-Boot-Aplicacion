package com.example.geograficos.model;


import lombok.*;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table
public class PaisEntity  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_CPais")
    private Long id_CPais;

    private String imagen;

    private String denominacion;

    private Long cantidadDeHabitantes;

    private float superficieTotal;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="continente_id", insertable= false, updatable = false)
    private ContinenteEntity continente;

    @Column(name="Continente", nullable = false)
    private Long continenteId;

   @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "icon_pais",
            joinColumns = @JoinColumn(name= "pais_id"),
            inverseJoinColumns = @JoinColumn(name = "icon_id"))
    private List<IconEntity> icons= new ArrayList<>();
}
