	package kodlamaio.HumanRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HumanRMS.business.abstracts.EmployerService;
import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.core.utilities.results.SuccessDataResult;
import kodlamaio.HumanRMS.core.utilities.results.SuccessResult;
import kodlamaio.HumanRMS.dataAccess.abstracts.EmployerDao;
import kodlamaio.HumanRMS.entites.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {
	
	private EmployerDao employerDao;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public Result add(Employer employer) {
		
		employerDao.save(employer);
		return new SuccessResult("Employer has been added.");
	}

	@Override
	public Result update(Employer employer) {
		this.employerDao.save(employer);
		return new SuccessResult("Employer has been updated.");
	}

	@Override
	public Result delete(int id) {
		this.employerDao.deleteById(id);
		return new SuccessResult("Employer has been deleted.");
	}
	
	@Override
	public DataResult<Employer> getById(int id) {
		return new SuccessDataResult<Employer>(this.employerDao.getById(id));
	}
	
	@Override
	public DataResult<List<Employer>> getAll() {
		
		return new SuccessDataResult<List<Employer>>(employerDao.findAll());
	}

	

}
