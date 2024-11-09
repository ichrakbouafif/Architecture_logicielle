package domaine;
import lombok.*;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class SmsNotification extends Notification{
	private String phoneNumber;

}
