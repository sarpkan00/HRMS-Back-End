package kodlamaio.HumanRMS.business.concretes;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HumanRMS.business.abstracts.CvForeignLanguageService;
import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.core.utilities.results.SuccessDataResult;
import kodlamaio.HumanRMS.core.utilities.results.SuccessResult;
import kodlamaio.HumanRMS.dataAccess.abstracts.CvForeignLanguageDao;
import kodlamaio.HumanRMS.entites.concretes.CvForeignLanguage;

@Service
public class CvForeignLanguageManager implements CvForeignLanguageService {
	
	private CvForeignLanguageDao cvForeignLanguage;
	
	@Autowired
	public CvForeignLanguageManager(CvForeignLanguageDao cvForeignLanguage) {
		super();
		this.cvForeignLanguage = cvForeignLanguage;
	}

	@Override
	public Result add(CvForeignLanguage cvForeignLanguage) {
		this.cvForeignLanguage.save(cvForeignLanguage);
		return new SuccessResult("Foreign Language has been added");
	}

	@Override
	public Result update(CvForeignLanguage cvForeignLanguage) {
		this.cvForeignLanguage.save(cvForeignLanguage);
		return new SuccessResult("Foreign Language has been updated");
	}

	@Override
	public Result delete(int id) {
		this.cvForeignLanguage.deleteById(id);
		return new SuccessResult("Foreign Language has been deleted");
	}

	@Override
	public DataResult<CvForeignLanguage> getById(int id) {
		return new SuccessDataResult<CvForeignLanguage>(this.cvForeignLanguage.getById(id));
	}
	
	@Override
	public DataResult<List<CvForeignLanguage>> getAllByJobSeekerId(int id) {
		return new SuccessDataResult<List<CvForeignLanguage>>(this.cvForeignLanguage.getAllByJobSeeker_Id(id));
	}

	@Override
	public DataResult<List<CvForeignLanguage>> getAll() {
		return new SuccessDataResult<List<CvForeignLanguage>>(this.cvForeignLanguage.findAll());
	}

	

}
