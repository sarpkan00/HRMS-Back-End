package kodlamaio.HumanRMS.business.abstracts;

import java.util.List;

import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.entites.concretes.Employee;


public interface EmployeeService {
	
	Result add(Employee employee);
	Result update(Employee employee);
	Result delete(int id);
	
	DataResult<Employee> getById(int id);
	DataResult<List<Employee>> getAll();


}
