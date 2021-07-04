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

import kodlamaio.HumanRMS.business.abstracts.EmployeeService;
import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.entites.concretes.Employee;


@RestController
@RequestMapping("/employees")
@CrossOrigin
public class EmployeesController {
	
	private EmployeeService employeeService;
	
	@Autowired
	public EmployeesController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
//	@PostMapping("/add")
//	public Result add(@RequestBody Employee employee) {
//		
//		return this.employeeService.add(employee);
//	}
//	
//	@PostMapping("/update")
//	public Result update(@RequestBody Employee employee) {
//		
//		return this.employeeService.update(employee);
//	}
//	
//	@PostMapping("/delete")
//	public Result delete(@PathVariable("id") int id) {
//		return this.employeeService.delete(id);
//	}
//	
	@GetMapping("/getbyid")
	public DataResult<Employee> getById(@PathVariable("id") int id){
		
		return this.employeeService.getById(id);
	}
	
	@GetMapping("/getall")
	public DataResult<List<Employee>> getall(){
		
		return this.employeeService.getAll();
	}
}
