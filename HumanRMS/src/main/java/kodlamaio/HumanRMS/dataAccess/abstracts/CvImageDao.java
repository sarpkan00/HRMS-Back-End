package kodlamaio.HumanRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HumanRMS.entites.concretes.CvImage;

public interface CvImageDao extends JpaRepository<CvImage, Integer>{
	
	CvImage getById(int id);
	
	CvImage getByJobSeeker_Id(int id);


}
