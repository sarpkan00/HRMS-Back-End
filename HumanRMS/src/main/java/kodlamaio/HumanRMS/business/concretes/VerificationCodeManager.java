package kodlamaio.HumanRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HumanRMS.business.abstracts.VerificationCodeService;
import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.core.utilities.results.SuccessDataResult;
import kodlamaio.HumanRMS.core.utilities.results.SuccessResult;
import kodlamaio.HumanRMS.dataAccess.abstracts.VerificationCodeDao;
import kodlamaio.HumanRMS.entites.concretes.VerificationCode;

@Service
public class VerificationCodeManager implements VerificationCodeService{
	
	 private VerificationCodeDao verificationCodeDao;
	
	 @Autowired
	 public VerificationCodeManager(VerificationCodeDao verificationCodeDao) {
		 	super();
		 	this.verificationCodeDao = verificationCodeDao;
	}

	@Override
	public Result add(VerificationCode code) {
		this.verificationCodeDao.save(code);
		return new SuccessResult("Code has been saved.");
	}

	@Override
	public Result delete(VerificationCode code) {
		this.verificationCodeDao.delete(code);
		return new SuccessResult("Code has been deleted.");
	}

	@Override
	public Result update(VerificationCode code) {
		this.verificationCodeDao.save(code);
		return new SuccessResult("Code has been updated.");
	}

	@Override
	public DataResult<VerificationCode> getById(int id) {
		return new SuccessDataResult<VerificationCode>(this.verificationCodeDao.getById(id));
	}

	@Override
	public DataResult<List<VerificationCode>> getAll() {
		return new SuccessDataResult<List<VerificationCode>>(this.verificationCodeDao.findAll());
	}

}
