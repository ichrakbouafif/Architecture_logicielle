package domaine;

import javax.persistence.*;
import lombok.*;

@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Table(name = "ACCOUNT")
public class Account {

      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      @Column(name = "IDACCOUNT")
      private Integer accountId;

      private String acc_number;
      
      @ManyToOne 
      @JoinColumn(name = "idemployee") 
      private Employee employee;  
}

