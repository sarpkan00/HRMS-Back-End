package kodlamaio.HumanRMS.business.abstracts;



import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.entites.concretes.CvImage;

public interface CvImageService {

	Result add(CvImage cvImage,MultipartFile imageFile);
	Result update(CvImage cvImage);
	Result delete(int id);
	
	DataResult<CvImage> getById(int id);
	DataResult<CvImage> getByJobSeekerId(int id);
	DataResult<List<CvImage>> getAll();
	

}
