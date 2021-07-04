package kodlamaio.HumanRMS.business.abstracts;

import java.util.List;

import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.entites.concretes.Employer;

public interface EmployerService {
	
	Result add(Employer employer);
	Result update(Employer employer);
	Result delete(int id);
	
	DataResult<Employer> getById(int id);
	DataResult<List<Employer>> getAll();
	

}
