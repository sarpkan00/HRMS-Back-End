package kodlamaio.HumanRMS.business.abstracts;



import java.util.List;

import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.entites.concretes.CvForeignLanguage;

public interface CvForeignLanguageService {

	Result add(CvForeignLanguage cvForeignLanguage);
	Result update(CvForeignLanguage cvForeignLanguage);
	Result delete(int id);
	
	DataResult<CvForeignLanguage> getById(int id);
	DataResult<List<CvForeignLanguage>> getAllByJobSeekerId(int id);
	DataResult<List<CvForeignLanguage>> getAll();
}
