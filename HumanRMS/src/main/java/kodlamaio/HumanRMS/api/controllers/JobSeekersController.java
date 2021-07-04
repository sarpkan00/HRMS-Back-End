package kodlamaio.HumanRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HumanRMS.business.abstracts.JobSeekerService;
import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.entites.concretes.JobSeeker;

@RestController
@RequestMapping("/api/jobseekers")
@CrossOrigin
public class JobSeekersController {
	
	private JobSeekerService JobSeekerService;
	
	@Autowired
	public JobSeekersController(JobSeekerService jobSeekerService) {
		super();
		this.JobSeekerService = jobSeekerService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobSeeker jobSeeker){
		
		return this.JobSeekerService.add(jobSeeker);
	}
	
//	@PostMapping("/update")
//	public Result update(@RequestBody JobSeeker jobSeeker){
//		
//		return this.JobSeekerService.update(jobSeeker);
//	}
//	
//	@PostMapping("/delete")
//	public Result delete(@PathVariable("id") int id){
//		
//		return this.JobSeekerService.delete(id);
//	}
//	
//	@GetMapping("/getbyid")
//	public DataResult<JobSeeker> getById(@PathVariable("id") int id){
//		
//		return this.JobSeekerService.getById(id);
//	}
	
	@GetMapping("/getall")
	public DataResult<List<JobSeeker>> getAll() {
		
		return this.JobSeekerService.getAll();
	}
	

	
}
