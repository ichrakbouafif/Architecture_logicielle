package domaine;
import lombok.*;

@Data @AllArgsConstructor @NoArgsConstructor
public class Account {
      private Integer accountId;
      private String acc_number;

      private Employee employee;   
}
