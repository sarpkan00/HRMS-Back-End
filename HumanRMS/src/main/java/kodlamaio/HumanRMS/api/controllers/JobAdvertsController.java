package kodlamaio.HumanRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HumanRMS.business.abstracts.JobAdvertService;
import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.entites.concretes.JobAdvert;

@RestController
@RequestMapping("/api/jobadvert")
@CrossOrigin
public class JobAdvertsController {
	
	private JobAdvertService jobAdvertService;
	
	@Autowired
	public JobAdvertsController(JobAdvertService jobAdvertService) {
		super();
		this.jobAdvertService=jobAdvertService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvert jobAdvert) {
		return this.jobAdvertService.add(jobAdvert);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody JobAdvert jobAdvert) {
		return this.jobAdvertService.update(jobAdvert);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestBody int id) {
		return this.jobAdvertService.delete(id);
	}
	
	@PostMapping("/changeOpenOrClose")
	public Result changeOpenOrClose(int id){
		return this.jobAdvertService.changeOpenOrClose(id);
	}
	
	@GetMapping("/getbyid")
	public DataResult<JobAdvert> findById(@PathVariable("id") int id){
		return this.jobAdvertService.findById(id);
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobAdvert>> getAll(){
		return this.jobAdvertService.getAll();
	}
	
	@GetMapping("/getOpenJobAdvertList")
	public DataResult<List<JobAdvert>> getOpenJobAdvertList(){
		return this.jobAdvertService.getAllOpenJobAdvertList();
	}
	
	@GetMapping("/getAllOpenJobAdvertByEmployer")
	public DataResult<List<JobAdvert>> getAllOpenJobAdvertByEmployer(int id){
		return this.jobAdvertService.getAllOpenJobAdvertByEmployer(id);
	}
	
	@GetMapping("/findAllByOrderByPublishedAt")
	public DataResult<List<JobAdvert>> findAllByOrderByPublishedAt(){
		return this.jobAdvertService.findAllByOrderByPublishedAt();
	}
	
}
