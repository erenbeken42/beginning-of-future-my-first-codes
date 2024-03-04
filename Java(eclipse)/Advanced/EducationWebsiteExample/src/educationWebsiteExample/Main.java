package educationWebsiteExample;

import educationWebsiteExample.business.CategorySManager;
import educationWebsiteExample.business.CourseSManager;
import educationWebsiteExample.dataAccess.CategoryDao;
import educationWebsiteExample.dataAccess.HibernateDao;
import educationWebsiteExample.dataAccess.JdbcDao;
import educationWebsiteExample.entities.Category;
import educationWebsiteExample.entities.Course;
import educationWebsiteExample.logging.DatabaseLogger;
import educationWebsiteExample.logging.FileLogger;
import educationWebsiteExample.logging.Logger;
import educationWebsiteExample.entities.Instructor;
import educationWebsiteExample.business.InstructorSManager;

import java.util.List;

public class Main {

	public static void main(String[] args)throws Exception {
		Instructor instructor = new Instructor();
        instructor.setId(1);
        instructor.setName("Engin Demiroğ");

        Instructor instructor2 = new Instructor();
        instructor2.setId(2);
        instructor2.setName("Eren Beken");

        Logger[] loggers = {new DatabaseLogger(), new FileLogger()};
        Instructor[] allInstructor = {instructor, instructor2};

        InstructorSManager instructorManager = new InstructorSManager(new JdbcDao(), List.of(loggers));

        for (Instructor variable : allInstructor) {
            instructorManager.addInstructor(variable);
            instructorManager.getAllInstructor(variable);
        }
        
		
		
		Course course1 = new Course(1,".Net",110);
		Course course2 = new Course(2,".Net",250);
		
		Category category1 = new Category (1,"Frontend" );
		Category category2 = new Category (2,"Backend" );
		
		CategorySManager categoryManager = new CategorySManager(new HibernateDao(),List.of(loggers));
		categoryManager.add(category1);
		categoryManager.add(category2);
		
		CourseSManager courseManager = new CourseSManager(new JdbcDao(), List.of(loggers));
		courseManager.add(course1);
		courseManager.add(course2);
		
		
		
		

	}

}
