import java.util.Comparator;

public class StudentComparatorName implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return CharSequence.compare(s1.getStudentName(), s2.getStudentName());
    }
}