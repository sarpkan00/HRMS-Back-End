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

import kodlamaio.HumanRMS.business.abstracts.CvProgSkillService;
import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.entites.concretes.CvProgSkill;

@RestController
@RequestMapping("/api/progSkills")
@CrossOrigin
public class CvProgSkillsController {
	
	private CvProgSkillService cvProgSkillService;
	
	@Autowired
	public CvProgSkillsController(CvProgSkillService cvProgSkillService) {
		super();
		this.cvProgSkillService = cvProgSkillService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CvProgSkill cvProgSkill){
		return this.cvProgSkillService.add(cvProgSkill);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody CvProgSkill cvProgSkill){
		return this.cvProgSkillService.update(cvProgSkill);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id){
		return this.cvProgSkillService.delete(id);
	}
	
	@GetMapping("/getById")
	public DataResult<CvProgSkill> getById(@RequestParam("id") int id){
		return this.cvProgSkillService.getById(id);
	}
	
	@GetMapping("/getByAllJobSeekerId")
	public DataResult<List<CvProgSkill>> getByAllJobSeekerId(@RequestParam("id") int id){
		return this.cvProgSkillService.getByJobSeekerId(id);
	}
	
	
	@GetMapping("/getAll")
	public DataResult<List<CvProgSkill>> getAll(){
		return this.cvProgSkillService.getAll();
	}

}
