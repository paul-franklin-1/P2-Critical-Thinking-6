import java.util.Comparator;

/**
 * Empowers the Student class to effectively sort the studentList array
 * on the basis of student name
 */
public class StudentComparatorName implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return CharSequence.compare(s1.getStudentName(), s2.getStudentName());
    }
}