package kodlamaio.HumanRMS.entites.concretes;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@EqualsAndHashCode(callSuper=false)
@Data
@Entity
@PrimaryKeyJoinColumn(name = "user_id")
@NoArgsConstructor
@AllArgsConstructor
@Table(name  = "jobseekers")
public class JobSeeker extends User {
	
	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "national_id")
	private String nationalId;

	@Column(name = "date_of_birth")
	private LocalDate dateOfBirth;

	@Column(name = "is_verified")
	private boolean isVerified;
	
	
	
	//Relational Properties(tüm bilgileri jobseeker altında toplamak)
	
	
	@JsonIgnore
	@OneToMany(mappedBy = "jobSeeker")
	private List<CvCoverLetter> coverLetters;
	
	@OneToMany(mappedBy = "jobSeeker")
	@JsonIgnore
	private List<CvForeignLanguage> cvForeignLanguages;
	
	@OneToMany(mappedBy = "jobSeeker")
	@JsonIgnore
	private List<CvSchool> cvSchools;
	
	@OneToMany(mappedBy = "jobSeeker")
	@JsonIgnore
	private List<CvExperience> cvExperiences;	
	
	@OneToOne(mappedBy = "jobSeeker")
	@JsonIgnore
	private CvImage cvImage;
	
	@OneToMany(mappedBy = "jobSeeker")
	@JsonIgnore
	private List<CvLink> cvLinks;
	
	@OneToMany(mappedBy = "jobSeeker")
	@JsonIgnore
	private List<CvProgSkill> cvProgSkills;




}
