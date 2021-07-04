package kodlamaio.HumanRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HumanRMS.entites.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer> {
	Employer getById(int id);
}
