package kodlamaio.HumanRMS.business.concretes;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import kodlamaio.HumanRMS.business.abstracts.JobAdvertService;
import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.ErrorResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.core.utilities.results.SuccessDataResult;
import kodlamaio.HumanRMS.core.utilities.results.SuccessResult;
import kodlamaio.HumanRMS.dataAccess.abstracts.JobAdvertDao;
import kodlamaio.HumanRMS.entites.concretes.JobAdvert;

@Service
public class JobAdvertManager implements JobAdvertService {
	
	private JobAdvertDao jobAdvertDao;
	
	
	@Autowired
	 public JobAdvertManager(JobAdvertDao jobAdvertDao) {
		super();
		this.jobAdvertDao= jobAdvertDao;
	}

	@Override
	public Result add(JobAdvert jobAdvert) {
		if(!checkIfNullField(jobAdvert)) {
			return new ErrorResult("You entered incomplete information. Please fill in the blanks");
		}
		
		this.jobAdvertDao.save(jobAdvert);
		return new SuccessResult("Job Advert has been added");
	}

	private boolean checkIfNullField(JobAdvert jobAdvert) {
		if(jobAdvert.getCity() != null && jobAdvert.getJobPosition() != null && jobAdvert.getOpenPositionCount() != 0 &&
				jobAdvert.getDescription() != null) {
			return true;
		}
		
		return false;
	}

	@Override
	public Result update(JobAdvert jobAdvert) {
		this.jobAdvertDao.save(jobAdvert);
		return new SuccessResult("Job Advert has been updated");
	}

	@Override
	public Result delete(int id) {
		this.jobAdvertDao.deleteById(id);
		return new SuccessResult("Job Advert has been deleted");
	}
	
	@Override
	public Result changeOpenOrClose(int id) {
		if(findById(id) == null) {
			return new ErrorResult("There is no such job advert");
		}
		
		if(findById(id).getData().isOpen() == false) {
			return new ErrorResult("There job advert is already closed.");
		}
		JobAdvert jobAdvert = findById(id).getData();
		jobAdvert.setOpen(false);
		update(jobAdvert);
		return new SuccessResult("Job advert has been successfully closed.");
	}


	@Override
	public DataResult<JobAdvert> findById(int id) {
		
		return new SuccessDataResult<JobAdvert>(this.jobAdvertDao.getById(id));
	}

	@Override
	public DataResult<List<JobAdvert>> getAll() {
		
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.findAll());
	}

	@Override
	public DataResult<List<JobAdvert>> getAllOpenJobAdvertList() {
		
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.getAllOpenJobAdvertList());
	}

	@Override
	public DataResult<List<JobAdvert>> getAllOpenJobAdvertByEmployer(int id) {
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.getAllOpenJobAdvertByEmployer(id));
	}

	@Override
	public DataResult<List<JobAdvert>> findAllByOrderByPublishedAt() {
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.findAllByOrderByPublishedAt());
	}

	@Override
	public DataResult<List<JobAdvert>> getAll(int pageNo, int pageSize) {
		Pageable pageable = PageRequest.of(pageNo-1, pageSize);
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.findAll(pageable).getContent());
	}

	


}
