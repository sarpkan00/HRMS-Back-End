package kodlamaio.HumanRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HumanRMS.business.abstracts.UserService;
import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.core.utilities.results.SuccessDataResult;
import kodlamaio.HumanRMS.core.utilities.results.SuccessResult;
import kodlamaio.HumanRMS.dataAccess.abstracts.UserDao;
import kodlamaio.HumanRMS.entites.concretes.User;

@Service
public class UserManager implements UserService {
	
	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao=userDao;
	
	}
	

	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("User has been added");
	}


	@Override
	public Result update(User user) {
		this.userDao.save(user);
		return new SuccessResult("User has been updated.");
	}

	@Override
	public Result delete(int id) {
		this.userDao.deleteById(id);
		return new SuccessResult("User has been deleted.");
	}
	
	
	@Override
	public DataResult<User> getById(int id) {
		return new SuccessDataResult<User>(this.userDao.getById(id));
	}
	
	@Override
	public DataResult<List<User>> getAll() {
		return new SuccessDataResult<List<User>>(this.userDao.findAll());
	}


	@Override
	public DataResult<User> getUserByEmail(String email) {
		return new SuccessDataResult<User>(this.userDao.findUserByEmail(email));
	}

}
