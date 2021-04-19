package marcosmulinari.minhaagenda.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "Agenda")
public class AgendaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contato")
    private Integer id;

    @Column(nullable = false, length = 85)
    private String nome;

    @Column(nullable = false, length = 1)
    private String sexo;

    @Column(nullable = false, length = 13)
    private String telefone;

    @Column(nullable = false, length = 85)
    private String email;

}
