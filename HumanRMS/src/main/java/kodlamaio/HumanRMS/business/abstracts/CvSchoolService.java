package kodlamaio.HumanRMS.business.abstracts;



import java.util.List;

import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.entites.concretes.CvSchool;

public interface CvSchoolService {
	
	Result add(CvSchool cvSchool);
	Result update(CvSchool cvSchool);
	Result delete(int id);
	
	DataResult<CvSchool> getById(int id);
	DataResult<List<CvSchool>> getByJobSeekerId(int id);
	DataResult<List<CvSchool>> getAllByJobSeekerIdOrderByEndAtDesc(int id);
	DataResult<List<CvSchool>> getAll();
	

}
