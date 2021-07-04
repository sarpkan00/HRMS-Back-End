package kodlamaio.HumanRMS.business.abstracts;

import java.util.List;

import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.entites.concretes.User;

public interface UserService {
	
	Result add(User user);
	Result update(User user);
	Result delete(int id);
	
	DataResult<User> getById(int id);
	DataResult<List<User>> getAll();
	DataResult<User> getUserByEmail(String email);

}
