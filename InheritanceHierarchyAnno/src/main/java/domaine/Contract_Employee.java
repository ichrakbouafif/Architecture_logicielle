package domaine;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity  
@DiscriminatorValue("con_emp")  

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Contract_Employee extends Employee {

	 private float pay_per_hour;  
	 private String contract_duration;  
}

