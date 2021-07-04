package kodlamaio.HumanRMS.entites.dtos;

import java.util.List;

import kodlamaio.HumanRMS.entites.concretes.CvCoverLetter;
import kodlamaio.HumanRMS.entites.concretes.CvExperience;
import kodlamaio.HumanRMS.entites.concretes.CvForeignLanguage;
import kodlamaio.HumanRMS.entites.concretes.CvImage;
import kodlamaio.HumanRMS.entites.concretes.CvLink;
import kodlamaio.HumanRMS.entites.concretes.CvProgSkill;
import kodlamaio.HumanRMS.entites.concretes.CvSchool;
import kodlamaio.HumanRMS.entites.concretes.JobSeeker;



public class JobSeekerCvDto {
	
	
	public JobSeeker jobSeeker;
	
	public CvImage image;
	
	public List<CvCoverLetter> coverLetters;
	
	public List<CvForeignLanguage> foreignLanguages;
	
	public List<CvExperience> experiences;
	
	public List<CvLink> links;
	
	public List<CvSchool> schools;
	
	public List<CvProgSkill> progSkills;
	

}
