package educationWebsiteExample.dataAccess;

import educationWebsiteExample.entities.Category;
import educationWebsiteExample.entities.Course;
import educationWebsiteExample.entities.Instructor;

public class HibernateDao implements CourseDao,CategoryDao,InstructorDao{

	@Override
	public void add(Category category) {
		System.out.println("Add Category With Hibernate");
		
	}

	@Override
	public void add(Course course) {
		System.out.println("Add Course With Hibernate");
		
	}

	@Override
	public void addInstructor(Instructor insInstructor) {
		System.out.println("Add Instructor With Hibernate");
		
	}

	@Override
	public void getAllInstructor(Instructor instructor) {
		System.out.println("All instructors are brought with Hibernate!");
		
	}

}
