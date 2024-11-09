package domaine;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity  
@DiscriminatorValue("Email")  

@Getter @Setter @AllArgsConstructor @NoArgsConstructor

public class EmailNotification extends Notification{
	 private String emailAdress; 

}


