package kodlamaio.HumanRMS.business.abstracts;


import java.util.List;

import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.entites.concretes.CvProgSkill;

public interface CvProgSkillService {
	
	Result add(CvProgSkill cvProgSkill);
	Result update(CvProgSkill cvProgSkill);
	Result delete(int id);
	
	DataResult<CvProgSkill> getById(int id);
	DataResult<List<CvProgSkill>> getByJobSeekerId(int id);
	DataResult<List<CvProgSkill>> getAll();

}
