package domaine;
import java.sql.Date;

import lombok.*;

@Data @AllArgsConstructor @NoArgsConstructor
public class Notification {
	private int id;
	private String firstname;
	private String lastname;
	private Date createdOn;

}
