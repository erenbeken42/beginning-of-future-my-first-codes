package educationWebsiteExample.business;

import java.util.ArrayList;
import java.util.List;
import educationWebsiteExample.logging.Logger;
import educationWebsiteExample.dataAccess.InstructorDao;
import educationWebsiteExample.entities.Instructor;


public class InstructorSManager {
	private InstructorDao instructorDao;
    private List<Instructor> allInstructors = new ArrayList<>();
    private List<Logger> loggers;
    public InstructorSManager(InstructorDao instructorDao,List<Logger> loggers){
        this.instructorDao = instructorDao;
        this.loggers  =loggers;
    }
    public void addInstructor(Instructor instructor){
        instructorDao.addInstructor(instructor);
        allInstructors.add(instructor);
        System.out.println(instructor.getName());

        for (Logger allLoggers:loggers) {
            allLoggers.log(instructor.getName());
        }
    }
    public void getAllInstructor(Instructor instructor){
       instructorDao.getAllInstructor(instructor);
    }


}
