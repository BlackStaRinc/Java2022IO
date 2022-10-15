package Java2022IO.KodlamaIOSimulateCourse.dataAccess;

import Java2022IO.KodlamaIOSimulateCourse.entities.Category;
import Java2022IO.KodlamaIOSimulateCourse.entities.Course;
import Java2022IO.KodlamaIOSimulateCourse.entities.Instructor;

public interface MainDao {
    void add(Category category);
    void add(Course course);
    void add(Instructor instructor);
    Course[] getAllCourses();
    Category[] getAllCategories();
}
