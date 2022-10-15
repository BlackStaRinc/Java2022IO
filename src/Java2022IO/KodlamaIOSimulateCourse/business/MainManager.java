package Java2022IO.KodlamaIOSimulateCourse.business;

import Java2022IO.KodlamaIOSimulateCourse.dataAccess.MainDao;
import Java2022IO.KodlamaIOSimulateCourse.entities.Category;
import Java2022IO.KodlamaIOSimulateCourse.entities.Course;
import Java2022IO.KodlamaIOSimulateCourse.entities.Instructor;
import Java2022IO.oopWithNLayeredApp.core.logging.Logger;

public class MainManager {
    private MainDao mainDao;
    private Logger[] loggers;
    
    public MainManager(MainDao mainDao, Logger[] loggers) {
        this.mainDao = mainDao;
        this.loggers = loggers;
    }

    public void add(Course course) throws Exception{
       
        if (courseNameControl(course) ) {
            throw new Exception("Aynı İsimde Yeni Bir Kurs Açılamaz.");
		}
        else if (course.getUnitPrice() < 0) {
            throw new Exception("Kurs Fiyatı 0 dan Küçük Olamaz");
        }

		mainDao.add(course);

		for (Logger logger : loggers) {
			logger.log(course.getCourseName());
		}

	}
        
    public boolean courseNameControl(Course course) throws Exception {

		Course[] coursesNames = mainDao.getAllCourses();

		for (Course courseName : coursesNames) {
			if (courseName.getCourseName().equalsIgnoreCase(course.getCourseName())) {
				return true;
			}
		}
		return false;

	}
    public void add(Category category) throws Exception{

        if (categoryNameControl(category) ) {
            throw new Exception("Aynı İsimde Yeni Bir Kategori Açılamaz.");
		}

        mainDao.add(category);
        for (Logger logger : loggers) {
                logger.log(category.getCategoryName());
        }
    }
    public boolean categoryNameControl(Category category) throws Exception {

		Category[] categoriesNames = mainDao.getAllCategories();

		for (Category categoryName : categoriesNames) {
			if (categoryName.getCategoryName().equalsIgnoreCase(category.getCategoryName())) {
				return true;
			}
		}
		return false;

	}
    public void add(Instructor instructor) throws Exception{

        mainDao.add(instructor);
        for (Logger logger : loggers) {
                logger.log(instructor.getName()+ " " +instructor.getSurName());
        }
    }
    
}
