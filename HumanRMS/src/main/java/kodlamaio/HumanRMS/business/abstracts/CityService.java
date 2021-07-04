package kodlamaio.HumanRMS.business.abstracts;

import java.util.List;

import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.entites.concretes.City;

public interface CityService {
	
	Result add(City city);
	Result update(City city);
	Result delete(int id);
	
	DataResult<City> findById(int id);
	DataResult<List<City>> getAll();

}
