package Java2022IO.KodlamaIOSimulateCourse;

import Java2022IO.KodlamaIOSimulateCourse.business.MainManager;
import Java2022IO.KodlamaIOSimulateCourse.dataAccess.*;
import Java2022IO.KodlamaIOSimulateCourse.entities.*;
import Java2022IO.oopWithNLayeredApp.core.logging.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Course course = new Course(1,"Php",100);
        Course course2 = new Course(1,"Java",-50);
        Category category = new Category(1, "Software");
        Instructor instructor = new Instructor(1, "Hamza","AAO");
        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};

        MainManager mainManager = new MainManager(new JdbcDao(),loggers);

        mainManager.add(course);
        mainManager.add(category);
        mainManager.add(instructor);

        /* Get Exception Message */
        mainManager.add(course2);
        
       
       
    }
    
}

