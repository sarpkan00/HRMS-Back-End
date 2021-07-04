package kodlamaio.HumanRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HumanRMS.business.abstracts.CvSchoolService;
import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.entites.concretes.CvSchool;

@RestController
@RequestMapping("/api/schools")
@CrossOrigin
public class CvSchoolsController {

	private CvSchoolService cvSchoolService;
	
	@Autowired
	public CvSchoolsController(CvSchoolService cvSchoolService) {
		super();
		this.cvSchoolService = cvSchoolService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CvSchool cvSchool){
		return this.cvSchoolService.add(cvSchool);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody CvSchool cvSchool){
		return this.cvSchoolService.update(cvSchool);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id){
		return this.cvSchoolService.delete(id);
	}
	
	@GetMapping("/getById")
	public DataResult<CvSchool> getById(@RequestParam("id") int id){
		return this.cvSchoolService.getById(id);
	}
	
	@GetMapping("/getAllByJobseekerId")
	public DataResult<List<CvSchool>> getAllByJobseekerId(@RequestParam("id") int id){
		return this.cvSchoolService.getByJobSeekerId(id);
	}
	
	@GetMapping("/getAllByJobseekerIdOrderByEndAtDesc")
	public DataResult<List<CvSchool>> getAllByJobseekerIdOrderByEndAtDesc(@RequestParam("id") int id){
		return this.cvSchoolService.getAllByJobSeekerIdOrderByEndAtDesc(id);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<CvSchool>> getAll(){
		return this.cvSchoolService.getAll();
	}
	
	
	
	


}
