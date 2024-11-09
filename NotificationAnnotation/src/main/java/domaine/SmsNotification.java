package domaine;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity  
@DiscriminatorValue("Sms")  

@Getter @Setter @AllArgsConstructor @NoArgsConstructor

public class SmsNotification extends Notification{
	 private String phoneNumber; 


}




