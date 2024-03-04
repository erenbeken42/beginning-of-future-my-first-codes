package educationWebsiteExample.business;

import java.util.ArrayList;
import java.util.List;

import educationWebsiteExample.dataAccess.CourseDao;
import educationWebsiteExample.entities.Category;
import educationWebsiteExample.entities.Course;
import educationWebsiteExample.logging.Logger;

public class CourseSManager {
	private CourseDao courseDao;
	private List<String> allCourse = new ArrayList<>();
	private List<Logger> loggers;
	
	public CourseSManager (CourseDao courseaDao, List<Logger> loggers) {
		this.courseDao = courseaDao;
		this.loggers = loggers;
	}
	
	
	public void add (Course course) throws Exception {
		if (course.getUnitPrice()<0) {
			throw new Exception("unit price cannot be below 0");}
			
	
	else if (isCourseAlreadyAdded(course)) {throw new Exception("Course name cannot be reuse");
		
	}
	else {
		allCourse.add(course.getName());
        courseDao.add(course);
        System.out.println("Course Added : " + course.getName());
	}
	}
	    
		
		
	private boolean isCourseAlreadyAdded(Course course) {
	        for (String existingCourse : allCourse) {
	            if (existingCourse.equals(course.getName())) {
	                return true;
	            }
	        }
	        return false;
	    	
		
		
	}

}
