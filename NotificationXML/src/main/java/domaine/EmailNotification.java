package domaine;
import lombok.*;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class EmailNotification extends Notification {
	private String emailAdress ;
}
