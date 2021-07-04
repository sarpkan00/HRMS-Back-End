package kodlamaio.HumanRMS.entites.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper=false)
@Data
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "user_id")
@Table(name = "employers")
@Entity
public class Employer extends User {
	
	@Column(name = "company_name")
	private String companyName;

	@Column(name = "website")
	private String website;

	@Column(name = "phone_number")
	private String phoneNumber;

	@Column(name = "is_verified")
	private boolean isVerified;
	
	//Relational Properties
	
	@OneToMany(mappedBy = "employer")
	private List<JobAdvert> jobAdverts;
}
	

