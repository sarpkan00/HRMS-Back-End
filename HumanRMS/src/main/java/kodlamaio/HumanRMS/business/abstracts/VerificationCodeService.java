package kodlamaio.HumanRMS.business.abstracts;

import java.util.List;



import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.entites.concretes.VerificationCode;


public interface VerificationCodeService {
	
	Result add(VerificationCode code);
	Result delete(VerificationCode code);
	Result update(VerificationCode code);
	
    DataResult<VerificationCode> getById(int id);
	DataResult<List<VerificationCode>> getAll();
}
