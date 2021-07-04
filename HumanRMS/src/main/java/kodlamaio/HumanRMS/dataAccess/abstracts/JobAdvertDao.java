package kodlamaio.HumanRMS.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.HumanRMS.entites.concretes.JobAdvert;

public interface JobAdvertDao extends JpaRepository<JobAdvert, Integer>  {
	
	JobAdvert getById(int id);
	
	@Query("From JobAdvert where isOpen=true")
	List<JobAdvert> getAllOpenJobAdvertList();
	
	@Query("From JobAdvert where isOpen=true Order By publishedAt")
	List<JobAdvert> getAllOpenJobAdvertByEmployer(int id);
	
	@Query("From JobAdvert where isOpen = true and employer_id =:id")
	List<JobAdvert> findAllByOrderByPublishedAt();
	
	
}
