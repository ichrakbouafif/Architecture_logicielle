package domaine;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity  
@DiscriminatorValue("reg_emp")  

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Regular_Employee extends Employee {

	private float salary;  
	private int bonus;  
}
