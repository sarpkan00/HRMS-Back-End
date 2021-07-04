package kodlamaio.HumanRMS.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HumanRMS.business.abstracts.AuthService;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.entites.concretes.Employer;
import kodlamaio.HumanRMS.entites.concretes.JobSeeker;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin
public class AuthController {
	
	private AuthService authService;
	
	@Autowired
	public AuthController(AuthService authService) {
		super();
		this.authService = authService;
	}
	
	@PostMapping("/registerEmployer")
	public Result registerEmployer(@RequestBody Employer employer, String confirmPassword) {
		
		return this.authService.registerEmployer(employer, confirmPassword);
	}
	
	@PostMapping("/registerJobseeker")
	public Result registerJobSeeker(@RequestBody JobSeeker jobSeeker, String confirmPassword) {
		
		return this.authService.registerJobSeeker(jobSeeker, confirmPassword);
	}
	

}
