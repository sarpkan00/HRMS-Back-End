package kodlamaio.HumanRMS.business.concretes;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HumanRMS.business.abstracts.CvProgSkillService;
import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.core.utilities.results.SuccessDataResult;
import kodlamaio.HumanRMS.core.utilities.results.SuccessResult;
import kodlamaio.HumanRMS.dataAccess.abstracts.CvProgSkillDao;
import kodlamaio.HumanRMS.entites.concretes.CvProgSkill;

@Service
public class CvProgSkillManager implements CvProgSkillService {
	
	private CvProgSkillDao cvProgSkillDao;
	
	@Autowired
	public CvProgSkillManager(CvProgSkillDao cvProgSkillDao) {
		super();
		this.cvProgSkillDao = cvProgSkillDao;
	}

	@Override
	public Result add(CvProgSkill cvProgSkill) {
		this.cvProgSkillDao.save(cvProgSkill);
		return new SuccessResult("Programming Skill has ben added");
	}

	@Override
	public Result update(CvProgSkill cvProgSkill) {
		this.cvProgSkillDao.save(cvProgSkill);
		return new SuccessResult("Programing Skill has ben updated");
	}

	@Override
	public Result delete(int id) {
		this.cvProgSkillDao.deleteById(id);
		return new SuccessResult("Programing Skill has ben deleted");
	}

	@Override
	public DataResult<CvProgSkill> getById(int id) {
		return new SuccessDataResult<CvProgSkill>(this.cvProgSkillDao.getById(id));
	}
	
	@Override
	public DataResult<List<CvProgSkill>> getByJobSeekerId(int id) {
		return new SuccessDataResult<List<CvProgSkill>>(this.cvProgSkillDao.getAllByJobSeeker_Id(id));
	}

	@Override
	public DataResult<List<CvProgSkill>> getAll() {
		return new SuccessDataResult<List<CvProgSkill>>(this.cvProgSkillDao.findAll());
	}


}
