package kodlamaio.HumanRMS.business.abstracts;

import java.util.List;

import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.entites.concretes.JobSeeker;
import kodlamaio.HumanRMS.entites.dtos.JobSeekerCvDto;

public interface JobSeekerService {
	
	Result add(JobSeeker jobSeeker);
	Result update(JobSeeker jobseeker);
	Result delete(int id);
	
	DataResult<JobSeeker> getById(int id);
	DataResult<List<JobSeeker>> getAll();
	DataResult<JobSeeker> getJobseekerByNationalId(String nationalId);
	DataResult<JobSeekerCvDto> getCVById(int id);
	

}
