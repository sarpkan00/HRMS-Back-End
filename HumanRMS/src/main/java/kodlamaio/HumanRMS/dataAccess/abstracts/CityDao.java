package kodlamaio.HumanRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;


import kodlamaio.HumanRMS.entites.concretes.City;

public interface CityDao extends JpaRepository<City, Integer> {
	City getById(int id);
	
	
}
