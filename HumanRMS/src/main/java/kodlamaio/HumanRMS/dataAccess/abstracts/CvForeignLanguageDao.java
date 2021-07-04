package kodlamaio.HumanRMS.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HumanRMS.entites.concretes.CvForeignLanguage;

public interface CvForeignLanguageDao extends JpaRepository<CvForeignLanguage, Integer> {
	
	CvForeignLanguage getById(int id);
	
	List<CvForeignLanguage> getAllByJobSeeker_Id(int id);
}
