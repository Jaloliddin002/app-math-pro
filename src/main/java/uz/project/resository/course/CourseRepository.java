package uz.project.resository.course;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.project.entity.course.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
