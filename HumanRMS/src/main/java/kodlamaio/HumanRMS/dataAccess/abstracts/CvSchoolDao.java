package kodlamaio.HumanRMS.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HumanRMS.entites.concretes.CvSchool;

public interface CvSchoolDao extends JpaRepository<CvSchool, Integer> {
	CvSchool getById(int id);
	
	List<CvSchool> getAllByJobSeeker_IdOrderByEndAtDesc(int id);
	
	List<CvSchool> getAllByJobSeeker_Id(int id);
}
