package domaine;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idetudiant;

    private String nometudiant;

    @ManyToOne
    @JoinColumn(name = "idfiliere")
    private Filiere filiere;
}
