package kodlamaio.HumanRMS.business.concretes;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.HumanRMS.business.abstracts.CvImageService;
import kodlamaio.HumanRMS.core.utilities.ImageUpload.ImageUploadService;
import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.core.utilities.results.SuccessDataResult;
import kodlamaio.HumanRMS.core.utilities.results.SuccessResult;
import kodlamaio.HumanRMS.dataAccess.abstracts.CvImageDao;
import kodlamaio.HumanRMS.entites.concretes.CvImage;

@Service
public class CvImageManager implements CvImageService{
	
	private CvImageDao cvImageDao;
	private ImageUploadService imageUploadService;
	
	@Autowired
	public CvImageManager(CvImageDao cvImageDao, ImageUploadService imageUploadService) {
		super();
		this.cvImageDao = cvImageDao;
		this.imageUploadService = imageUploadService;
	}

	
	
	@Override
	public Result add(CvImage cvImage, MultipartFile imageFile) {
		Map<String, String> uploadImage = this.imageUploadService.uploadImageFile(imageFile).getData();
		cvImage.setUrl(uploadImage.get("url"));
		this.cvImageDao.save(null);
		return new SuccessResult("Image has been added");
	
	}

	@Override
	public Result update(CvImage cvImage) {
		this.cvImageDao.save(cvImage);
		return new SuccessResult("Image has been updated");
	}

	@Override
	public Result delete(int id) {
		this.cvImageDao.deleteById(id);
		return new SuccessResult("Image has been deleted");
	}

	@Override
	public DataResult<CvImage> getById(int id) {
		return new SuccessDataResult<CvImage>(this.cvImageDao.getById(id));
	}

	@Override
	public DataResult<CvImage> getByJobSeekerId(int id) {
		return new SuccessDataResult<CvImage>(this.cvImageDao.getByJobSeeker_Id(id));
	}

	@Override
	public DataResult<List<CvImage>> getAll() {
		return new SuccessDataResult<List<CvImage>>(this.cvImageDao.findAll());
	}

}
