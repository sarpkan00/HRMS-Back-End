package kodlamaio.HumanRMS.business.abstracts;



import java.util.List;

import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.entites.concretes.CvExperience;

public interface CvExperienceService {

	Result add(CvExperience cvExperience);
	Result update(CvExperience cvExperience);
	Result delete(int id);
	
	DataResult<CvExperience> getById(int id);
	DataResult<List<CvExperience>> getAll();
	DataResult<List<CvExperience>> getAllByJobSeekerId(int id);
	DataResult<List<CvExperience>> getAllByJobSeekerIdOrderByEndAtDesc(int id);
	
}
