package kodlamaio.HumanRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HumanRMS.entites.concretes.User;

//Base classımız jpaRepository Birinci parametre classımız ikinci parametre id Tipi
//Crud operasyonları hazır olarak geliyor

public interface UserDao extends JpaRepository<User, Integer> {
	
	User findUserByEmail(String email);
}
