package kodlamaio.HumanRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HumanRMS.entites.concretes.CvCoverLetter;

public interface CvCoverLetterDao extends JpaRepository<CvCoverLetter, Integer> {
	
	CvCoverLetter getById(int id);
}
