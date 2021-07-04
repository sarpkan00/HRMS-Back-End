package kodlamaio.HumanRMS.entites.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="job_adverts")
public class JobAdvert {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="description")
	private String description;
	
	@Column(name="open_position_count")
	private int openPositionCount;
	
	@Column(name="deadline")
	private LocalDate deadline;
	
	@Column(name="is_open")
	private boolean isOpen;
	
	@Column(name="created_at")
	private LocalDate createAt;
	
	@Column(name="is_active")
	private boolean isActive;
	
	@Column(name="is_deleted")
	private boolean isDeleted;
	
	@Column(name="published_at")
	private LocalDate publishedAt;
	
	@Column(name="salary_max")
	private int salaryMax;
	
	@Column(name="salary_min")
	private int salaryMin;
	
	//Relational Properties
	
	@ManyToOne
	@JoinColumn(name="employer_id")
	private Employer employer;
	
	@JoinColumn(name="city_id")
	@ManyToOne
	private City city;
	
	//Relational Properties
	
	@ManyToOne
	@JoinColumn(name="job_position_id")
	private JobPosition jobPosition;

}
