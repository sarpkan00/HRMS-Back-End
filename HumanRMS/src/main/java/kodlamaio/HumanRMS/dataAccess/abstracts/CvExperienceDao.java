package kodlamaio.HumanRMS.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import kodlamaio.HumanRMS.entites.concretes.CvExperience;

public interface CvExperienceDao extends JpaRepository<CvExperience, Integer> {
	
	CvExperience getById(int id);
	
	List<CvExperience> getAllByJobSeeker_Id(int id);
	
	List<CvExperience> getAllByJobSeeker_IdOrderByEndAtDesc(int id);
	
	

}

