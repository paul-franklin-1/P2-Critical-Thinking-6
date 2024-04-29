import java.util.Comparator;

/**
 * Empowers the Student class to effectively sort the studentList array
 * on the basis of Roll Number
 */
public class StudentComparatorRollno implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getRollno(), s2.getRollno());
    }
}
