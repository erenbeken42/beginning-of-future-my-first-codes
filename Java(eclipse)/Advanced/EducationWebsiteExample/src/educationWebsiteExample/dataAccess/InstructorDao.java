package educationWebsiteExample.dataAccess;

import educationWebsiteExample.entities.Instructor;

public interface InstructorDao {
	void getAllInstructor(Instructor instructor);
    void addInstructor(Instructor instructor);

}
