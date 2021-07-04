package kodlamaio.HumanRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HumanRMS.entites.concretes.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {
	Employee getById(int id);
}
