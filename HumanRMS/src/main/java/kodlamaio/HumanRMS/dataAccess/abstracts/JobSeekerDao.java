package kodlamaio.HumanRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import kodlamaio.HumanRMS.entites.concretes.JobSeeker;

public interface JobSeekerDao extends JpaRepository<JobSeeker, Integer> {
	
	JobSeeker findJobseekerByNationalId(String nationalId);
	
	JobSeeker getById(int id);
}
