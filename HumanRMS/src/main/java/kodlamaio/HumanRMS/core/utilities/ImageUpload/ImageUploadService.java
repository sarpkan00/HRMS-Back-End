package kodlamaio.HumanRMS.core.utilities.ImageUpload;

import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.HumanRMS.core.utilities.results.DataResult;

public interface ImageUploadService {
	
	DataResult<Map> uploadImageFile(MultipartFile imageFile);
}
