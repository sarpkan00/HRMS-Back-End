package kodlamaio.HumanRMS.business.abstracts;

import java.util.List;

import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.entites.concretes.JobPosition;




public interface JobPositionService {
	
	Result add(JobPosition jobPosition);
	Result update(JobPosition jobPosition);
	Result delete(int id);
	
	DataResult<JobPosition> getById(int id);
	DataResult<List<JobPosition>> getAll();
	DataResult<JobPosition> getJobByTitle(String title);
	

}
