package domaine;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Contract_Employee extends Employee {

	 private float pay_per_hour;  
	 private String contract_duration;  
}
