package domaine;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Regular_Employee extends Employee {

	private float salary;  
	private int bonus;  
}
