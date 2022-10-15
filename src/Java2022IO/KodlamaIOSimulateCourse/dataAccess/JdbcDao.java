package Java2022IO.KodlamaIOSimulateCourse.dataAccess;

import Java2022IO.KodlamaIOSimulateCourse.entities.Category;
import Java2022IO.KodlamaIOSimulateCourse.entities.Course;
import Java2022IO.KodlamaIOSimulateCourse.entities.Instructor;

public class JdbcDao implements MainDao{

    @Override
    public void add(Category category) {
        System.out.println(category.getCategoryName()+ " Bilgieri JDBC ile Veritabanına Eklendi...");
    }

    @Override
    public void add(Course course) {
        System.out.println(course.getCourseName() + " Bilgieri JDBC ile Veritabanına Eklendi...");
    }
	
    @Override
    public void add(Instructor instructor) {
        System.out.println(instructor.getName() + " " + instructor.getSurName() + " Bilgieri JDBC ile Veritabanına Eklendi...");
    }

    @Override
	public Course[] getAllCourses() { 

		Course course1 = new Course();
		course1.setCourseName("C#");

		Course course2 = new Course();
		course2.setCourseName("Java");
		
		Course[] courses = new Course[] {course1,course2};

		return courses;
	}

    @Override
	public Category[] getAllCategories() {

		Category category1 = new Category();
		category1.setCategoryName("Backend");

		Category category2 = new Category();
		category2.setCategoryName("Frontend");
		
		Category[] courses = new Category[] {category1,category2};

		return courses;
	}
    
}
