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
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.HumanRMS.business.abstracts.CvImageService;
import kodlamaio.HumanRMS.business.abstracts.JobSeekerService;
import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.entites.concretes.CvImage;
import kodlamaio.HumanRMS.entites.concretes.JobSeeker;

@RestController
@RequestMapping("/api/images")
@CrossOrigin
public class CvImagesController {
	
	private CvImageService cvImageService;
	private JobSeekerService jobSeekerService;
	
	@Autowired
	public CvImagesController(CvImageService cvImageService, JobSeekerService jobSeekerService) {
		super();
		this.cvImageService = cvImageService;
		this.jobSeekerService = jobSeekerService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestParam(value="id") int id,@RequestParam(value="imageFile") MultipartFile multipartFile) {
		JobSeeker jobSeeker = this.jobSeekerService.getById(id).getData();
		CvImage cvImage = new CvImage();
		cvImage.setJobSeeker(jobSeeker);
		return this.cvImageService.add(cvImage, multipartFile);
	
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody CvImage cvImage) {
		return this.cvImageService.update(cvImage);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id) {
		return this.cvImageService.delete(id);
	
	}
	
	@GetMapping("/getById")
	public DataResult<CvImage> getById(@RequestParam("id") int id){
		return this.cvImageService.getById(id);
	}
	
	@GetMapping("/getByJobseekerId")
	public DataResult<CvImage> getByJobseekerId(@RequestParam("id") int id){
		return this.cvImageService.getByJobSeekerId(id);
	}
	
	@GetMapping("/getall")
	public DataResult<List<CvImage>> getAll(){
		return this.cvImageService.getAll();
	}
}
