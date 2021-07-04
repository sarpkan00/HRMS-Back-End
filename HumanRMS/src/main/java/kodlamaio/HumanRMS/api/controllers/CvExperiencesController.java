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

import kodlamaio.HumanRMS.business.abstracts.CvExperienceService;
import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.entites.concretes.CvExperience;

@RestController
@RequestMapping("/api/experiences")
@CrossOrigin
public class CvExperiencesController {
	
	private CvExperienceService cvExperienceService;
	
	@Autowired
	public CvExperiencesController(CvExperienceService cvExperienceService) {
		super();
		this.cvExperienceService = cvExperienceService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CvExperience cvExperience) {
		return this.cvExperienceService.add(cvExperience);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody CvExperience cvExperience) {
		return this.cvExperienceService.update(cvExperience);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id) {
		return this.cvExperienceService.delete(id);
	}
	
	@GetMapping("/getById")
	public DataResult<CvExperience> getById(@RequestParam("id") int id){
		return this.cvExperienceService.getById(id);
	}
	
	@GetMapping("/getByAllJobSeekerId")
	public DataResult<List<CvExperience>> getByAllJobSeekerId(@RequestParam("id") int id){
		return this.cvExperienceService.getAllByJobSeekerId(id);
	}
	
	@GetMapping("/ getAllByJobseekerIdOrderByEndAtDesc")
	public DataResult<List<CvExperience>> getAllByJobSeekerIdOrderByEndAtDesc(@RequestParam("id") int id){
		return this.cvExperienceService.getAllByJobSeekerIdOrderByEndAtDesc(id);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<CvExperience>> getAll(){
		return this.cvExperienceService.getAll();
				
	}
}	
