package kodlamaio.HumanRMS.business.concretes;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HumanRMS.business.abstracts.CvExperienceService;
import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.core.utilities.results.SuccessDataResult;
import kodlamaio.HumanRMS.core.utilities.results.SuccessResult;
import kodlamaio.HumanRMS.dataAccess.abstracts.CvExperienceDao;
import kodlamaio.HumanRMS.entites.concretes.CvExperience;

@Service
public class CvExperienceManager implements CvExperienceService {
	
	private CvExperienceDao cvExperineceDao;

	@Autowired
	public CvExperienceManager(CvExperienceDao cvExperineceDao) {
		super();
		this.cvExperineceDao = cvExperineceDao;
	}

	@Override
	public Result add(CvExperience cvExperience) {
		this.cvExperineceDao.save(cvExperience);
		return new SuccessResult("Experience has been added");
	}

	@Override
	public Result update(CvExperience cvExperience) {
		this.cvExperineceDao.save(cvExperience);
		return new SuccessResult("Experience has been updated");
	}

	@Override
	public Result delete(int id) {
		this.cvExperineceDao.deleteById(id);
		return new SuccessResult("Experience has been deleted");
	}

	@Override
	public DataResult<CvExperience> getById(int id) {
		return new SuccessDataResult<CvExperience>(this.cvExperineceDao.getById(id));
	}
	
	@Override
	public DataResult<List<CvExperience>> getAllByJobSeekerId(int id) {
	
		return new SuccessDataResult<List<CvExperience>>(this.cvExperineceDao.getAllByJobSeeker_Id(id));
	}

	@Override
	public DataResult<List<CvExperience>> getAllByJobSeekerIdOrderByEndAtDesc(int id) {
		return new SuccessDataResult<List<CvExperience>>(this.cvExperineceDao.getAllByJobSeeker_IdOrderByEndAtDesc(id));
	}

	@Override
	public DataResult<List<CvExperience>> getAll() {
		return new SuccessDataResult<List<CvExperience>>(this.cvExperineceDao.findAll());
	}

	

}
