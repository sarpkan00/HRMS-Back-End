package kodlamaio.HumanRMS.business.abstracts;

import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.entites.concretes.Employer;
import kodlamaio.HumanRMS.entites.concretes.JobSeeker;

public interface AuthService {
	
	Result registerEmployer(Employer employer, String confirmPassword);
	Result registerJobSeeker(JobSeeker jobSeeker, String confirmPassword);
}
	