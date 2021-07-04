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
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cv_experiences")
public class CvExperience {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "working_place")
	private String workingPlace;
	
	@Column(name = "position")
	private String position;
	
	@Column(name = "start_at")
	private LocalDate startAt;
	
	@Column(name = "end_at", nullable = true)
	private LocalDate endAt;
	
	@JsonIgnore
	@Column(name= "created_at", columnDefinition = "Date defult CURRENT_DATE")
	private LocalDate createdAt = LocalDate.now();
	
	@JsonIgnore
	@Column(name= "is_active", columnDefinition = "boolean default true")
	private boolean isActive = true;
	
	@JsonIgnore
	@Column(name= "is_deleted", columnDefinition = "boolean default false")
	private boolean isDeleted = false;
	
	//Relational Properties
	
	@ManyToOne()
	@JoinColumn(name = "jobseeker_id")
	private JobSeeker jobSeeker;
}
