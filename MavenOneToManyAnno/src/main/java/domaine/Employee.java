package domaine;

import java.util.Set;
import javax.persistence.*;
import lombok.*;

@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Table(name = "EMPLOYEE")
public class Employee { 

	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(name = "ID")
	  private Integer employeeId;
	  
	  @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
	  private Set<Account> accounts;


      private String first_name;
      private String last_name;
      private String email;
      
}
