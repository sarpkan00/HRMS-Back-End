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

import kodlamaio.HumanRMS.business.abstracts.CvCoverLetterService;
import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.entites.concretes.CvCoverLetter;

@RestController
@RequestMapping("/api/coverLetters")
@CrossOrigin
public class CvCoverLettersController {
	
	private CvCoverLetterService coverLetterService;
	
	@Autowired
	public CvCoverLettersController(CvCoverLetterService coverLetterService) {
		super();
		this.coverLetterService = coverLetterService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CvCoverLetter cvCoverLetter){
		return this.coverLetterService.add(cvCoverLetter);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody CvCoverLetter cvCoverLetter){
		return this.coverLetterService.update(cvCoverLetter);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id){
		return this.coverLetterService.delete(id);
	}
	
	@GetMapping("/getById")
	public DataResult<CvCoverLetter> getById(@RequestParam("id") int id){
		return this.coverLetterService.getById(id);
	}
	
	
	@GetMapping("/getAll")
	public DataResult<List<CvCoverLetter>> getAll(){
		return this.coverLetterService.getAll();
	}
	

	
}	