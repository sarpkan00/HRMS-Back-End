package kodlamaio.HumanRMS.entites.concretes;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "job_positions")
public class JobPosition {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "job_title")
	private String jobTitle;

	@Column(name = "created_at")
	private LocalDate createdDate;

	@Column(name = "is_active")
	private boolean isActive;

	@Column(name = "is_deleted")
	private boolean isDeleted;
	
	//Relational Properties
	
	@OneToMany(mappedBy = "jobPosition")
	private List<JobAdvert> jobAdverts; 
}
