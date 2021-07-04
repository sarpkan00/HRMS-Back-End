package kodlamaio.HumanRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HumanRMS.business.abstracts.EmployeeService;
import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.core.utilities.results.SuccessDataResult;
import kodlamaio.HumanRMS.core.utilities.results.SuccessResult;
import kodlamaio.HumanRMS.dataAccess.abstracts.EmployeeDao;
import kodlamaio.HumanRMS.entites.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService {
	
	private EmployeeDao employeeDao;
	
	@Autowired
	public EmployeeManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}


	@Override
	public Result add(Employee employee) {
		employeeDao.save(employee);
		return new SuccessResult("Employee has been added.");
	}

	@Override
		public Result update(Employee employee) {
		this.employeeDao.save(employee);
		return new SuccessResult("Employee has been updated.");
	}

	@Override
	public Result delete(int id) {
		this.employeeDao.deleteById(id);
		return new SuccessResult("Employee has been deleted.");
	}

	
	@Override
	public DataResult<Employee> getById(int id) {
		return new SuccessDataResult<Employee>(this.employeeDao.findById(id).orElse(null));
	}
	
	@Override
	public DataResult<List<Employee>> getAll() {
		return new SuccessDataResult<List<Employee>>(employeeDao.findAll());
	}


}
