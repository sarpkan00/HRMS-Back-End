package kodlamaio.HumanRMS.business.abstracts;



import java.util.List;

import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.entites.concretes.CvCoverLetter;


public interface CvCoverLetterService {
	
	Result add(CvCoverLetter cvCoverLetter);
	Result update(CvCoverLetter cvCoverLetter);
	Result delete(int id);
	
	DataResult<CvCoverLetter> getById(int id);
	DataResult<List<CvCoverLetter>> getAll();

}
