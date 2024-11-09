package domaine;
import java.util.Set;
import lombok.*;

@Data @AllArgsConstructor @NoArgsConstructor
public class Employee { 
      private Integer employeeId;
      private String first_name;
      private String last_name;
      private String email; 
 
      private Set<Account> accounts;    
}
