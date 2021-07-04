package kodlamaio.HumanRMS.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HumanRMS.entites.concretes.CvLink;

public interface CvLinkDao extends JpaRepository<CvLink, Integer> {

	CvLink getById(int id);

	List<CvLink> getAllByJobSeeker_Id(int id);
}
