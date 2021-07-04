package kodlamaio.HumanRMS.core.utilities.verification;

public interface VerificationService {
	
	void sendLink(String email);
	
	String sendCode(); 

}
