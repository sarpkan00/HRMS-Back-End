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

import kodlamaio.HumanRMS.business.abstracts.CityService;
import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.entites.concretes.City;


@RestController
@RequestMapping("/api/city")
@CrossOrigin
public class CityController {
	
	private CityService cityService;
	
	@Autowired
	public CityController(CityService cityService) {
		super();
		this.cityService=cityService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody City city) {
		return this.cityService.add(city);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody City city) {
		return this.cityService.update(city);
	}
	
	@PostMapping("/delete")
	public Result delete(@PathVariable("id") int id) {
		return this.cityService.delete(id);
	}
	
	@GetMapping("/getById")
	public DataResult<City> findById(@PathVariable("id") int id){
		return this.cityService.findById(id);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<City>> getAll(){
		return this.cityService.getAll();
	}
}
