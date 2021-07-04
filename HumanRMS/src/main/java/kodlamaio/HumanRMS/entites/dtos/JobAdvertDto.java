package kodlamaio.HumanRMS.entites.dtos;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobAdvertDto {
	
	private String titleName;
	
	private String companyName;
	
	private String positionName;
	
	private int openPositionCount;
	
	private LocalDate createdDate; 
	 
	private LocalDate appealDeadline;
}
