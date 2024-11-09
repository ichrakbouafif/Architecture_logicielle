package domaine;

import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Filiere {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idfiliere;

    private String nomfiliere;

    @OneToMany(mappedBy = "filiere")
    private List<Etudiant> etudiants;
}