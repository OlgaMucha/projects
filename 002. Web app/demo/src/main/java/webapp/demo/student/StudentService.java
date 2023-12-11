package webapp.demo.student;

import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(1L, "Olga", "olga@gmail.com", LocalDate.of(2000, Month.AUGUST,5),21),
                new Student(1L, "Anna", "anna@gmail.com", LocalDate.of(2000, Month.MARCH,5),21)
        );
    }
}
