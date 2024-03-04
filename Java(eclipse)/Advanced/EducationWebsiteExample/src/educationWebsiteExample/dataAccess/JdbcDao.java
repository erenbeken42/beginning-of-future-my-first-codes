package educationWebsiteExample.dataAccess;

import educationWebsiteExample.entities.Category;
import educationWebsiteExample.entities.Course;
import educationWebsiteExample.entities.Instructor;

public class JdbcDao implements CategoryDao,CourseDao,InstructorDao {

	@Override
	public void addInstructor(Instructor insInstructor) {
		System.out.println("Add Instructor With Jdbc");
		
	}

	@Override
	public void add(Course course) {
		System.out.println("Add Course With Jdbc");
		
	}

	@Override
	public void add(Category category) {
		System.out.println("Add Category With Jdbc");
		
	}

	@Override
	public void getAllInstructor(Instructor instructor) {
		System.out.println("All instructors are brought with Jdbc!");
		
	}

}
