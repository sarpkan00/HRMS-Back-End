package kodlamaio.HumanRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import kodlamaio.HumanRMS.business.abstracts.CvSchoolService;
import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.core.utilities.results.SuccessDataResult;
import kodlamaio.HumanRMS.core.utilities.results.SuccessResult;
import kodlamaio.HumanRMS.dataAccess.abstracts.CvSchoolDao;
import kodlamaio.HumanRMS.entites.concretes.CvSchool;

@Service
public class CvSchoolManager implements CvSchoolService {
	
	private CvSchoolDao cvSchoolDao;
	
	@Autowired
	public CvSchoolManager(CvSchoolDao cvSchoolDao) {
		super();
		this.cvSchoolDao = cvSchoolDao;
	}

	@Override
	public Result add(CvSchool cvSchool) {
		this.cvSchoolDao.save(cvSchool);
		return new SuccessResult("School has been added");
	}

	@Override
	public Result update(CvSchool cvSchool) {
		this.cvSchoolDao.save(cvSchool);
		return new SuccessResult("School has ben updated");
	}

	@Override
	public Result delete(int id) {
		this.cvSchoolDao.deleteById(id);
		return new SuccessResult("School has ben deleted");
	}

	@Override
	public DataResult<CvSchool> getById(int id) {
		return new SuccessDataResult<CvSchool>(this.cvSchoolDao.getById(id));
	}

	@Override
	public DataResult<List<CvSchool>> getAll(){
		return new SuccessDataResult<List<CvSchool>>(this.cvSchoolDao.findAll());
	}
	
	@Override
	public DataResult<List<CvSchool>> getByJobSeekerId(int id) {
		return new SuccessDataResult<List<CvSchool>>(this.cvSchoolDao.getAllByJobSeeker_Id(id));
	}

	@Override
	public DataResult<List<CvSchool>> getAllByJobSeekerIdOrderByEndAtDesc(int id) {
		return new SuccessDataResult<List<CvSchool>>(this.cvSchoolDao.getAllByJobSeeker_IdOrderByEndAtDesc(id));
	}



}
