package modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "tipo_documento")
public class tipoDocumento {
    @Id
    @GeneratedValue
    @Column(name = "id_tipo_documento")
    private int idTipoDocumento;




}
