package modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "generos")
public class generos {

    @Id
    @GeneratedValue
    @Column(name = "id_genero")
    private int idGenero;
    @Column(name = "decripcion_genero")
    private String descripcionGenero;

}
