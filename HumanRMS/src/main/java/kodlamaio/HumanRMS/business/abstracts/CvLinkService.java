package kodlamaio.HumanRMS.business.abstracts;



import java.util.List;

import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.entites.concretes.CvLink;

public interface CvLinkService {
	
	Result add(CvLink cvLink);
	Result update(CvLink cvLink);
	Result delete(int id);
	
	DataResult<CvLink> getById(int id);
	DataResult<List<CvLink>> getAllByJobSeekerId(int id);
	DataResult<List<CvLink>> getAll();

}
