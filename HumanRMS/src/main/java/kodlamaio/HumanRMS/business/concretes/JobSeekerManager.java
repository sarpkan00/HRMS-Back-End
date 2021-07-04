package kodlamaio.HumanRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HumanRMS.business.abstracts.CvCoverLetterService;
import kodlamaio.HumanRMS.business.abstracts.CvExperienceService;
import kodlamaio.HumanRMS.business.abstracts.CvImageService;
import kodlamaio.HumanRMS.business.abstracts.CvLinkService;
import kodlamaio.HumanRMS.business.abstracts.CvProgSkillService;
import kodlamaio.HumanRMS.business.abstracts.CvSchoolService;
import kodlamaio.HumanRMS.business.abstracts.JobSeekerService;
import kodlamaio.HumanRMS.core.utilities.results.DataResult;

import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.core.utilities.results.SuccessDataResult;
import kodlamaio.HumanRMS.core.utilities.results.SuccessResult;
import kodlamaio.HumanRMS.dataAccess.abstracts.JobSeekerDao;
import kodlamaio.HumanRMS.entites.concretes.JobSeeker;
import kodlamaio.HumanRMS.entites.dtos.JobSeekerCvDto;

@Service
public class JobSeekerManager implements JobSeekerService {
	
	private JobSeekerDao jobSeekerDao;
	private CvCoverLetterService cvCoverLetterService;
	private CvLinkService cvLinkService;
	private CvExperienceService cvExperienceService;
	private CvImageService cvImageService;
	private CvProgSkillService cvProgSkillService;
	private CvSchoolService cvSchoolService;
	
	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao, CvCoverLetterService cvCoverLetterService,
			CvLinkService cvLinkService, CvExperienceService cvExperienceService, CvImageService cvImageService,
			CvProgSkillService cvProgSkillService, CvSchoolService cvSchoolService) {
		super();
		this.jobSeekerDao = jobSeekerDao;
		this.cvCoverLetterService = cvCoverLetterService;
		this.cvLinkService = cvLinkService;
		this.cvExperienceService = cvExperienceService;
		this.cvImageService = cvImageService;
		this.cvProgSkillService = cvProgSkillService;
		this.cvSchoolService = cvSchoolService;
	}

	
	
	@Override
	public Result add(JobSeeker jobSeeker) {
		jobSeekerDao.save(jobSeeker);
		return new SuccessResult("JobSeeker has been added");
	}

	@Override
	public Result update(JobSeeker jobSeeker) {
		this.jobSeekerDao.save(jobSeeker);
		return new SuccessResult("JobSeeker has been updated.");
	}

	@Override
	public Result delete(int id) {
		this.jobSeekerDao.deleteById(id);
		return new SuccessResult("JobSeeker has been deleted.");
	}

	@Override
	public DataResult<JobSeeker> getById(int id) {
		return new SuccessDataResult<JobSeeker>(this.jobSeekerDao.getById(id));
	}
	
	@Override
	public DataResult<JobSeeker> getJobseekerByNationalId(String nationalId) {
		return new SuccessDataResult<JobSeeker>(this.jobSeekerDao.findJobseekerByNationalId(nationalId));
	}

	
	@Override
	public DataResult<List<JobSeeker>> getAll() {
		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll(),"JobSeeker has been listed");
	}

	
	@Override
	public DataResult<JobSeekerCvDto> getCVById(int id) { //sonradan yenile
		JobSeeker jobSeeker = this.jobSeekerDao.getById(id);
		JobSeekerCvDto cv = new JobSeekerCvDto();
		cv.coverLetters = jobSeeker.getCoverLetters();
		cv.experiences = jobSeeker.getCvExperiences();
		cv.links = jobSeeker.getCvLinks();
		cv.schools = jobSeeker.getCvSchools();
		cv.image = jobSeeker.getCvImage();
		cv.progSkills = jobSeeker.getCvProgSkills();
		return new SuccessDataResult<JobSeekerCvDto>(cv);
	
	}

	

}
