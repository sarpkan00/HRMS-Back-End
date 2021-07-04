package kodlamaio.HumanRMS.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HumanRMS.business.abstracts.CvLinkService;
import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.entites.concretes.CvLink;

@RestController
@RequestMapping("/api/links")
@CrossOrigin
public class CvLinksController {
	
	private CvLinkService cvLinkService;

	public CvLinksController(CvLinkService cvLinkService) {
		super();
		this.cvLinkService = cvLinkService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CvLink cvLink) {
		return this.cvLinkService.add(cvLink);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody CvLink cvLink) {
		return this.update(cvLink);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id) {
		return this.cvLinkService.delete(id);
	}
	
	@GetMapping("/getById")
	public DataResult<CvLink> getById(@RequestParam("id") int id){
		return this.cvLinkService.getById(id);
	}
	
	@GetMapping("/getAllByJobseekerId")
	public DataResult<List<CvLink>> getAllByJobseekerId(@RequestParam int id){
		return this.cvLinkService.getAllByJobSeekerId(id);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<CvLink>> getAll(){
		return this.cvLinkService.getAll();
	}
}
