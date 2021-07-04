package kodlamaio.HumanRMS.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HumanRMS.entites.concretes.CvProgSkill;

public interface CvProgSkillDao extends JpaRepository<CvProgSkill, Integer> {
	
	CvProgSkill getById(int id);
	
	List<CvProgSkill> getAllByJobSeeker_Id(int id);
}
