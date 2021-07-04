package kodlamaio.HumanRMS.business.abstracts;

import java.util.List;


import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.entites.concretes.JobAdvert;

public interface JobAdvertService {
	
	Result add(JobAdvert jobAdvert);
	Result update(JobAdvert jobAdvert);
	Result delete(int id);
	Result changeOpenOrClose(int id);
	
	DataResult<JobAdvert> findById(int id);	
	DataResult<List<JobAdvert>> getAll();	
	DataResult<List<JobAdvert>> getAllOpenJobAdvertList();
	DataResult<List<JobAdvert>> getAllOpenJobAdvertByEmployer(int id);
	DataResult<List<JobAdvert>> findAllByOrderByPublishedAt();
	DataResult<List<JobAdvert>> getAll(int pageNo, int pageSize);
	
	

}
