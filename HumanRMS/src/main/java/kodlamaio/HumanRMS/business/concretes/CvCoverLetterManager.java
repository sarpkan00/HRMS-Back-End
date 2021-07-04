package kodlamaio.HumanRMS.business.concretes;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HumanRMS.business.abstracts.CvCoverLetterService;
import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.core.utilities.results.SuccessDataResult;
import kodlamaio.HumanRMS.core.utilities.results.SuccessResult;
import kodlamaio.HumanRMS.dataAccess.abstracts.CvCoverLetterDao;
import kodlamaio.HumanRMS.entites.concretes.CvCoverLetter;


@Service
public class CvCoverLetterManager implements CvCoverLetterService {
	
	private CvCoverLetterDao cvCoverLetterDao;
	
	@Autowired // araştır
	public CvCoverLetterManager(CvCoverLetterDao cvCoverLetterDao) {
		super();
		this.cvCoverLetterDao = cvCoverLetterDao;
	}

	@Override
	public Result add(CvCoverLetter cvCoverLetter) {
		this.cvCoverLetterDao.save(cvCoverLetter);
		return new SuccessResult("Cover Letter has been added.");
	}

	@Override
	public Result update(CvCoverLetter cvCoverLetter) {
		this.cvCoverLetterDao.save(cvCoverLetter);
		return new SuccessResult("Cover Letter has been updated");
	}

	@Override
	public Result delete(int id) {
		this.cvCoverLetterDao.deleteById(id);;
		return new SuccessResult("Cover Letter has been deleted");
	}

	@Override
	public DataResult<CvCoverLetter> getById(int id) {
		return new SuccessDataResult<CvCoverLetter>(this.cvCoverLetterDao.getById(id));	
	}
	

	@Override
	public DataResult<List<CvCoverLetter>> getAll() {
		return new SuccessDataResult<List<CvCoverLetter>>(this.cvCoverLetterDao.findAll());
	}



}
